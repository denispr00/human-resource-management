package com.pro.denis.hrm.rest.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pro.denis.hrm.domain.security.User;
import com.pro.denis.hrm.rest.security.JwtAuthenticationRequest;
import com.pro.denis.hrm.rest.security.JwtAuthenticationResponse;
import com.pro.denis.hrm.rest.security.JwtTokenUtil;
import com.pro.denis.hrm.rest.security.JwtUser;
import com.pro.denis.hrm.service.HrmException;
import com.pro.denis.hrm.service.security.UserService;


@RestController
@RequestMapping(path = "/auth")
@PropertySource(value = {"classpath:application.properties"})
public class AuthenticationRestController {

    @Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserDetailsService userDetailsService;

	@Autowired
	private UserService userService;

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(
            @RequestBody JwtAuthenticationRequest authenticationRequest)
            throws AuthenticationException {

        System.out.println("login called");
        // Perform the security
        final Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),
                        authenticationRequest.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);

        // Reload password post-security so we can generate token
        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(authenticationRequest.getUsername());
        final String token = jwtTokenUtil.generateToken(userDetails);

        // Return the token
        return ResponseEntity.ok(new JwtAuthenticationResponse(token));
    }

	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public ResponseEntity<User> register(@RequestBody User user) throws Exception {
		User existingUser = userService.findByUsername(user.getUsername());
		
		if (existingUser != null) {
			throw new HrmException(HttpStatus.CONTINUE, "user already exists", "json user already");
		}

		return ResponseEntity.status(HttpStatus.OK).body(userService.add(user));

	}

    @RequestMapping(path = "/refresh", method = RequestMethod.GET)
    public ResponseEntity<?> refreshAndGetAuthenticationToken(HttpServletRequest request) {
        String token = request.getHeader(tokenHeader);
        String username = jwtTokenUtil.getUsernameFromToken(token);
        JwtUser user = (JwtUser) userDetailsService.loadUserByUsername(username);

        // if (jwtTokenUtil.canTokenBeRefreshed(token,
        // user.getLastPasswordResetDate())) {
        String refreshedToken = jwtTokenUtil.refreshToken(token);
        return ResponseEntity.ok(new JwtAuthenticationResponse(refreshedToken));
		/*} else {
			return ResponseEntity.badRequest().body(null);
		}*/
    }


}

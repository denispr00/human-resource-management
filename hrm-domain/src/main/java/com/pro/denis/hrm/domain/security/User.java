package com.pro.denis.hrm.domain.security;

import javax.persistence.*;

import com.pro.denis.hrm.domain.AbstractDomain;

import java.util.List;

@Entity
@Table(name = "user")
public class User extends AbstractDomain {

	private String username;

	private String password;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	private String email;

	private Boolean enabled;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user",fetch = FetchType.EAGER)
	/*@JoinTable(
			name = "authority",
			joinColumns = {@JoinColumn(name = "user_id",referencedColumnName= "id")}
	)*/
	private List<Authority> authorities;


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Authority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<Authority> authorities) {
		this.authorities = authorities;
	}
}

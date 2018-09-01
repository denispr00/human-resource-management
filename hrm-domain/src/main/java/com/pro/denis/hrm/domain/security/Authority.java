package com.pro.denis.hrm.domain.security;

import com.pro.denis.hrm.domain.AbstractDomain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "authority")
public class Authority implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    String authority;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

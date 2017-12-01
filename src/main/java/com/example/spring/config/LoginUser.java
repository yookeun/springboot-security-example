package com.example.spring.config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.user.model.User;

import lombok.Data;


@Data
public class LoginUser implements UserDetails {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2099368762276970614L;
	
		
    private String username;
    private String password;
    private String role;
    private List<String> roles;
    
    
    public LoginUser(User user) {   	
    	
    	username = user.getUsername();
    	password = user.getPassword();
    	role = user.getRole();
    }	
	
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	
	@Override
	public boolean isEnabled() {		
		return true;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> auth = new ArrayList<>();
		for (String role: roles) {
			auth.add(new SimpleGrantedAuthority(role));
		}
		return auth;
	}

}

package com.example.spring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.user.model.User;
import com.example.user.service.UserService;


/**
 * Created by yookeun on 2017. 9. 5..
 */
@Service
public class UserDetailService implements UserDetailsService {
	
	@Autowired
	private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {      

    	User user = userService.selectUserForLogin(username);
    	if (user == null) {
    		throw new UsernameNotFoundException("UserIdNotFound [" + username + "]");
    	}    	
    	LoginUser loginUser = createUser(user);    	 
        return loginUser;
    }
    
    private LoginUser createUser(User user) {
    	LoginUser loginUser = new LoginUser(user);
    	loginUser.setRoles(Arrays.asList(loginUser.getRole()));
    	return loginUser;
    }
    
}

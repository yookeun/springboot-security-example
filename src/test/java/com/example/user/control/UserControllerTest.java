package com.example.user.control;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserControllerTest {

	@Test
	public void test() {
		PasswordEncoder password = new BCryptPasswordEncoder();
		String pwd = password.encode(new String("1234"));
		System.out.println(pwd);
	}

}

package com.fakelook.main.authenticationProvider;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import com.fakelook.main.domain.LoginDetails;
import com.fakelook.main.repository.UserRepository;

public class UserAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	UserRepository userRepository;

	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		String username = authentication.getName();
		String password = authentication.getCredentials().toString();
		LoginDetails loginDetails = userRepository.findByEmail(username);
		if (loginDetails.getEmail().equals(username)) {

			System.out.println("Authenticated");
			return new UsernamePasswordAuthenticationToken(username, password, new ArrayList<>());

		}
		return authentication;

	}

	@Override
	public boolean supports(Class<?> authentication) {

		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}

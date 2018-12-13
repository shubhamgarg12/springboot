package com.fakelook.main.service.serviceImpl;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.fakelook.main.domain.LoginDetails;
import com.fakelook.main.service.UserDetails;

@Transactional
@Service
public class UserDetailsImpl implements UserDetails {

	@Autowired
	BCryptPasswordEncoder passwordEncoder;

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public LoginDetails register(String email, String password) {

		LoginDetails loginDetails = new LoginDetails();
		loginDetails.setEmail(email);
		loginDetails.setPassword(passwordEncoder.encode(password));
		loginDetails.setCreatedDate(new Date());
		entityManager.persist(loginDetails);
		return loginDetails;
	}

}

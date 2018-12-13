package com.fakelook.main.service;

import com.fakelook.main.domain.LoginDetails;

public interface UserDetails {

	public LoginDetails register(String email, String password);
}

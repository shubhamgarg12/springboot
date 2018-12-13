package com.fakelook.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fakelook.main.domain.LoginDetails;
import com.fakelook.main.exceptionhandler.UserException;
import com.fakelook.main.request.LoginRequest;
import com.fakelook.main.service.serviceImpl.UserDetailsImpl;

@Controller
public class UserController {

	@Autowired
	UserDetailsImpl userDetailsImpl;

	@RequestMapping(value = "/shubham", method = RequestMethod.POST, produces = "application/json")
	public LoginDetails registration(@RequestBody LoginRequest loginRequest){

		LoginDetails loginDetails = null;
		System.out.println("Entered controller");
		if (loginRequest.getEmail().isEmpty() || loginRequest.getPassword().isEmpty()) {

			 throw new UserException("Invalid data");
		} else {
			
			loginDetails = userDetailsImpl.register(loginRequest.getEmail(), loginRequest.getPassword());

		}

		return loginDetails;

	}
	@RequestMapping(value = "/")
	public ModelAndView homescreen() {
		
	ModelAndView mv = new ModelAndView();
		mv.setViewName("Home");
		return mv;
		
	}
	@GetMapping(value = "/home")
	public ModelAndView homescreen1() {
		
	ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
		
	}

}

package com.fakelook.main.controller;

import javax.servlet.http.Cookie;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping(value="/",method= RequestMethod.GET,produces="application/json")
	public String demo() {
		
		
		
		
		return "shubham";
	}
	
}

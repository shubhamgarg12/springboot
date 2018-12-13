package com.fakelook.main.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class AspectExample {

	@Before(value = "execution(* com.fakelook.main.service.*.*(..))")
	public void print() {
		
		System.out.println("before");
		
	}
	
}

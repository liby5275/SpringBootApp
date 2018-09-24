package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserLoginAndLoggingAspect {
	
	Logger logger = LoggerFactory.getLogger(UserLoginAndLoggingAspect.class);
	
	
	@Before("execution(* com.example.demo.controller.*.*(..))")
	public void before(JoinPoint joinPoint){
		//Advice
		logger.info(" Check for user access ");
		logger.info(" Allowed execution for {}", joinPoint);
	}
	
	@Before("execution(* com.example.demo.service.impl.*.*(..))")
	public void loggerAspectBeforeAtServiceLayer(JoinPoint jointpoint) {
		logger.info("Starting at the service layer for {} with argument {}", jointpoint,jointpoint.getArgs());
	}
	
	@After("execution(* com.example.demo.service.impl.*.*(..))")
	public void loggerAspectAfterAtServiceLayer(JoinPoint jointpoint) {
		logger.info("Ending at the service layer for {}", jointpoint);
	}
	
	@Before("execution(* com.example.demo.repository.impl.*.*(..))")
	public void loggerAspectBeforeAtRepoLayer(JoinPoint jointpoint) {
		logger.info("Starting at the service layer for {}", jointpoint);
	}
	
	@After("execution(* com.example.demo.repository.impl.*.*(..))")
	public void loggerAspectAfterAtRepoLayer(JoinPoint jointpoint) {
		logger.info("Ending at the service layer for {}", jointpoint);
	}

}

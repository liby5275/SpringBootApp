package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BasicOperationService;

@RestController
@RequestMapping(value= "/v1")
public class BasicOpertaionController {
	
	Logger logger = LoggerFactory.getLogger(BasicOpertaionController.class);
	
	@Autowired
	private BasicOperationService basicOperationService;
	
	@RequestMapping(value = "/test",method= RequestMethod.GET)
	public String testMethod() {
		
		logger.info("inside controller Basic Oprtation");
		return basicOperationService.getTestData(); 
	}

}

package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/v1")
public class BasicOpertaionController {
	
	@RequestMapping(value = "/test",method= RequestMethod.GET)
	public String testMethod() {
		return null;
	}

}

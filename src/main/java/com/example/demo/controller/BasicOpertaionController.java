package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MainResultDto;
import com.example.demo.responsebuilder.BasicOperationsResponseBuilder;
import com.example.demo.service.BasicOperationService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value= "/v1")
@Api(value = "Basic Opration Controller", description = "End points to do basic operations")
public class BasicOpertaionController {	
	
	Logger logger = LoggerFactory.getLogger(BasicOpertaionController.class);
	
	@Autowired
	private BasicOperationService basicOperationService;
	
	@Autowired
	private BasicOperationsResponseBuilder responseBuilder;
	
	
	@ApiOperation(value = "Fetch the name from DB", response = String.class)
	@ApiResponses(value = {
			@ApiResponse(code=200, message="success"),
			@ApiResponse(code=404, message="Not found")
	})
	@RequestMapping(value = "/test",method= RequestMethod.GET)
	public String testMethod() {
		
		logger.info("inside controller Basic Oprtation");
		return basicOperationService.getTestData(); 
	}
	
	@RequestMapping(value = "/address/{id}",method= RequestMethod.GET)
	public MainResultDto fetchAddress(@PathVariable int id) throws Exception {
		logger.info("inside controller to fetch address");
		return responseBuilder.buildResult(basicOperationService.fetchAddress(id));
	}

}

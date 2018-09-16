package com.example.demo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.repo.BasicOperationsRepo;
import com.example.demo.service.BasicOperationService;

@Component
public class BasicOperationServiceImpl implements BasicOperationService {
	
	@Autowired
	private BasicOperationsRepo repo;
	
	Logger logger = LoggerFactory.getLogger(BasicOperationServiceImpl.class);

	@Override
	public String getTestData() {
		logger.info("inside basic operation service layer");
		return repo.getTestData();
	}

}

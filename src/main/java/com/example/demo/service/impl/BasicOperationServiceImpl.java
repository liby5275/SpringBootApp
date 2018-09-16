package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.aggregate.FetchAddressAggregate;
import com.example.demo.dto.AddressDto;
import com.example.demo.repo.BasicOperationsRepo;
import com.example.demo.responsebuilder.BasicOperationsResponseBuilder;
import com.example.demo.service.BasicOperationService;

@Component
public class BasicOperationServiceImpl implements BasicOperationService {
	

	@Autowired
	private BasicOperationsRepo repo;
	
	@Autowired
	private BasicOperationsResponseBuilder responseBuilder;

	Logger logger = LoggerFactory.getLogger(BasicOperationServiceImpl.class);

	@Override
	public String getTestData() {
		logger.info("inside basic operation service layer");
		return repo.getTestData();
	}

	@Override
	public AddressDto fetchAddress(int id) throws Exception {
		logger.info("Starting with fetch address @ service layer");

		Optional<List<FetchAddressAggregate>> aggregateList = repo.fetchAddress(id);

		if (!aggregateList.isPresent()) {
			throw new Exception("NF");
		} else {
			return responseBuilder.buildFetchAddressReponse(aggregateList.get().get(0));
		}
	}

}

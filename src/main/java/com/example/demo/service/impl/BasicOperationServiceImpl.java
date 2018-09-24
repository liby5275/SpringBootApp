package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.aggregate.FetchAddressAggregate;
import com.example.demo.dto.AddressDto;
import com.example.demo.exception.handling.CustomExcpetion;
import com.example.demo.repo.BasicOperationsRepo;
import com.example.demo.responsebuilder.BasicOperationsResponseBuilder;
import com.example.demo.service.BasicOperationService;
import com.example.demo.exception.handling.CustomExcpetion.BusinessException;

@Component
public class BasicOperationServiceImpl implements BasicOperationService {
	

	/*
	 * Please note that logging for this calls methods will be done 
	 * as a separate aspect. Please refer UserLoginAndLoggingAspect.class
	 */


	@Autowired
	private BasicOperationsRepo repo;
	
	@Autowired
	private BasicOperationsResponseBuilder responseBuilder;


	@Override
	public String getTestData() {
		return repo.getTestData();
	}

	@Override
	public AddressDto fetchAddress(int id) throws Exception {

		Optional<List<FetchAddressAggregate>> aggregateList = repo.fetchAddress(id);

		if (!aggregateList.isPresent()) {
			throw new BusinessException("No aggregate found", "400");
			//write the code to rasie and exception
		} else {
			return responseBuilder.buildFetchAddressReponse(aggregateList.get().get(0));
		}
		
	}

}

package com.example.demo.service;

import com.example.demo.dto.AddressDto;

public interface BasicOperationService {
	
	String getTestData();
	
	AddressDto fetchAddress(int id) throws Exception;

}

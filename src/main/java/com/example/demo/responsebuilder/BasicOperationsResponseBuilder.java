package com.example.demo.responsebuilder;

import com.example.demo.aggregate.FetchAddressAggregate;
import com.example.demo.dto.AddressDto;
import com.example.demo.dto.MainResultDto;

public interface BasicOperationsResponseBuilder {
	
	AddressDto buildFetchAddressReponse(FetchAddressAggregate aggregate);
	
	MainResultDto buildResult(Object data);
	
}

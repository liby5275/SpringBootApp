package com.example.demo.response.builder.impl;

import org.springframework.stereotype.Component;

import com.example.demo.aggregate.FetchAddressAggregate;
import com.example.demo.dto.AddressDto;
import com.example.demo.dto.MainResultDto;
import com.example.demo.dto.ResultDto;
import com.example.demo.responsebuilder.BasicOperationsResponseBuilder;

@Component
public class BasicResultResponseBuilderImpl implements BasicOperationsResponseBuilder {

	@Override
	public AddressDto buildFetchAddressReponse(FetchAddressAggregate aggregate) {
		return new AddressDto(aggregate.getId(), aggregate.getName(), aggregate.getAddress1(), aggregate.getAddress2(),
				aggregate.getAccountId());

	}

	@Override
	public MainResultDto buildResult(Object data) {
		MainResultDto result = new MainResultDto();
		ResultDto dto = new ResultDto();
		if(null == data) {
			dto.setErrorMessage("Error happened");
			dto.setData(null);
		}
		else {
			dto.setData(data);
			dto.setErrorMessage(null);
		}
		result.setResult(dto);
		return result;
	}

}

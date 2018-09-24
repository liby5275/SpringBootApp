package com.example.demo.exception.handling;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MainResultDto;
import com.example.demo.dto.ResultDto;
import com.example.demo.exception.handling.CustomExcpetion.BusinessException;

@SuppressWarnings("serial")
@ControllerAdvice
@RestController
public class BasicApplicationExceptionHandler {

	
	@ExceptionHandler(BusinessException.class)
	public final MainResultDto processBaseExcpetion(BusinessException e) {
		
		ResultDto dto = new ResultDto();
		dto.setData(null);
		dto.setErrorMessage("error message : Exception occured"+ e.getErrorMessage());
		MainResultDto result = new MainResultDto();
		result.setResult(dto);
		return result;
	}

	
	//public static final BusinessException()

}

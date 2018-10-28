package com.ikshavaku.actorsdirectory.rest;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class ExceptionController {

	@SuppressWarnings(value = { "unchecked", "rawtypes" })
	@ExceptionHandler
	public Map<String,String> getErrorResponse(Exception e){
		Map result = new LinkedHashMap<>();
		result.put("success", "false");
		result.put("error",e.getMessage());
		return result;
	}
}

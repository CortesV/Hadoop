package com.devcortes.hadoop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value="/", method = RequestMethod.GET, produces = "application/json")
	public String message(){
		
		return "Hadoop";
	}
}

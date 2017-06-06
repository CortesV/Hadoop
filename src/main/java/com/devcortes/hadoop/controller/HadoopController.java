package com.devcortes.hadoop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devcortes.hadoop.hadoopservice.fieldcount.HadoopDriverFieldCount;

@RestController
public class HadoopController {

	@Autowired
	private HadoopDriverFieldCount hadoopDriver; 
	
	@RequestMapping(value="/", method = RequestMethod.GET, produces = "application/json")
	public Integer message() throws Exception{
		
		return hadoopDriver.runJob();
	}
}

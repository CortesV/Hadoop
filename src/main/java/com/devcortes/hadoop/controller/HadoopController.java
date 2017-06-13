package com.devcortes.hadoop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devcortes.hadoop.hadoopservice.fieldcount.HadoopDriverFieldCount;
import com.devcortes.hadoop.hadoopservice.filterbrand.HadoopDriverBrand;
<<<<<<< HEAD
import com.devcortes.hadoop.hadoopservice.rewritedb.HadoopDriverBrandRewrite;
=======
>>>>>>> 9583ea46f56480a40b97f7e3f6c69a3abf502f80

@RestController
public class HadoopController {

	@Autowired
	private HadoopDriverFieldCount hadoopDriverFieldCount;
	
	@Autowired
<<<<<<< HEAD
	private HadoopDriverBrandRewrite hadoopDriverRewrite;
	
	@Autowired
=======
>>>>>>> 9583ea46f56480a40b97f7e3f6c69a3abf502f80
	private HadoopDriverBrand hadoopDriver;
	
	@RequestMapping(value="/fieldcount", method = RequestMethod.GET, produces = "application/json")
	public Integer fieldcount() throws Exception{
		
		return hadoopDriverFieldCount.runJob();
	}
	
	@RequestMapping(value="/filter", method = RequestMethod.GET, produces = "application/json")
	public Integer filter() throws Exception{
		
		return hadoopDriver.runJob();
	}
<<<<<<< HEAD
	
	@RequestMapping(value="/rewrite", method = RequestMethod.GET, produces = "application/json")
	public Integer rewrite() throws Exception{
		
		return hadoopDriverRewrite.runJob();
	}
=======
>>>>>>> 9583ea46f56480a40b97f7e3f6c69a3abf502f80
}

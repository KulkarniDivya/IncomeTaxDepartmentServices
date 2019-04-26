package com.cg.tds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.tds.exception.UserNotFoundException;
import com.cg.tds.model.TdsMaster;
import com.cg.tds.service.TDSService;

@RestController
public class TDSController {

	//Using autowiring to get the instance of TdsService interface
	@Autowired
	TDSService tdsService;
	
	//Method to get the details by id
	//We are using requestmapping with get method
	@GetMapping("user/tds/{id}")
	public TdsMaster getById(@PathVariable int id) {
		TdsMaster tdsMaster = tdsService.getById(id);
		if(tdsMaster == null) {
			//id is not present in table, so an exception
			throw new UserNotFoundException("ID not found wrong ID : "+id);
		}
		else
			return tdsMaster; //if id is present in table, print that details
	}
}


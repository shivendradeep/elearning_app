package com.app.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.PlanMasterImpl;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PlanMaterCnt {
	
	
	 @Autowired
     PlanMasterImpl service;
	 
	 
	@GetMapping("/getcategories")
	public ResponseEntity<Map<Integer, String>> getAllCategories(){
		
		return new ResponseEntity<>(service.getAllCategories(), HttpStatus.OK);
	}
}

package com.app.service;

import java.util.HashMap;
import java.util.Map;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CategoryRepo;
import com.app.dao.PlanRepo;
import com.app.pojo.CourseCategories;
import com.app.pojo.CourseCategory;
import com.app.pojo.PlanMaster;

@Service
@Transactional
public class PlanMasterImpl {

	
	Logger logger=LoggerFactory.getLogger(PlanMasterImpl.class);
	
	@Autowired
	PlanRepo planrepo;
	
	@Autowired
	CategoryRepo catrepo;
	
	public Map<Integer, String> getAllCategories(){
		
	     Iterable<CourseCategory> allcategories=catrepo.findAll();
	     
	     Map<Integer, String> catmap=new HashMap<>();
	     
	     allcategories.forEach(categories->{
	    	 catmap.put(categories.getId(), categories.getCoursecategories());
	     });
	     
	     logger.info("catmap::::"+catmap);
	     return catmap;
	}
}

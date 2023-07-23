package com.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.pojo.PlanMaster;

@Repository
public interface PlanRepo extends CrudRepository<PlanMaster, Integer> {

	
}

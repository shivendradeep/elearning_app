package com.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.pojo.CourseCategories;
import com.app.pojo.CourseCategory;

public interface CategoryRepo extends CrudRepository<CourseCategory, Integer> {

}

package com.app.pojo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import lombok.Data;
import net.bytebuddy.asm.Advice.Local;


@Entity
@Table(name="tbl_Course_Categories")
@Data
public class CourseCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="category_id")
	private  Integer id;
	
	
	@Column(name="category_name")
	private String coursecategories;
	
	@Column(name="CREATION_DATE",updatable = false)
    @CreationTimestamp
	private LocalDate createdby;
	
	@Column(name="LAST_UPDATED",insertable =  false)
	@UpdateTimestamp
	private LocalDate updatedby;
}

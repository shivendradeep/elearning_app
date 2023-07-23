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
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import net.bytebuddy.asm.Advice.Local;

@Entity
@Table(name="tbl_Plan_Masters")
@Data
public class PlanMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="plan_id")
	private Integer planid;
	
	
	@Column(name="plan_name")
	private String   categoryname;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name="START_DATE")
	private LocalDate startdate;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name="END_DATE")
	private LocalDate enddate;
	
	@Column(name="ACTIVE_SWITCH")
	@Enumerated(EnumType.STRING)
	private ActiveSwitch   activeswitch;
	
	
	
	@Column(name="CREATION_DATE",updatable = false)
    @CreationTimestamp
	private LocalDate createdby;
	
	@Column(name="LAST_UPDATED",insertable =  false)
	@UpdateTimestamp
	private LocalDate updatedby;
	
	
}

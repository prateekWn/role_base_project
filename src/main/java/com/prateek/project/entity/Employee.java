package com.prateek.project.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Employee {

	@Id
	@Column(name = "id")
	Long id;

	@Column(name = "emp_code")
	String empCode;

	@Column(name = "number")
	Long number;

	@Column(name = "mail_id")
	String email;

	@JoinColumn(name = "levels_id", referencedColumnName = "id")
	@ManyToOne
	Levels levelId;

	@Column(name = "created_by")
	String createdBy;

	@Column(name = "created_date")
	Date createdDate;

	@Column(name = "mod_by")
	String modBy;

	@Column(name = "mod_date")
	Date modDate;
}

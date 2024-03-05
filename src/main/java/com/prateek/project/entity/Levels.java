package com.prateek.project.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Levels {

	@Id
	@Column(name = "id")
	Long id;

	@Column(name = "grade")
	Long grade;

	@Column(name = "short_desc")
	String desc;

	@Column(name = "created_by")
	String createdBy;

	@Column(name = "created_date")
	Date createdDate;

	@Column(name = "mod_by")
	String modBy;

	@Column(name = "mod_date")
	Date modDate;
}

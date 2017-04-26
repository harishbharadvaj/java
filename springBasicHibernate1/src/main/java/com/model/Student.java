package com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;
	@Column
	private String studentName;
	
	@ManyToMany
	@JoinTable(name="STUDENT_COURSE",joinColumns = {@JoinColumn(name = "studentId")},inverseJoinColumns = {@JoinColumn(name="courseId")})
	private List<Courses> studentCourses;
}

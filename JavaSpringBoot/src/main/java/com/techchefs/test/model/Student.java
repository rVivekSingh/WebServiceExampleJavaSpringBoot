package com.techchefs.test.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Student implements Serializable {
    private static final long serialVersionUID = -6849309712047581107L;
    
    @Id
    private Long rollNumber;
    
    @Column(name="name")
    private String name;
    
    @Column(name="gender")
    private String gender;
    
    @Column(name="grade")
    private String grade;
    
    public Student() {
		}
		public Long getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Long rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

		@Override
		public String toString() {
			return "Student [rollNumber=" + rollNumber + ", name=" + name + ", gender=" + gender + ", grade=" + grade
					+ "]";
		}
    

}

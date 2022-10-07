package com.marketing2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Lead4")
public class Lead {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;	
	@Column(name="first_N",nullable=false,length=45)
	public String FirstName;
	@Column(name="last_N",nullable=false,length=45)
	public String LastName;
	@Column(name="email",nullable=false,unique=true)
	public String email;
	@Column(name="mobile",nullable=false,unique=true)
	public int mobile;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	

}

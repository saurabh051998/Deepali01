package com.tweetApp.FSE.Model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Id;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
//@Document(collection = "Register")
@Entity
@Table(name = "USER", schema = "tweetapp")
public class Register {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userid")
	private int id;
	
	@Column(name = "userfirstname")
	private String firstName;
	
	@Column(name = "userlastname")
	private String lastName;
	
	@Column(name = "usergender")
	private String gender;
	
	@Column(name = "useremail")
	private String email;
	
	@Column(name = "userpassword")
	private String password;
	
	@OneToMany(mappedBy = "register", fetch = FetchType.LAZY)
	private List<Tweet> tweetList;

	
	public Register()
	{
		
	}

	public Register(int id, String firstName, String lastName, String gender, String email, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Register [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", email=" + email + ", password=" + password + "]";
	}

	
}

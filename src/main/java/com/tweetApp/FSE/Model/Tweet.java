package com.tweetApp.FSE.Model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "TWEET")
public class Tweet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tweetids")
	private int id;
	
	@Column(name = "tweetdescription")
	private String tweetDescription;
	
	@Column(name = "tweettag")
    private String tweetTag;
	
	@Column(name = "tweetdate")
	private String Date;
	
	@Column(name = "tweetemail")
	
    private String email;
	
	@Column(name = "tweetrecordactive")
    private char recordActive;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid")
	private Register register;
	//edit
//	@OneToMany(mappedBy="tweet", fetch = FetchType.LAZY)
//   private List<Reply> tweetReply;
	
	public Register getRegister() {
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTweetDescription() {
		return tweetDescription;
	}

	public void setTweetDescription(String tweetDescription) {
		this.tweetDescription = tweetDescription;
	}

	public String getTweetTag() {
		return tweetTag;
	}

	public void setTweetTag(String tweetTag) {
		this.tweetTag = tweetTag;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*public List<Reply> getTweetReply() {
		return tweetReply;
	}

	public void setTweetReply(List<Reply> tweetReply) {
		this.tweetReply = tweetReply;
	}
	*/

	public char getRecordActive() {
		return recordActive;
	}

	public void setRecordActive(char recordActive) {
		this.recordActive = recordActive;
	}

	@Override
	public String toString() {
		return "Tweet [id=" + id + ", tweetDescription=" + tweetDescription + ", tweetTag=" + tweetTag + ", Date="
				+ Date + ", email=" + email + ", recordActive=" + recordActive + ", reply=" + 
				 "]";
	}

	

	
	

	

}

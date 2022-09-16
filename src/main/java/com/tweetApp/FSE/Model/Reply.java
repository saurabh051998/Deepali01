package com.tweetApp.FSE.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "REPLY")
public class Reply {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "replyid")
    private int replyId;
	
	@Column(name = "tweetid")
    private int tweetId;

	
	@Column(name = "replyby")
	private String email;
	
	
	
	
	@Column(name = "replydesc")
    private String replyDesc;
	
	@Column(name = "date")
    private String date;
	
	//edit
//	@OneToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="tweetids")
//	private Tweet tweet;
	


	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReplyDesc() {
		return replyDesc;
	}

	public void setReplyDesc(String replyDesc) {
		this.replyDesc = replyDesc;
	}

	public int getTweetId() {
		return tweetId;
	}

	public void setTweetId(int tweetId) {
		this.tweetId = tweetId;
	}
	
	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Reply [email=" + email + ", tweetId=" + tweetId + ", replyDesc=" + replyDesc + ", date=" + date + "]";
	}

	
	
	
	
	
	
	
	

}

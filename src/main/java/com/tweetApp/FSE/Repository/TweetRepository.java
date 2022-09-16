package com.tweetApp.FSE.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.tweetApp.FSE.Model.Tweet;

public interface TweetRepository extends JpaRepository<Tweet,Integer> {
	
	public List<Tweet> findByRecordActive(char recordActive);

	public List<Tweet> findByEmail(String email);
	
	public Tweet deleteById(int id);
}

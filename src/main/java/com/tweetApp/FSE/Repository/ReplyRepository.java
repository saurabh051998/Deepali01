package com.tweetApp.FSE.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweetApp.FSE.Model.Reply;

public interface ReplyRepository extends JpaRepository<Reply,String> {
	
	List<Reply> findByTweetId(int tweetId);

}

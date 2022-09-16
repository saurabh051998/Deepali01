package com.tweetApp.FSE.Service;

import java.util.List;

import com.tweetApp.FSE.DTO.ReplyDTO;
import com.tweetApp.FSE.DTO.TweetRequestDTO;
import com.tweetApp.FSE.DTO.TweetResponseDTO;
import com.tweetApp.FSE.Model.Register;
import com.tweetApp.FSE.Model.Tweet;

public interface TweetService {
	
	String postTweet(TweetRequestDTO tweerRequest, Register userJpa);
	
	List<TweetResponseDTO> getAllTweets();

	String postReply(ReplyDTO replyDTO, List<Tweet> tweet);

	String deleteTweet(int tweetId);

}

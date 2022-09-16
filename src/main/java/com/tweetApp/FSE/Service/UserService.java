package com.tweetApp.FSE.Service;

import com.tweetApp.FSE.DTO.RegisterDTO;
import com.tweetApp.FSE.DTO.ResetPasswordRequestDTO;
import com.tweetApp.FSE.DTO.ResetPasswordResponseDTO;
import com.tweetApp.FSE.DTO.UserDTO;
import com.tweetApp.FSE.DTO.UserTweetsDTO;
import com.tweetApp.FSE.Model.Register;
import com.tweetApp.FSE.Model.Tweet;

import java.util.List;

import com.tweetApp.FSE.DTO.LoginRequestDTO;
import com.tweetApp.FSE.DTO.LoginResponseDTO;

public interface UserService {


	RegisterDTO register(RegisterDTO registerDTO);
	
	LoginResponseDTO signUp(LoginRequestDTO loginRequestDTO);
	//edit added
	Register findByemail(String email);
	//edit added
	List<Tweet> findByemailoftweet(String email);
	
	ResetPasswordResponseDTO resetpassword(ResetPasswordRequestDTO resetRequest);

	List<UserDTO> getAllUsers();

	List<UserTweetsDTO> getUsersTweet(String email);

}

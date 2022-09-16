package com.tweetApp.FSE.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweetApp.FSE.Model.Register;

public interface UserRepository extends JpaRepository<Register,Integer> {
	
	Register findByemail(String email);
	
	Register findById(int id);
	

}

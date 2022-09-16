package com.tweetApp.FSE.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweetApp.FSE.Model.Register;

public interface RegisterRepository extends JpaRepository<Register,Integer> {
	
	Optional<Register> findByemail(String email);
	
	List<Register> findAll();

}

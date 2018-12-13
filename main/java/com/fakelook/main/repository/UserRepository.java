package com.fakelook.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fakelook.main.domain.LoginDetails;

public interface UserRepository extends JpaRepository<LoginDetails, Long> {
	
	@Query("select * from loginDetail where email = ?")
	LoginDetails findByEmail(String email);

}

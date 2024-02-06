package com.example.zoomanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.zoomanagement.model.UserData;

@Repository
public interface UserDataRepo extends JpaRepository<UserData, Long> {

	public UserData findByEmail(String email);
}

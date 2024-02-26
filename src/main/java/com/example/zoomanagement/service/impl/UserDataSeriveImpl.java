package com.example.zoomanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.zoomanagement.model.UserData;
import com.example.zoomanagement.repository.UserDataRepo;
import com.example.zoomanagement.service.UserDataService;

@Service
public class UserDataSeriveImpl implements UserDataService {

	@Autowired
	private UserDataRepo userDataRepo;
	
	@Override
	public String addUser(UserData user) {
		UserData u = user;
		UserData verifyUser = getUser(user.getEmail());
		
		if(verifyUser == null) {
			String password = new BCryptPasswordEncoder().encode(user.getPassword());
			u.setPassword(password);
			userDataRepo.save(u);
			return "success";
		}
		else {
			System.err.println("User already exists");
			return "error";
		}
	}

	@Override
	public UserData getUser(String username) {
		return userDataRepo.findByEmail(username);
	}

	@Override
	public List<UserData> getAllUsers() {
		return userDataRepo.findAll();
	}

}

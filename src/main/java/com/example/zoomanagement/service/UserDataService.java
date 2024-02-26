package com.example.zoomanagement.service;

import java.util.List;

import com.example.zoomanagement.model.UserData;

public interface UserDataService {

	public String addUser(UserData user);

	public UserData getUser(String username);
	
	public List<UserData> getAllUsers();
}

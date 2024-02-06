package com.example.zoomanagement.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.zoomanagement.model.UserData;
import com.example.zoomanagement.repository.UserDataRepo;

@Component
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserDataRepo userDataRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserData user = userDataRepo.findByEmail(username);
		if(user == null) {
			throw new UsernameNotFoundException(username + " user is not found!");
		}
		return new CustomUser(user);
	}

}

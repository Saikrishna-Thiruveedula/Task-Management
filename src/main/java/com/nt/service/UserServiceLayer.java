package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.User;
import com.nt.respository.UserRepository;

@Service
public class UserServiceLayer implements UserService
{
	@Autowired
	private UserRepository userrepo;

	@Override
	public User findbyUsername(String username) {
		return userrepo.findByUsername(username);
	}
	

}

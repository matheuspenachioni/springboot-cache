package com.springcache.math.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springcache.math.model.User;
import com.springcache.math.repository.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
	public List<User> listAllUsers() {
		return userRepository.findAll();
	}
	
	public Optional<User> findUserById(Long id) {
		return userRepository.findById(id);
	}
}

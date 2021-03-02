package org.generation.blog.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.generation.blog.model.User;
import org.generation.blog.model.UserLogin;
import org.generation.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public User signup(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String passwordEncoder = encoder.encode(user.getPassword());
		user.setPassword(passwordEncoder);
		
		return repository.save(user);
	}
	
	public Optional<UserLogin> login(Optional<UserLogin> user0) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional<User> user = repository.findByUsername(user0.get().getUsername());
		
		if(user.isPresent()) {
			if(encoder.matches(user0.get().getPassword(), user.get().getPassword())) {
				
				String auth = user0.get().getUsername() + ":" + user0.get().getPassword();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);
				
				user0.get().setToken(authHeader);
				user0.get().setName(user.get().getName());
				
				return user0;
			}
		}
		
		return null;
	}
}

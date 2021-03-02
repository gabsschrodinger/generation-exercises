package org.generation.blog.security;

import java.util.Optional;

import org.generation.blog.model.User;
import org.generation.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user0 = userRepository.findByUsername(username);
		user0.orElseThrow(() -> new UsernameNotFoundException(username + " not found."));
		
		return user0.map(UserDetailsImpl::new).get();
	}
}

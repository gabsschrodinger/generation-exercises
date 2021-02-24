package com.store.game.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.game.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
	
	public UserModel findByUsernameIgnoreCase(String username);
	
	public List<UserModel> findAllByNameContainingIgnoreCase(String name);
}

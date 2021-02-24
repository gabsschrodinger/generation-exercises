package com.store.game.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.game.model.UserModel;
import com.store.game.repository.UserRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public ResponseEntity<List<UserModel>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{user_id}")
	public ResponseEntity<UserModel> getById(@PathVariable long user_id) {
		return repository.findById(user_id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/name/{name}")
	public ResponseEntity<List<UserModel>> getByName(@PathVariable String name) {
		return ResponseEntity.ok(repository.findAllByNameContainingIgnoreCase(name));
	}
	
	@GetMapping("/username/{username}")
	public ResponseEntity<UserModel> getByUsername(@PathVariable String username) {
		return ResponseEntity.ok(repository.findByUsernameIgnoreCase(username));
	}
	
	@PostMapping
	public ResponseEntity<UserModel> post(@RequestBody UserModel user) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(user));
	}
	
	@PutMapping
	public ResponseEntity<UserModel> put(@RequestBody UserModel user) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(user));
	}
	
	@DeleteMapping("/{user_id}")
	public void delete(@PathVariable long user_id) {
		repository.deleteById(user_id);
	}
}

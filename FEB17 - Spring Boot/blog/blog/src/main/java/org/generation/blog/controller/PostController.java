package org.generation.blog.controller;

import java.util.List;

import org.generation.blog.model.Post;
import org.generation.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
@CrossOrigin("*")
public class PostController {
	
	@Autowired
	private PostRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Post>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Post> GetById(@PathVariable long id) {
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/title/{title}")
	public ResponseEntity<List<Post>> GetByTitle(@PathVariable String title) {
		return ResponseEntity.ok(repository.findAllByTitleContainingIgnoreCase(title));
	}
}





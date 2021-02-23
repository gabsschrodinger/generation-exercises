package org.generation.blog.controller;

import java.util.List;
import org.generation.blog.model.Subject;
import org.generation.blog.repository.SubjectRepository;
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

@RestController //indica que é um controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/subject")
public class SubjectController {
	
	@Autowired
	private SubjectRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Subject>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Subject> getById(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/name/{name}")
	public ResponseEntity<List<Subject>> getByName(@PathVariable String name) {
		return ResponseEntity.ok(repository.findAllByDescriptionContainingIgnoreCase(name));
	}
	
	@PostMapping
	public ResponseEntity<Subject> post (@RequestBody Subject subject) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(subject));
	}
	
	@PutMapping
	public ResponseEntity<Subject> put (@RequestBody Subject subject) {
		return ResponseEntity.ok(repository.save(subject));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}

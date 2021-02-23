package com.drugstore.drustore.controller;

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
import com.drugstore.drustore.model.CategoryModel;
import com.drugstore.drustore.repository.CategoryRepository;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {
	
	@Autowired
	private CategoryRepository repository;
	
	@GetMapping
	public ResponseEntity<List<CategoryModel>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CategoryModel> GetById(@PathVariable long id) {
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/description/{description}")
	public ResponseEntity<List<CategoryModel>> GetByDescription(@PathVariable String description) {
		return ResponseEntity.ok(repository.findAllByDescriptionContainingIgnoreCase(description));
	}
	
	@PostMapping
	public ResponseEntity<CategoryModel> post(@RequestBody CategoryModel category) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(category));
	}
	
	@PutMapping
	public ResponseEntity<CategoryModel> put(@RequestBody CategoryModel category) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(category));
	}
	
	@DeleteMapping
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}

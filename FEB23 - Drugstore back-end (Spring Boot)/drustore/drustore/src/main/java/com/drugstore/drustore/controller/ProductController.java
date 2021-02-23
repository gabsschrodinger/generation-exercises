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
import com.drugstore.drustore.model.ProductModel;
import com.drugstore.drustore.repository.ProductRepository;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {
	
	@Autowired
	private ProductRepository repository;
	
	@GetMapping
	public ResponseEntity<List<ProductModel>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProductModel> GetById(@PathVariable long id) {
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/name/{name}")
	public ResponseEntity<List<ProductModel>> GetByName(@PathVariable String name) {
		return ResponseEntity.ok(repository.findAllByNameContainingIgnoreCase(name));
	}
	
	@PostMapping
	public ResponseEntity<ProductModel> post(@RequestBody ProductModel product) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(product));
	}
	
	@PutMapping
	public ResponseEntity<ProductModel> put(@RequestBody ProductModel product) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(product));
	}
	
	@DeleteMapping
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}

package com.store.game.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.game.model.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long>{
	public List<ProductModel> findAllByTitleContainingIgnoreCase(String title);
}

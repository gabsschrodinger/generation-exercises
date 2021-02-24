package com.store.game.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.store.game.model.CategoryModel;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryModel, Long>{
	
	public List<CategoryModel> findAllByConsoleContainingIgnoreCase(String console);
	
	public List<CategoryModel> findAllByDescriptionContainingIgnoreCase(String description);
}
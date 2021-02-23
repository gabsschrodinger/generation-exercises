package com.drugstore.drustore.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.drugstore.drustore.model.CategoryModel;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryModel, Long>{
	public List<CategoryModel> findAllByDescriptionContainingIgnoreCase (String description);
}

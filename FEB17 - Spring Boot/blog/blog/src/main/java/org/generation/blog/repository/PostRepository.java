package org.generation.blog.repository;

import java.util.List;
import org.generation.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
	public List<Post> findAllByTitleContainingIgnoreCase (String title);
	
}

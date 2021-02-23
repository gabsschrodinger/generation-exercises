package org.generation.blog.repository;

import java.util.List;
import org.generation.blog.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
	public List<Subject> findAllByDescriptionContainingIgnoreCase(String description);
}
package br.com.enums.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.enums.projeto.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}

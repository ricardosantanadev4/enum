package br.com.enums.projeto.controll;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.enums.projeto.model.Course;
import br.com.enums.projeto.repository.CourseRepository;

@RestController
@RequestMapping("/api/courses")
public class CourseControll {

	private final CourseRepository courseRepository;

	public CourseControll(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@GetMapping
	public List<Course> list() {
		return courseRepository.findAll();
	}

}

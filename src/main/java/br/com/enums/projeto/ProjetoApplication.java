package br.com.enums.projeto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.enums.projeto.enumsJPA.Category;
import br.com.enums.projeto.model.Course;
import br.com.enums.projeto.repository.CourseRepository;

@SpringBootApplication
public class ProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
	}

	@Bean
	CommandLineRunner initDb(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();
			Course course = new Course();
			course.setName("Spring-Boot");
			course.setCategory(Category.BACKEND);
			courseRepository.save(course);
		};
	}
}

package site.cswilson.hibernatedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import site.cswilson.hibernatedemo.repository.CourseRepository;

@SpringBootApplication
public class HibernateDemoApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CourseRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(HibernateDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Getting Course by id 1 -> {}", this.repository.findById(1L).toString());
		logger.info("Deleting Course by id 1 -> {}");
		this.repository.deleteCourseById(1L);
		logger.info("Getting Course by id 1 -> {}", this.repository.findById(1L));
	}
}

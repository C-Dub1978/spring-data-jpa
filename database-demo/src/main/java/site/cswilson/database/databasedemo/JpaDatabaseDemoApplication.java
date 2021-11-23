package site.cswilson.database.databasedemo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import site.cswilson.database.databasedemo.entity.Person;
import site.cswilson.database.databasedemo.jpa.PersonJpaDaoRepository;

@SpringBootApplication
public class JpaDatabaseDemoApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJpaDaoRepository personRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Person by id -> {}", personRepository.findById(1004));
		
		Person found = this.personRepository.findById(1004);
		found.setName("Updated name");
		Person updated = this.personRepository.update(found);
		logger.info("Person updated -> {}", updated.toString());
		this.personRepository.delete(updated.getId());
		logger.info("Deleting this person -> {}", this.personRepository.findById(updated.getId()));
		List<Person> people = this.personRepository.findAll();
		for (Person p : people) {
			logger.info("Found all persons -> {}", p.toString());
		}
		
	}
}

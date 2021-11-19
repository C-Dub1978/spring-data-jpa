package site.cswilson.database.databasedemo;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import site.cswilson.database.databasedemo.jdbc.PersonJdbcDAO;
import site.cswilson.database.databasedemo.jdbc.models.Person;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Person> persons = dao.findAll();
		logger.info("All users -> {}");
		for (Person p : persons) {
			logger.info(p.toString());
		}
		
		Person person = dao.findById(1005);
		logger.info("Found by id -> {}", person.toString());
	}

}

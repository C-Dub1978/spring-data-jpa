package site.cswilson.database.databasedemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import site.cswilson.database.databasedemo.entity.Person;
import site.cswilson.database.databasedemo.jdbc.PersonJdbcDao;
import site.cswilson.database.databasedemo.jpa.PersonJpaDaoRepository;

@SpringBootTest
@Transactional
class DatabaseDemoApplicationTests {

	@Autowired
	PersonJpaDaoRepository repository;
	
	@Autowired
	PersonJdbcDao dao;
	
	// IMPORTANT / USEFUL ANNOTATIONS
	// @Before - like a beforeEach - define a method (method level method)
	// @After - like an afterEach - define a method (method level method)
	// @BeforeClass - like a beforeAll - define a static method (class level method)
	// @AfterClass - like an afterAll - define a static method (class level method)
	
	
	@Test
	void findAll() {
		List<Person> persons = this.repository.findAll();
		assertEquals(15, persons.size());
	}
	
	@Test
	void findById() {
		Person person = this.repository.findById(1005);
		assertEquals("Perry", person.getName());		
	}
	
	@Test
	void findByIdNonExistent() {
		assertNull(this.repository.findById(200000), "Non existent user");
	}
	
	@Test
	void update() {
		Person person = this.repository.findById(1005);
		assertEquals("Perry", person.getName());
		person.setName("Test Name");
		this.repository.update(person);
		person = this.repository.findById(1005);
		assertEquals("Test Name", person.getName());
	}

}

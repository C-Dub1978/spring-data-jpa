package site.cswilson.hibernatedemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import site.cswilson.hibernatedemo.entity.Course;
import site.cswilson.hibernatedemo.repository.CourseRepository;

@SpringBootTest
class HibernateDemoApplicationTests {

	private Course course = new Course("Test Course");

	@Autowired
	CourseRepository repository;

	@Test
	void findById() {
		Course course = repository.findById(2L);
		assertEquals("Angular Fundamentals", course.getName());
	}

	@Test
	void findNonExistentCourse() {
		assertNull(this.repository.findById(1L));
	}

	@Test
	// This is when you have a test that is modifying the data - Junit will reset
	// any mutated data after each test
	@DirtiesContext
	void saveNewCourse() throws Exception {
		int length = this.repository.findAll().size();
		this.repository.save(course);
		assertEquals(this.repository.findAll().size(), length + 1);
	}

	/**
	 * Should update the course rather than adding a new row
	 * @throws Exception
	 */
	@Test
	@DirtiesContext
	void updateExistingCourse() throws Exception {
		Course c = this.repository.save(course);
		int length = this.repository.findAll().size();
		c.setName("New Updated Course");
		this.repository.save(c);
		assertEquals(length, this.repository.findAll().size());
	}

	/**
	 * Should add a new row since course doesnt exist
	 * @throws Exception
	 */
	@Test
	@DirtiesContext
	void addNewCourse() throws Exception {
		int length = this.repository.findAll().size();
		this.repository.save(course);
		assertEquals(length + 1, this.repository.findAll().size());
	}

	@Test
	@DirtiesContext
	void deleteCourseByObject() throws Exception {
		Course c = this.repository.save(course);
		int length = this.repository.findAll().size();
		this.repository.deleteCourse(c);
		assertEquals(length - 1, this.repository.findAll().size());
	}

	@Test
	@DirtiesContext
	void deleteCourseById() throws Exception {
		Course c = this.repository.findById(2L);
		int length = this.repository.findAll().size();
		this.repository.deleteCourseById(c.getId());
		assertEquals(length - 1, this.repository.findAll().size());
	}
}

package site.cswilson.database.databasedemo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import site.cswilson.database.databasedemo.jdbc.models.Person;

@Repository
public class PersonJdbcDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	// All PERSON's
	public List<Person> findAll() {
		return jdbcTemplate.query("select * from person",
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public Person findById(int id) {
		return jdbcTemplate.queryForObject("select * from person where id=?",
				new BeanPropertyRowMapper<Person>(Person.class),
				id);
	}
}

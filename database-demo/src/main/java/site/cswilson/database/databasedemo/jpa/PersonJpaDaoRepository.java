package site.cswilson.database.databasedemo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import site.cswilson.database.databasedemo.entity.Person;

// We are implementing transaction at the class level, but usually you do it
// at the method level
@Transactional
@Repository
public
class PersonJpaDaoRepository {
	
	// Everything has to go through a persistencecontext in spring boot
	@PersistenceContext
	EntityManager entityManager;
	
	public List<Person> findAll() {
		return this.entityManager.createNamedQuery("find_all_persons", Person.class).getResultList();
	}
	
	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}
	
	public Person update(Person person) {
		// JPA knows if there is an existing id in the person object passed,
		// update it, else insert the person
		return this.entityManager.merge(person);
	}
	
	public Person insert(Person person) {
		return this.entityManager.merge(person);
	}
	
	public void delete(int id) {
		Person found = this.findById(id);
		this.entityManager.remove(found);
	}
}
package site.cswilson.hibernatedemo.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import site.cswilson.hibernatedemo.entity.Address;
import site.cswilson.hibernatedemo.entity.Student;

@Repository
// @Transactional
public class StudentRepository {

	// To create a NEW entity, or update existing, use em.persist()
	// to use em.flush(), all the changes UP UNTIL you call flush are synced to the databse
	//    if you call flush and then call changes on an entity inside a single transaction,
	//    those new changes wont persist
	// to use em.detach(), call it, from then on any changes to the entity won't be tracked by
	//    the entitymanager because youve detached it from the em
	// to use em.refresh(), call it - it will instantly ditch any staged changes to an entity,
	//    and will refresh the entity with what is currently in the database
	
	@PersistenceContext
	EntityManager em;

	public List<Student> findAll() throws Exception {
		try {
			Query query = this.em.createNamedQuery("find_all_students");
			List<Student> list = new ArrayList<Student>();
			for (Object o : query.getResultList()) {
				list.add((Student) o);
			}
			return list;
		} catch (Exception e) {
			throw e;
		}
	}
	
	public Student findById(Long id) {
		return this.em.find(Student.class, id);
	}
	
	// Both save and update
	/**
	 * The entitymanager keeps track of everything that happens inside a transaction -
	 * If on line 53, we put a new line and then said student.setName("New Name"),
	 * you wouldnt have to then again call this.em.persist - since this method is annotated
	 * with @Transactional, everything happens within 1 transaction, even after you've called persist()
	 * .... the entitymanager keeps track of all changes to an entity within a single transaction
	 * @param student
	 */
	@Transactional
	public Student save(Student student) {
		if (null == student.getId()) {
			this.em.persist(student);
		} else {
			this.em.merge(student);
		}
		return student;
	}

    @Transactional
    public void saveStudentWithAddress() {
        Address address = new Address("Juju Jones Blvd", 123, 88081, "Denver", "CO");
        // em.persist(address);
        // If we have not yet saved the above address into the db at this point,
        // we are gonna get errors, persist the address entity first then
        // move along - think about it, how will you establish a RDB relationship
        // with an entity being referenced by another entity that is not yet
        // persisted? DUMBASS! =)
        Student student = new Student("Elton", "Lee");
        student.setAddress(address);
        em.persist(student);
    }
	
	@Transactional
	public void deleteStudent(Student student) {
		if (this.em.contains(student)) {
			this.em.remove(student);
		} else {
			this.em.remove(this.em.merge(student));
		}
	}
	
	@Transactional
	// Since this method is calling another method that is annotated with @Transactional,
	//   we need to annotate this method as @Transactional as well
	public void deleteStudentById(Long id) {
		Student student = findById(id);
		this.deleteStudent(student);
	}

}

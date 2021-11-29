package site.cswilson.hibernatedemo.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import site.cswilson.hibernatedemo.entity.Course;

@Repository
// Adding this annotation to class level - this means any public method in this
// class will use a transaction while running
// You can also annotate at the method level, for any method that is manipulating data
@Transactional
public class CourseRepository {

	// To create a NEW entity, or update existing, use em.persist()
	// to use em.flush(), all the changes UP UNTIL you call flush are synced to the databse
	//    if you call flush and then call changes on an entity inside a single transaction,
	//    those new changes wont persist
	// to use em.detach(), call it, from then on any changes to the entity won't be tracked by
	//    the entitymanager because youve detached it from the em
	
	@PersistenceContext
	EntityManager em;

	public List<Course> findAll() throws Exception {
		try {
			Query query = this.em.createNamedQuery("Course.findAll");
			List<Course> list = new ArrayList<Course>();
			for (Object o : query.getResultList()) {
				list.add((Course) o);
			}
			return list;
		} catch (Exception e) {
			throw e;
		}
	}
	
	public Course findById(Long id) {
		return this.em.find(Course.class, id);
	}
	
	// Both save and update
	/**
	 * The entitymanager keeps track of everything that happens inside a transaction -
	 * If on line 53, we put a new line and then said course.setName("New Name"),
	 * you wouldnt have to then again call this.em.persist - since this method is annotated
	 * with @Transactional, everything happens within 1 transaction, even after you've called persist()
	 * .... the entitymanager keeps track of all changes to an entity within a single transaction
	 * @param course
	 */
	@Transactional
	public Course save(Course course) {
		if (null == course.getId()) {
			this.em.persist(course);
		} else {
			this.em.merge(course);
		}
		return course;
	}
	
	@Transactional
	public void deleteCourse(Course course) {
		if (this.em.contains(course)) {
			this.em.remove(course);
		} else {
			this.em.remove(this.em.merge(course));
		}
	}
	
	public void deleteCourseById(Long id) {
		Course course = findById(id);
		this.deleteCourse(course);
	}

}

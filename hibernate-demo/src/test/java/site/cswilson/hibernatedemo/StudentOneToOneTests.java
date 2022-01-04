package site.cswilson.hibernatedemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import site.cswilson.hibernatedemo.entity.Address;
import site.cswilson.hibernatedemo.entity.Student;
import site.cswilson.hibernatedemo.repository.StudentRepository;

@SpringBootTest
public class StudentOneToOneTests {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    StudentRepository studentRepo;

    @Autowired
    EntityManager em;

    @Test
    @Transactional
    public void retrieveStudentFromAddress() {
        Address address = this.em.find(Address.class, 1L);
        logger.info("Address found with id 1 -> {}", address.toString());
        Student student = address.getStudent();
        logger.info("Student associated should be me -> {}", student.toString());
        Student fetchedStudent = this.em.find(Student.class, 1L);
        assertEquals(fetchedStudent.getFirstName(), student.getFirstName());
    }

    // @Test
    // @Transactional
    // public void retrieveStudentFromStudentGrade
}

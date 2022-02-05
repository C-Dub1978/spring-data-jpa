package site.cswilson.hibernatedemo;

import javax.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import site.cswilson.hibernatedemo.entity.Student;
import site.cswilson.hibernatedemo.repository.StudentRepository;

@SpringBootTest
public class StudentRepoTest {

  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  StudentRepository studentRepo;

  @Autowired
  EntityManager em;

  @Test
  public void retreiveStudentAndAddress() throws Exception {
    try {
      Student student = em.find(Student.class, 1L);
      logger.info("Student found -> {}", student);
      logger.info("Address -> {}", student.getAddress());
    } catch (Exception e) {
      logger.info("Just got WILD!!!!!!!!!!!", e.toString());
      throw new Exception(e);
    }
  }
}

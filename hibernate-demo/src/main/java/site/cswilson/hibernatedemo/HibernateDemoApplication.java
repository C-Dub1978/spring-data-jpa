package site.cswilson.hibernatedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import site.cswilson.hibernatedemo.repository.CourseRepository;
import site.cswilson.hibernatedemo.repository.StudentRepository;

@SpringBootApplication
public class HibernateDemoApplication implements CommandLineRunner {

  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private CourseRepository courseRepository;

  @Autowired
  private StudentRepository studentRepository;

  public static void main(String[] args) {
    SpringApplication.run(HibernateDemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    // logger.info(
    //   "Getting Course by id 1 -> {}",
    //   this.courseRepository.findById(1L).toString()
    // );
    // logger.info("Deleting Course by id 1 -> {}");
    // this.courseRepository.deleteCourseById(1L);
    // logger.info(
    //   "Getting Course by id 1 -> {}",
    //   this.courseRepository.findById(1L)
    // );
    // this.studentRepository.saveStudentWithAddress();
  }
}

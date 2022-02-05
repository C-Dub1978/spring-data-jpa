package site.cswilson.database.databasedemo;

import java.util.Date;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import site.cswilson.database.databasedemo.entity.Person;
import site.cswilson.database.databasedemo.jdbc.PersonJdbcDao;

// @SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  PersonJdbcDao dao;

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

    List<Person> named = dao.findByName("Perry");
    logger.info("Found by name -> {}", named.toString());

    int numberRowsDeleted = dao.deleteById(1002);
    logger.info(
      "Deleted person, number of rows deleted -> {}",
      numberRowsDeleted
    );

    Person newPerson = new Person(2001, "Jackson", "Cleveland", new Date());
    dao.insertPerson(newPerson);
    logger.info("New person is -> {}", dao.findById(newPerson.getId()));

    newPerson.setName("eljkdskfja;lkdsf");
    dao.updatePerson(newPerson);
    Person found = dao.findById(2001);
    logger.info("Updated person -> {}", found.toString());
  }
}

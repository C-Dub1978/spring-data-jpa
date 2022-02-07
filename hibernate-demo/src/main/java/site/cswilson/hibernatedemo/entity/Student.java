package site.cswilson.hibernatedemo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false)
  private String firstName;

  @Column(nullable = false)
  private String lastName;

  @OneToOne(fetch = FetchType.LAZY, mappedBy = "student")
  private Address address;

  @OneToOne(fetch = FetchType.LAZY, mappedBy = "student")
  private CourseGrade studentGrade;

  protected Student() {}

  public Student(String first, String last) {
    firstName = first;
    lastName = last;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public CourseGrade getStudentGrade() {
    return studentGrade;
  }

  public void setStudentGrade(CourseGrade studentGrade) {
    this.studentGrade = studentGrade;
  }

  @Override
  public String toString() {
    return (
      "Student [firstName=" +
      firstName +
      ", id=" +
      id +
      ", lastName=" +
      lastName +
      "]"
    );
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Student other = (Student) obj;
    if (firstName == null) {
      if (other.firstName != null) return false;
    } else if (!firstName.equals(other.firstName)) return false;
    if (id == null) {
      if (other.id != null) return false;
    } else if (!id.equals(other.id)) return false;
    if (lastName == null) {
      if (other.lastName != null) return false;
    } else if (!lastName.equals(other.lastName)) return false;
    return true;
  }
}

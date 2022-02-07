package site.cswilson.hibernatedemo.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CourseGrade implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String finalGrade;

  private Double gpa;

  // Bi-directional 1 to 1... The Owner is the one with @JoinColumn which
  // specifies the FK column in the inverse relation
  // The non-owner/inverse is still annotated with @OneToOne, but uses mappedBy
  // to to indicate that the relationship is mapped by the OTHER entity in the
  // relationship

  // OWNER - each student grade is mapped to one student. We are choosing this as the
  // owning side but you could easily swap the student to be the owner and use this
  // entity as the "mappedBy = student_id" annotation
  @OneToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "student_id", nullable = false)
  private Student student;

  // This in itself will add a course_id field to each row in the StudentGrade table.
  // Because of this, we can say that this class is the "Owning" side of the
  // relationship. Therefore we add the mapping to the non-owning Course class
  // ALWAYS ADD THE MAPPING ANNOTATION (mappedBy="") TO THE NON-OWNER!!!!!!!!
  @ManyToOne
  private Course course;

  protected CourseGrade() {}

  public CourseGrade(String finalGrade, Double gpa) {
    this.finalGrade = finalGrade;
    this.gpa = gpa;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFinalGrade() {
    return finalGrade;
  }

  public void setFinalGrade(String finalGrade) {
    this.finalGrade = finalGrade;
  }

  public Double getGpa() {
    return gpa;
  }

  public void setGpa(Double gpa) {
    this.gpa = gpa;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

  @Override
  public String toString() {
    return (
      "StudentGrade [finalGrade=" +
      finalGrade +
      ", gpa=" +
      gpa +
      ", id=" +
      id +
      "]"
    );
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result =
      prime * result + ((finalGrade == null) ? 0 : finalGrade.hashCode());
    result = prime * result + ((gpa == null) ? 0 : gpa.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CourseGrade other = (CourseGrade) obj;
    if (finalGrade == null) {
      if (other.finalGrade != null) return false;
    } else if (!finalGrade.equals(other.finalGrade)) return false;
    if (gpa == null) {
      if (other.gpa != null) return false;
    } else if (!gpa.equals(other.gpa)) return false;
    if (id == null) {
      if (other.id != null) return false;
    } else if (!id.equals(other.id)) return false;
    return true;
  }
}

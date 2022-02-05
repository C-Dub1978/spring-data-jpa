package site.cswilson.hibernatedemo.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
// If the class and table name are the same, we don't need to @Table, its just there for reference
@Table(name = "Course")
@NamedQueries(
  value = {
    @NamedQuery(name = "find_all_courses", query = "SELECT c FROM Course c"),
    @NamedQuery(
      name = "find_course_by_title",
      query = "SELECT c FROM Course c WHERE c.name LIKE '%:title%'"
    ),
  }
)
public class Course {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  // If the column name is 'name', you don't need this, its implicit
  @Column(name = "name", nullable = false)
  private String name;

  @OneToMany(mappedBy = "course")
  private List<CourseReview> courseReviews = new ArrayList<CourseReview>();

  @UpdateTimestamp
  private LocalDateTime lastUpdatedDate;

  @CreationTimestamp
  private LocalDateTime createdDate;

  public Course() {}

  public Course(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<CourseReview> getCourseReviews() {
    return this.courseReviews;
  }

  public void addCourseReview(CourseReview review) {
    this.courseReviews.add(review);
  }

  public void removeCourseReview(CourseReview review) {
    this.courseReviews.remove(review);
  }

  public Long getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Course [id=" + id + ", name=" + name + "]";
  }
}

package site.cswilson.hibernatedemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

@Entity
public class CourseReview {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column
  private String description;

  @Column(nullable = false)
  @Size(min = 1, max = 10)
  private Integer rating;

  // This in itself will add a course_id field to each row in the table.
  // Because of this, we can say that this class is the "Owning" side of the
  // relationship. Therefore we add the mapping to the non-owning Course class
  // ALWAYS ADD THE MAPPING ANNOTATION (mappedBy="") TO THE NON-OWNER!!!!!!!!
  @ManyToOne
  private Course course;

  protected CourseReview() {}

  public CourseReview(String description, Integer rating) {
    this.description = description;
    this.rating = rating;
  }

  public CourseReview(String description, Integer rating, Course course) {
    this.description = description;
    this.rating = rating;
    this.course = course;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
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
      "CourseReview [description=" +
      description +
      ", id=" +
      id +
      ", rating=" +
      rating +
      "]"
    );
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result =
      prime * result + ((description == null) ? 0 : description.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((rating == null) ? 0 : rating.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CourseReview other = (CourseReview) obj;
    if (description == null) {
      if (other.description != null) return false;
    } else if (!description.equals(other.description)) return false;
    if (id == null) {
      if (other.id != null) return false;
    } else if (!id.equals(other.id)) return false;
    if (rating == null) {
      if (other.rating != null) return false;
    } else if (!rating.equals(other.rating)) return false;
    return true;
  }
}

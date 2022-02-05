package site.cswilson.hibernatedemo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Address implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(nullable = false)
  private String streetName;

  @Column(nullable = false)
  private Integer streetNumber;

  @Column(nullable = false)
  private Integer zipCode;

  @Column(nullable = false)
  private String city;

  @Column(nullable = false)
  private String state;

  // Bi-directional 1 to 1... The Owner is the one with @JoinColumn which
  // specifies the FK column in the inverse relation (non-owner)
  // The non-owner/inverse is still annotated with @OneToOne, but uses mappedBy
  // to indicate that the relationship is mapped by the OTHER entity in the
  // relationship

  // OWNER
  @OneToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "student_id", nullable = false)
  private Student student;

  protected Address() {}

  public Address(
    String streetName,
    Integer streetNumber,
    Integer zipCode,
    String city,
    String state
  ) {
    this.streetName = streetName;
    this.streetNumber = streetNumber;
    this.zipCode = zipCode;
    this.city = city;
    this.state = state;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public Integer getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(Integer streetNumber) {
    this.streetNumber = streetNumber;
  }

  public Integer getZipCode() {
    return zipCode;
  }

  public void setZipCode(Integer zipCode) {
    this.zipCode = zipCode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }
}

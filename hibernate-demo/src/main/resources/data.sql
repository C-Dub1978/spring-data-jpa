INSERT INTO COURSE(name, created_date, last_updated_date) VALUES('JPA in 50 Steps', sysDate(), sysDate());
INSERT INTO COURSE(name, created_date, last_updated_date) VALUES('Angular Fundamentals', sysDate(), sysDate());
INSERT INTO COURSE(name, created_date, last_updated_date) VALUES('React Redux', sysDate(), sysDate());
INSERT INTO COURSE(name, created_date, last_updated_date) VALUES('Javascript - Understanding the Weird Parts', sysDate(), sysDate());
INSERT INTO COURSE(name, created_date, last_updated_date) VALUES('Vue - an Intro', sysDate(), sysDate());
INSERT INTO COURSE(name, created_date, last_updated_date) VALUES('Advanced Java', sysDate(), sysDate());
INSERT INTO COURSE(name, created_date, last_updated_date) VALUES('Eloquent Javascript', sysDate(), sysDate());
INSERT INTO COURSE(name, created_date, last_updated_date) VALUES('How to Win in the Stock Market', sysDate(), sysDate());
INSERT INTO COURSE(name, created_date, last_updated_date) VALUES('Understanding Backbone.js', sysDate(), sysDate());
INSERT INTO COURSE(name, created_date, last_updated_date) VALUES('Intermediate Spanish Speaking', sysDate(), sysDate());
INSERT INTO COURSE(name, created_date, last_updated_date) VALUES('API and Microservice Architecture', sysDate(), sysDate());
INSERT INTO COURSE(name, created_date, last_updated_date) VALUES('Spring Boot Fundamentals', sysDate(), sysDate());
INSERT INTO COURSE(name, created_date, last_updated_date) VALUES('Spring Deep Dive', sysDate(), sysDate());
INSERT INTO COURSE(name, created_date, last_updated_date) VALUES('Intro to Spring Data JPA', sysDate(), sysDate());
INSERT INTO COURSE(name, created_date, last_updated_date) VALUES('MEAN Stack Architecture', sysDate(), sysDate());

INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Great Course!', 8, 10);
INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Great Course!', 8, 1);
INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Could use more compassion', 4, 3);
INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Excellent instructor', 10, 2);
INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Rough homework', 6, 1);
INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Not really into the group studies', 2, 4);
INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Was good', 5, 4);
INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Utterly forgettable', 1, 4);
INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('The instructor smelled like alcohol', 3, 5);
INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Very intruiging and engagin teacher', 9, 6);
INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('I fell asleep half the semester and still passed!', 8, 7);
INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Meh.....', 3, 7);
INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Very involved teacher and great content', 10, 8);
INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Challengin but very rewarding, instructor was great', 9, 6);
INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Not bad, not good', 4, 8);
INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Sweet course', 9, 9);
INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('The chick in front of me was SMOKING hot', 5, 10);
INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('The instructor let us drink in class', 10, 10);
INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Very intruiging and engagin teacher', 9, 10);
-- INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Great Course!', 8, 10);
-- INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Could use more compassion', 4, 11);
-- INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Excellent instructor', 10. 11);
-- INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Rough homework', 6, 12);
-- INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Not really into the group studies', 2, 13);
-- INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Was good and somewhat engaging', 5, 14);
-- INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Utterly forgettable', 1, 14);
-- INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('The instructor smelled like high powered chronic/indica', 9, 14);
-- INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Very intruiging and engagin teacher', 9, 15);
-- INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Rough homework', 6, 15);
-- INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Not really into the group studies', 2, 10);
-- INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Was good and somewhat engaging', 5, 2);
-- INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Utterly forgettable', 1, 1);
-- INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('The instructor smelled like high powered chronic/indica', 9, 3);
-- INSERT INTO COURSE_REVIEW(description, rating, course_id) VALUES('Very intruiging and engagin teacher', 9, 14);

INSERT INTO STUDENT(first_name, last_name) VALUES('Chris', 'Wilson');
INSERT INTO STUDENT(first_name, last_name) VALUES('Joseph', 'Zoss');
INSERT INTO STUDENT(first_name, last_name) VALUES('Paulina', 'Jessup');
INSERT INTO STUDENT(first_name, last_name) VALUES('Bundit', 'Hollister');
INSERT INTO STUDENT(first_name, last_name) VALUES('Alice', 'Steadfast');
INSERT INTO STUDENT(first_name, last_name) VALUES('Kevin', 'Kravin');
INSERT INTO STUDENT(first_name, last_name) VALUES('Krason', 'Kersey');
INSERT INTO STUDENT(first_name, last_name) VALUES('Zeuss', 'FuckedUp');
INSERT INTO STUDENT(first_name, last_name) VALUES('Barnabit', 'Wasabi');
INSERT INTO STUDENT(first_name, last_name) VALUES('Jimmy-Jon', 'Jackass');
INSERT INTO STUDENT(first_name, last_name) VALUES('Paul', 'Blaustein');
INSERT INTO STUDENT(first_name, last_name) VALUES('Zeus', 'Rodriguez-Guerrero');
INSERT INTO STUDENT(first_name, last_name) VALUES('Franklin', 'Clinton');
INSERT INTO STUDENT(first_name, last_name) VALUES('Michael', 'DeSanta');
INSERT INTO STUDENT(first_name, last_name) VALUES('Trevor', 'Phillips');

INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state, student_id)
VALUES('Pine Valley Place', 330, 91362, 'Westlake Village', 'CA', 1);
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state, student_id)
VALUES('Upper Ranch Road', 1045, 91360, 'Thousand Oaks', 'CA', 2);
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state, student_id)
VALUES('Hillcrest Ave', 232, 91361, 'Thousand Oaks', 'CA', 3);
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state, student_id)
VALUES('Kanan Rd', 1109, 91360, 'Agoura Hills', 'CA', 4);
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state, student_id)
VALUES('Thousand Oaks Blvd', 6769, 91363, 'Thousand Oaks', 'CA', 5);
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state, student_id)
VALUES('Placerville Rd', 32, 71823, 'Philadelphia', 'PA', 6);
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state, student_id)
VALUES('Telnet Place Ave', 54333, 67121, 'Portland', 'OR', 7);
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state, student_id)
VALUES('Martin Luther King Blvd', 543, 90223, 'Denver', 'CO', 8);
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state, student_id)
VALUES('Granville Ave', 223, 80520, 'Firestone', 'CO', 9);
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state, student_id)
VALUES('Delanyville Rd', 12, 89091, 'Waialua', 'HI', 10);
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state, student_id)
VALUES('NW 59th St', 5811, 98105, 'Seattle', 'WA', 11);
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state, student_id)
VALUES('Orchard Valley Parkway N', 67, 91002, 'Baton Rouge', 'LA', 12);
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state, student_id)
VALUES('Eltonian St', 33292, 91001, 'Chicago', 'IL', 13);
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state, student_id)
VALUES('Dresden Ave', 192, 99801, 'Buffalo', 'NY', 14);
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state, student_id)
VALUES('Andalasnes Dr', 111, 80101, 'Jacksonville', 'FL', 15);

INSERT INTO STUDENT_GRADE(final_grade, gpa, student_id) VALUES('A+', 4.0, 1);
INSERT INTO STUDENT_GRADE(final_grade, gpa, student_id) VALUES('C', 2.8, 2);
INSERT INTO STUDENT_GRADE(final_grade, gpa, student_id) VALUES('B+', 3.5, 3);
INSERT INTO STUDENT_GRADE(final_grade, gpa, student_id) VALUES('A-', 3.9, 4);
INSERT INTO STUDENT_GRADE(final_grade, gpa, student_id) VALUES('F', 1.0, 5);
INSERT INTO STUDENT_GRADE(final_grade, gpa, student_id) VALUES('D+', 2.1, 6);
INSERT INTO STUDENT_GRADE(final_grade, gpa, student_id) VALUES('C', 2.75, 7);
INSERT INTO STUDENT_GRADE(final_grade, gpa, student_id) VALUES('B-', 3.2, 8);
INSERT INTO STUDENT_GRADE(final_grade, gpa, student_id) VALUES('F', 1.0, 9);
INSERT INTO STUDENT_GRADE(final_grade, gpa, student_id) VALUES('A-', 3.75, 10);
INSERT INTO STUDENT_GRADE(final_grade, gpa, student_id) VALUES('B', 3.25, 11);
INSERT INTO STUDENT_GRADE(final_grade, gpa, student_id) VALUES('C+', 2.9, 12);
INSERT INTO STUDENT_GRADE(final_grade, gpa, student_id) VALUES('C-', 2.25, 13);
INSERT INTO STUDENT_GRADE(final_grade, gpa, student_id) VALUES('D', 2.0, 14);
INSERT INTO STUDENT_GRADE(final_grade, gpa, student_id) VALUES('D+', 2.1, 15);
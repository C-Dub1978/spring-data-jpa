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

INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state)
VALUES('Pine Valley Place', 330, 91362, 'Westlake Village', 'CA');
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state)
VALUES('Upper Ranch Road', 1045, 91360, 'Thousand Oaks', 'CA');
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state)
VALUES('Hillcrest Ave', 232, 91361, 'Thousand Oaks', 'CA');
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state)
VALUES('Kanan Rd', 1109, 91360, 'Agoura Hills', 'CA');
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state)
VALUES('Thousand Oaks Blvd', 6769, 91363, 'Thousand Oaks', 'CA');
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state)
VALUES('Placerville Rd', 32, 71823, 'Philadelphia', 'PA');
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state)
VALUES('Telnet Place Ave', 54333, 67121, 'Portland', 'OR');
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state)
VALUES('Martin Luther King Blvd', 543, 90223, 'Denver', 'CO');
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state)
VALUES('Granville Ave', 223, 80520, 'Firestone', 'CO');
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state)
VALUES('Delanyville Rd', 12, 89091, 'Waialua', 'HI');
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state)
VALUES('NW 59th St', 5811, 98105, 'Seattle', 'WA');
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state)
VALUES('Orchard Valley Parkway N', 67, 91002, 'Baton Rouge', 'LA');
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state)
VALUES('Eltonian St', 33292, 91001, 'Chicago', 'IL');
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state)
VALUES('Dresden Ave', 192, 99801, 'Buffalo', 'NY');
INSERT INTO ADDRESS(street_name, street_number, zip_code, city, state)
VALUES('Andalasnes Dr', 111, 80101, 'Jacksonville', 'FL');

INSERT INTO STUDENT(first_name, last_name, address_id) VALUES('Chris', 'Wilson', 1);
INSERT INTO STUDENT(first_name, last_name, address_id) VALUES('Joseph', 'Zoss', 2);
INSERT INTO STUDENT(first_name, last_name, address_id) VALUES('Paulina', 'Jessup', 3);
INSERT INTO STUDENT(first_name, last_name, address_id) VALUES('Bundit', 'Hollister', 4);
INSERT INTO STUDENT(first_name, last_name, address_id) VALUES('Alice', 'Steadfast', 5);
INSERT INTO STUDENT(first_name, last_name, address_id) VALUES('Kevin', 'Kravin', 6);
INSERT INTO STUDENT(first_name, last_name, address_id) VALUES('Krason', 'Kersey', 7);
INSERT INTO STUDENT(first_name, last_name, address_id) VALUES('Zeuss', 'FuckedUp', 8);
INSERT INTO STUDENT(first_name, last_name, address_id) VALUES('Barnabit', 'Wasabi', 9);
INSERT INTO STUDENT(first_name, last_name, address_id) VALUES('Jimmy-Jon', 'Jackass', 10);
INSERT INTO STUDENT(first_name, last_name, address_id) VALUES('Paul', 'Blaustein', 11);
INSERT INTO STUDENT(first_name, last_name, address_id) VALUES('Zeus', 'Rodriguez-Guerrero', 12);
INSERT INTO STUDENT(first_name, last_name, address_id) VALUES('Franklin', 'Clinton', 13);
INSERT INTO STUDENT(first_name, last_name, address_id) VALUES('Michael', 'DeSanta', 14);
INSERT INTO STUDENT(first_name, last_name, address_id) VALUES('Trevor', 'Phillips', 15);

INSERT INTO COURSE_REVIEW(description, rating) VALUES('Great Course!', 8)
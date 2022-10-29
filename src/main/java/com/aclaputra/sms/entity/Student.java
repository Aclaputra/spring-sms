package com.aclaputra.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * purpose : model table students
 *
 * Entity annotation from Data JPA
 * Initialize database "students" to mysql
 **/
@Entity
@Table(name = "students")
public class Student {

  /**
   * make id primary key
   **/
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  /**
   * modified column firstName to first_name
   **/
  @Column(name = "first_name", nullable = false)
  private String firstName;

  /**
   * modified column lastName to last_name
   **/
  @Column(name = "last_name")
  private String lastName;

  /**
   *  modified column email to email
   **/
  @Column(name = "email")
  private String email;

  /**
   * default constructor
   **/
  public Student() {

  }
  /**
   * parameter constuctor
   **/
  public Student(String firstName, String lastName, String email) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  /**
   * Getters and Setters (should use lombok later ._./)
   **/
  public Long getId() {return id;}
  public void setId(Long id) {this.id = id;}

  public String getFirstName() {return firstName;}
  public void setFirstName(String firstName) {this.firstName = firstName;}

  public String getLastName() {return lastName;}
  public void setLastName(String lastName) {this.lastName = lastName;}

  public String getEmail() {return email;}
  public void setEmail(String email) {this.email = email;}
  
}

package com.aclaputra.sms.repository;

import com.aclaputra.sms.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * javadoc references for JpaRepository and SimpleJpaRepository:
 * https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html
 * https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/support/SimpleJpaRepository.html
 **/
public interface StudentRepository extends JpaRepository<Student, Long> {

}

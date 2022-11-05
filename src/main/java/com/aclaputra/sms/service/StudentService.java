package com.aclaputra.sms.service;

import java.util.List;

import com.aclaputra.sms.entity.Student;

/**
 *  explanation: An interface is an abstract "class" that is used to group related methods with "empty" bodies:
To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). 
 **/
public interface StudentService {
  List<Student> getAllStudents();

  Student saveStudent(Student student);

  Student getStudentById(Long id);

  Student updateStudent(Student student);

  void deleteStudentById(Long id);
}

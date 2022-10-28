package com.aclaputra.sms.service.impl;

import java.util.List;
import com.aclaputra.sms.service.StudentService;
import com.aclaputra.sms.repository.StudentRepository;
import com.aclaputra.sms.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

  private StudentRepository studentRepository;

  /**
   * constructor with parameter
   **/
  public StudentServiceImpl(StudentRepository studentRepository) {
    super();
    this.studentRepository = studentRepository;
  }

  @Override
  public List<Student> getAllStudents() {
    return studentRepository.findAll();
  }
}

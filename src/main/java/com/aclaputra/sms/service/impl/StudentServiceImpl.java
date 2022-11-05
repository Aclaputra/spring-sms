package com.aclaputra.sms.service.impl;

import java.util.List;
import com.aclaputra.sms.service.StudentService;
import com.aclaputra.sms.repository.StudentRepository;
import com.aclaputra.sms.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
  /**
   * purpose get studentRepository
   **/
  private StudentRepository repository;

  /**
   * constructor with parameter dari 
   **/
  public StudentServiceImpl(StudentRepository studentRepository) {
    super();
    this.repository = studentRepository;
  }

  /**
   *  override getAllStudents pada StudentService
   **/
  @Override
  public List<Student> getAllStudents() {return repository.findAll();}

  @Override
  public Student saveStudent(Student student) {return repository.save(student);}

  @Override
  public Student getStudentById(Long id) {return repository.findById(id).get();}

  @Override
  public Student updateStudent(Student student) {return repository.save(student);}

  @Override
  public void deleteStudentById(Long id) {repository.deleteById(id);}
}

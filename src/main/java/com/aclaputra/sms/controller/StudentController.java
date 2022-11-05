package com.aclaputra.sms.controller;

import com.aclaputra.sms.entity.Student;
import com.aclaputra.sms.service.StudentService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * purpose : controller C.R.U.D dari Student
 **/
@Controller
public class StudentController {

  /**
   * purpose : get StudentService
   * {@link StudentService}
   **/
  private StudentService service;

  /**
   * parameter constructor
   **/
  public StudentController(StudentService studentService) {
    super();
    this.service = studentService;
  }

  /**
   * handle method to handle list students and return model and view
   **/
  @GetMapping("/students")
  public String listStudents(Model model) {
    model.addAttribute("students", service.getAllStudents());
    // it return view students.html
    return "students";
  }

  @GetMapping("/students/new")
  public String createStudentForm(Model model) {

    // Create student object to hold student from data
    Student student = new Student();
    model.addAttribute("student", student);
    return "create_student";

  }

  @PostMapping("/students")
  public String saveStudent(@ModelAttribute("student") Student student) {
    service.saveStudent(student);
    return "redirect:/students";
  }

  @GetMapping("/students/edit/{id}")
  public String editStudentForm(@PathVariable Long id, Model model) {
    model.addAttribute("student", service.getStudentById(id));
    return "edit_student";
  }

  @PostMapping("/students/{id}")
  public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {
    // get student from database by id
    Student existingStudent = service.getStudentById(id);

    existingStudent.setId(id);
    existingStudent.setFirstName(student.getFirstName());
    existingStudent.setLastName(student.getLastName());
    existingStudent.setEmail(student.getEmail());

    // save updated student object
    service.updateStudent(existingStudent);
    return "redirect:/students";
  }

  // handler method to handle  delete student request
  @GetMapping("/students/{id}")
  public String deleteStudent(@PathVariable Long id) {
    service.deleteStudentById(id);
    return "redirect:/students";
  }
}

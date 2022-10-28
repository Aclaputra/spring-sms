package com.aclaputra.sms.controller;

import com.aclaputra.sms.service.StudentService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class StudentController {

  private StudentService studentService;

  /**
   * parameter constructor
   **/
  public StudentController(StudentService studentService) {
    super();
    this.studentService = studentService;
  }

  /**
   * handle method to handle list students and return model and view
   **/
  public String listStudents(Model model) {
    model.addAttribute("students", studentService.getAllStudents());
    return "students";
  }

}

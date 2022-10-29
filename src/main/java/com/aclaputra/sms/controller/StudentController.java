package com.aclaputra.sms.controller;

import com.aclaputra.sms.service.StudentService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

}

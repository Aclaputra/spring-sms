package com.aclaputra.sms;

import com.aclaputra.sms.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.aclaputra.sms.entity.Student;
import java.util.ArrayList;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {
  
  @Autowired
  private StudentRepository studentRepository;

  @PostConstruct
  public void initStudent() {
    /*
    ArrayList<Student> student = new ArrayList<>();

    student.add(new Student("Acla", "Putra", "aclalead@gmail.com"));
    student.add(new Student("Yuaris", "Arham", "yuaris@gmail.com"));
    student.add(new Student("Alif", "Fahd Zaky", "alif@gmail.com"));

    studentRepository.saveAll(student);
    */
  }

	public static void main(String[] args) {
    // memanggil class Application to core SpringApplication to run.
		SpringApplication.run(Application.class, args);
	}
}

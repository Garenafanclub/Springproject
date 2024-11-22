package com.SpringJDBCPrac.SpringJDBCCon;

import com.SpringJDBCPrac.SpringJDBCCon.Model.Student;
import com.SpringJDBCPrac.SpringJDBCCon.Service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcConApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcConApplication.class, args);

		Student student = context.getBean(Student.class);
		student.setId(12);
		student.setMarks(90);
		student.setName("Dada");

		StudentService studentService = context.getBean(StudentService.class);
		studentService.addData(student);

		System.out.println(studentService.getStudent());

	}

}

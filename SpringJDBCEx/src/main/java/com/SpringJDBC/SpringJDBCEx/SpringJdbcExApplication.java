package com.SpringJDBC.SpringJDBCEx;

import com.SpringJDBC.SpringJDBCEx.model.Student;
import com.SpringJDBC.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);

		Student student = context.getBean(Student.class);
		student.setRollNo(110);
		student.setName("Mayank Bansal");
		student.setMarks(90);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(student);

		List<Student> studentList = service.getStudents();
		System.out.println(studentList);

	}
}

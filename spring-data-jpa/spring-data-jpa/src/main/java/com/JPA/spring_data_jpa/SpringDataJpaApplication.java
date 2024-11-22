package com.JPA.spring_data_jpa;

import com.JPA.spring_data_jpa.Repo.StudentRepo;
import com.JPA.spring_data_jpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.codec.StringDecoder;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

		StudentRepo studentRepo = context.getBean(StudentRepo.class);

//		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
//		Student s3 = context.getBean(Student.class);
//
//		s1.setId(101);
//		s1.setName("Mayank");
//		s1.setMarks(97);
//
		s2.setId(105);
		s2.setName("Varun");
		s2.setMarks(65);
//
//		s3.setId(103);
//		s3.setName("George");
//		s3.setMarks(76);
//
//		studentRepo.save(s2);
//		studentRepo.save(s3);


		studentRepo.save(s2);
		studentRepo.delete(s2);

		//System.out.println(studentRepo.findAll());

//		Optional<Student> s = studentRepo.findById(104);
//		System.out.println(s.orElse(new Student()));
//		System.out.println(studentRepo.findById(103));
//
//		System.out.println(studentRepo.findByName("George"));
//		System.out.println(studentRepo.findByMarks(76));
//		System.out.println(studentRepo.findByMarksGreaterThan(77));

	}

}

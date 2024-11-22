package com.JPA.spring_data_jpa.Repo;

import com.JPA.spring_data_jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    @Query("select s from Student s where s.name = ?1")  // ?1 1 for first para.
    List<Student> findByName(String name);
    List<Student> findByMarks(int marks);
    List<Student> findByMarksGreaterThan(int marks);

}

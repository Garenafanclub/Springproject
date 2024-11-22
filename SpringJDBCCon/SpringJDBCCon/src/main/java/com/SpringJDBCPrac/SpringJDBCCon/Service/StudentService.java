package com.SpringJDBCPrac.SpringJDBCCon.Service;

import com.SpringJDBCPrac.SpringJDBCCon.Model.Student;
import com.SpringJDBCPrac.SpringJDBCCon.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo studentRepo;

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }

    @Autowired
    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void addData(Student student)
    {
        studentRepo.save(student);
    }

    public List<Student> getStudent()
    {
        return studentRepo.findAll();
    }
}

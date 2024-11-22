package com.SpringJDBCPrac.SpringJDBCCon.Repo;

import com.SpringJDBCPrac.SpringJDBCCon.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student student) {
        String sql = "insert into student (id,name,marks) values (?,?,?)";
           int rowAffected =  jdbcTemplate.update(sql,student.getId(),student.getName(),student.getMarks());
           System.out.println("RowsAffected: " + rowAffected);
    }

    public List<Student> findAll()
    {
        String sql = "Select * from student";
        RowMapper<Student> rowMapper = (rs, rowNum) -> {
           Student student = new Student();
           student.setId(rs.getInt("id"));
           student.setName(rs.getString("name"));
           student.setMarks(rs.getInt("marks"));
           return student;
        };
        return jdbcTemplate.query(sql,rowMapper);
    }
}

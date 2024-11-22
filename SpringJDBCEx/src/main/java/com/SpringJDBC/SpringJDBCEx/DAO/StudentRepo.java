package com.SpringJDBC.SpringJDBCEx.DAO;

import com.SpringJDBC.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

    public void save(Student s)
    {
        String sql = "insert into student (rollNo, name, marks) values (?,?,?)";

        int rowsEffected = jdbcTemplate.update(sql,s.getRollNo(),s.getName(),s.getMarks());
        System.out.println(rowsEffected + " Effected");
    }

    public List<Student> findAll() {
//        List<Student> studentList = new ArrayList<>();
//        return studentList;
        String sql = "Select * from student";

        RowMapper<Student> rowMapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
               Student s = new Student();
               s.setRollNo(rs.getInt("rollNo"));
               s.setName(rs.getString("name"));
               s.setMarks(rs.getInt("marks"));
               return s;
            }
        };
       return jdbcTemplate.query(sql, rowMapper);
    }
}

/*
return jdbcTemplate.query(sql, (rs, rowNum) -> {
           Student s = new Student();
           s.setRollNo(rs.getInt("rollNo"));
           s.setName(rs.getString("name"));
           s.setMarks(rs.getInt("marks"));
           return s;
       });
 */

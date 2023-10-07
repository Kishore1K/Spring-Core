package com.jdbc.DAO;

import com.jdbc.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("studentImpl")
public class studentDAOImpl implements studentDAO{


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {
        String query = "insert into student values(?, ?, ?, ?)";
        return this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getEmail(), student.getCity());
    }

    @Override
    public int changeData(Student student) {
        String query = "update student set name = ? , city = ? where email = ?";
        return this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getEmail());
    }

    @Override
    public int deleteData(String email) {

        String query = "delete from student where email = ?";
        return this.jdbcTemplate.update(query, email);
    }

    @Override
    public Student getStudent(String email) {
        String query = "select * from student where email = ?";
        RowMapper<Student> rowMapper = new RowMapperImpl();

        return this.jdbcTemplate.queryForObject(query, rowMapper, email);
    }

    @Override
    public List<Student> getStudents() {
        String query = "select * from student";
        return this.jdbcTemplate.query(query,  new RowMapperImpl());
    }


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}

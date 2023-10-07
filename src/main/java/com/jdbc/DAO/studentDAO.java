package com.jdbc.DAO;

import com.jdbc.entity.Student;

import java.util.List;

public interface studentDAO {
    public  int insert(Student student);

    public  int changeData(Student student);

    public  int deleteData(String email);

    public  Student getStudent(String email);

    public List<Student> getStudents();

}

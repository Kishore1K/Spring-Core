package com.jdbc;

import com.jdbc.DAO.studentDAO;
import com.jdbc.DAO.studentDAOImpl;
import com.jdbc.entity.Student;
import com.jsp.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfig.class);
//        System.out.println("context.getBean(\"jdbcTemplate\") = " + context.getBean("jdbcTemplate"));

        Student student = new Student(8, "Anil Kumar", "anil@gmail.com", "KA");
//        System.out.println("context = " + context.getBean("studentImpl", studentDAO.class).insert(student));
//        System.out.println("context.getBean(\"studentImpl\", studentDAO.class).changeData(student) = " + context.getBean("studentImpl", studentDAO.class).changeData(student));
//        System.out.println("context.getBean(\"studentImpl\", studentDAO.class).deleteData(\"anil@gmail.com\") = " + context.getBean("studentImpl", studentDAO.class).deleteData("anil@gmail.com"));

//        System.out.println("Find By EmailId = " + context.getBean("studentImpl", studentDAO.class).getStudent("reddykishore@gmail.com"));
        List<Student> studentList= context.getBean("studentImpl", studentDAO.class).getStudents();
        for ( Student s: studentList) {
            System.out.println("student = " + s);

        }
//        studentList.forEach( s -> System.out::println);

    }
}

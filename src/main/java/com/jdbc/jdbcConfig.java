package com.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import  com.jdbc.DAO.studentDAOImpl;
import  com.jdbc.DAO.studentDAO;
@Configuration
@ComponentScan(basePackages = {"com.jdbc"})
public class jdbcConfig {
    @Bean("ds")
    public DataSource getDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource( );
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        ds.setUsername("root");
        ds.setPassword("");
        return  ds;

    }

    @Bean("jdbcTemplate")
    public JdbcTemplate getJdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return  jdbcTemplate;
    }

//    @Bean("studentImpl")
//    public  studentDAO getStudentDAO(){
//        studentDAOImpl studentDAOImpl = new studentDAOImpl();
//        studentDAOImpl.setJdbcTemplate(getJdbcTemplate());
//        return studentDAOImpl;
//    }

}

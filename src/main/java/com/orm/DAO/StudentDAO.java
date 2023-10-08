package com.orm.DAO;

import com.orm.Entity.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;
import java.util.List;

public class StudentDAO {

    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    @Transactional
    public  Integer insert(Student student){
        return (Integer) this.hibernateTemplate.save(student);
    }

    public  Student getStudent(int id){
        return  this.hibernateTemplate.get(Student.class, id);
    }

    public List<Student> getAllStudents(){
        return this.hibernateTemplate.loadAll(Student.class);
    }

    @Transactional
    public  void deleteStudent(int id){
        Student student=  this.hibernateTemplate.get(Student.class, id);
        this.hibernateTemplate.delete(student);

    }

    @Transactional
    public void updateStudent(Student student){
         this.hibernateTemplate.update(student);
    }
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}

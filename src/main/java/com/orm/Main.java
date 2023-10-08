package com.orm;

import com.orm.DAO.StudentDAO;
import com.orm.Entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("orm_config.xml");

        StudentDAO studentDAO = context.getBean("studentDAO", StudentDAO.class);

       /* List<Student> students = new ArrayList<>();
        students.add(new Student(6, "ajay", "ajay@gmail.com", "shvimaoga"));
        students.add(new Student(7, "manoj", "manoj@gmail.com", "ch-nagra"));
        students.add(new Student(8, "ani", "ani@gmail.com", "mys"));


       *//* for(Student s: students){
            System.out.println("Insert= " + studentDAO.insert(s));
        }
*//*
        System.out.println("Fetching student");
        System.out.println("studentDAO.getStudent(\"ani@gmail.com\") = " + studentDAO.getStudent(3));

        System.out.println("Deleteing student");
        studentDAO.deleteStudent(7);

        System.out.println("Fetching all Students");

        System.out.println(studentDAO.getAllStudents());

        System.out.println("Updating student");
        studentDAO.updateStudent(new Student(3, "Ankush", "ankush1@gmail.com", "KA"));

        System.out.println("Fetching all Students");

        System.out.println(studentDAO.getAllStudents());*/
        System.out.println("-------------------------------------");
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        while (true){
            System.out.println("PRESS 1: To add Student");
            System.out.println("Press 2: Display All students");
            System.out.println("Press 3: Update Student details");
            System.out.println("Press 4: Delete Student");
            System.out.println("Press 5: View  Single Students");
            System.out.println("Press 6: Exit");


            try{
                int input = Integer.parseInt(bufferedReader.readLine());
                switch (input){
                    case 1:
                        System.out.println("Enter Student id");
                        int id = Integer.parseInt(bufferedReader.readLine());
                        System.out.println("Enter name");
                        String name = bufferedReader.readLine();
                        System.out.println("Enter email");
                        String email = bufferedReader.readLine();
                        System.out.println("Enter Address");
                        String addr =bufferedReader.readLine();

                        System.out.println(studentDAO.insert(new Student(id, name, email, addr)));
                        break;
                    case 2:
                        System.out.println("List of Students : ");
                        List<Student> studentList = studentDAO.getAllStudents();
                        System.out.println("-------------------------------------------------");

                        for ( Student s : studentList){
                            System.out.println("| Name : " + s.getName()+ "| Email Id : "+ s.getEmail()+ "| Address : "+ s.getAddress()+" |");
                        }
                        System.out.println();
                        System.out.println("--------------------------------------------------");
                        System.out.println();
                        break;
                    case 3:

                        System.out.println("Enter Student id");
                         id = Integer.parseInt(bufferedReader.readLine());
                        System.out.println("Enter name");
                         name = bufferedReader.readLine();
                        System.out.println("Enter email");
                         email = bufferedReader.readLine();
                        System.out.println("Enter Address");
                         addr =bufferedReader.readLine();
                        studentDAO.updateStudent(new Student(id, name, email, addr));
                        System.out.println("Updated Details of student");
                        Student student1 = studentDAO.getStudent(id);
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("| Name : " + student1.getName()+ "| Email Id : "+ student1.getEmail()+ "| Address : "+ student1.getAddress()+" |");
                        System.out.println("-----------------------------------------------------------------");
                        break;
                    case 4:
                        System.out.println("Enter the student Id ");
                        studentDAO.deleteStudent(Integer.parseInt(bufferedReader.readLine()));
                        System.out.println("Student Deleted ");
                        break;
                    case 5:
                        System.out.println("Enter the student id");
                        Student student= studentDAO.getStudent(Integer.parseInt(bufferedReader.readLine()));
                        System.out.println();
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("| Name : " + student.getName()+ "| Email Id : "+ student.getEmail()+ "| Address : "+ student.getAddress()+" |");
                        System.out.println("-----------------------------------------------------------------");
                        break;
                    case 6:
                        System.out.println("Thank You For using Application");
                        System.exit(0);

                        break;
                    default:
                        System.out.println("Pls. Enter the Correct Option");
                        break;
                }

            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }




    }
}

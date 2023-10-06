package com.jsp;

public class Student {
    private  int studentId;
    private String name;

    private String studentAddress;

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }

    public Student() {
        super();
    }

    public Student(int studentId, String name, String studentAddress) {
        this.studentId = studentId;
        this.name = name;
        this.studentAddress = studentAddress;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
}

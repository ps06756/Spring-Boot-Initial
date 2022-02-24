package com.example.springboot;

public class Student implements Comparable {
    private String firstName;
    private String lastName;
    private Integer rollNo;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public Student(String firstName, String lastName, Integer rollNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Object o) {
        Student st1 = (Student) o;
        if (rollNo < st1.getRollNo()) {
            return -1;
        }
        else if (rollNo == st1.getRollNo() ){
            return firstName.compareTo(st1.getFirstName());
        }
        else {
            return 1;
        }
    }
}

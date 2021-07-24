package com.sambit.java8features.InterviewQuestions;

import java.util.*;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        if(id == s.id){
            return 0;
        }else if(id > s.id){
            return 1;
        }else{
            return -1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                name.equals(student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(9, "Sambit"));
        list.add(new Student(1, "Rahul"));
        list.add(new Student(5, "Sabya"));
        Collections.sort(list);
        System.out.println(list);
    }
}

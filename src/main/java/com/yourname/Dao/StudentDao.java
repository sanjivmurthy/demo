package com.yourname.Dao;

import com.yourname.Entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentByID(int id);

    void removeStudentByID(int id);

    void updateStudent(Student student);

    void insertStudentToDb(Student student);
}

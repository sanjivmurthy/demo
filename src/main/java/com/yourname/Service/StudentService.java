package com.yourname.Service;

import com.yourname.Dao.StudentDao;
import com.yourname.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    @Qualifier("mongoData")
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){

        return studentDao.getAllStudents();
    }

    public Student getStudentByID(int id){
        return this.studentDao.getStudentByID(id);
    }

    public void removeStudentByID(int id) {
        this.studentDao.removeStudentByID(id);
    }

    public void updateStudent(Student student) {

        this.studentDao.updateStudent(student);
    }

    public void insertStudent(Student student) {
        this.studentDao.insertStudentToDb(student);
    }
}

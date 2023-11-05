package com.pillar.aclabs2023.services;

import com.pillar.aclabs2023.models.Student;
import com.pillar.aclabs2023.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public void updateStudent(Student updatedStudent) {
        studentRepository.save(updatedStudent);
    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id).get();
    }

    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }


}

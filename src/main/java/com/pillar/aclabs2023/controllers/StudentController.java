package com.pillar.aclabs2023.controllers;

import com.pillar.aclabs2023.models.Student;
import com.pillar.aclabs2023.services.HomeService;
import com.pillar.aclabs2023.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }


    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student ){
        studentService.addStudent(student);
    }


    @PutMapping("/updateStudent")
    public void updateStudent (@RequestBody Student updatedStudent)
    {
        studentService.updateStudent(updatedStudent);
    }

    @GetMapping("/getStudentById/{id}")
    public Student getStudentById (String id)
    {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent (@PathVariable String id)
    {
        studentService.deleteStudent(id);
    }

}

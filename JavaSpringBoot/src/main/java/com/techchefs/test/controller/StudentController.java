package com.techchefs.test.controller;

import javax.validation.Valid;

import com.techchefs.test.exception.NoSuchResourceFoundException;
import com.techchefs.test.model.Student;
import com.techchefs.test.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService service;
    
    @RequestMapping(value = "/students", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public Student createNewStudent(@RequestBody @Valid Student student) {        
        return service.saveStudent(student);
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Student getStudentById(@PathVariable Long id) {
        Student student = service.getStudent(id);
        
        if(student == null){
            throw new NoSuchResourceFoundException("Student Not Found");
        }
        return student;
    }
    
    @RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudentById(@PathVariable Long id) {
        service.deleteStudent(id);
    }
}

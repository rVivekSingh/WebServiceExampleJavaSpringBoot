package com.techchefs.test.service;


import com.techchefs.test.exception.NoSuchResourceFoundException;
import com.techchefs.test.model.Student;
import com.techchefs.test.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    
    @Autowired
    StudentRepository repo;
    
    @Override
    public Student saveStudent(Student student) {
       Student savedStudent = repo.saveAndFlush(student);
       
    	return savedStudent;
    }
    @Override
public Student getStudent(Long id) {
        return repo.findByRollNumber(id);

}

     @Override
    public Long deleteStudent(Long id) {
    	return repo.deleteByRollNumber(id);
    }
}

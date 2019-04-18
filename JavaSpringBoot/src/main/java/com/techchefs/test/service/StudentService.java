package com.techchefs.test.service;

import com.techchefs.test.model.Student;

public interface StudentService {
    public Student saveStudent(Student student);
    public Student getStudent(Long id);
    public Long deleteStudent(Long id);
}

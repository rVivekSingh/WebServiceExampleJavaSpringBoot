package com.techchefs.test.repository;

import com.techchefs.test.model.Student;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("studentRepository")
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Transactional
    Long deleteByRollNumber(Long rollNumber);
    
    Student findByRollNumber(Long rollNumber);
    
    
}

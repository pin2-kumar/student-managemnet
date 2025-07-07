package com.publicmanegementsystem;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();

    Student saveStudent(Student student);

      public Student getById(long id);


    void deleteStudentById(Long id);


}

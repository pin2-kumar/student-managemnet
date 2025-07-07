package com.publicmanegementsystem;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();

    }

    @Override
    public Student  saveStudent(Student student) {
        return studentRepository.save(student);

    }

    @Override
    public Student getById(long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }


}



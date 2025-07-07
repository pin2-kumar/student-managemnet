package com.publicmanegementsystem;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // You don't need to write anything — basic CRUD is auto-implemented
}

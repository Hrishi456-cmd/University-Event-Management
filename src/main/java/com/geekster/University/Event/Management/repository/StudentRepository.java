package com.geekster.University.Event.Management.repository;

import com.geekster.University.Event.Management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
}

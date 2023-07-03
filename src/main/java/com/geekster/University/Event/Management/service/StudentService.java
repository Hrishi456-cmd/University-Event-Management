package com.geekster.University.Event.Management.service;

import com.geekster.University.Event.Management.model.Department;
import com.geekster.University.Event.Management.model.Student;
import com.geekster.University.Event.Management.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> getStudentById(String studentId) {
        return studentRepository.findById(studentId);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

//    public Student updateStudentDepartment(String studentId, Department department) {
//        Optional<Student> optionalStudent = studentRepository.findById(studentId);
//        if (optionalStudent.isPresent()) {
//            Student student = optionalStudent.get();
//            student.setDepartment(department);
//            return studentRepository.save(student);
//        }
//        throw new IllegalArgumentException("Student not found with ID: " + studentId);
//    }

    public void deleteStudent(String studentId) {
        studentRepository.deleteById(studentId);
    }
}

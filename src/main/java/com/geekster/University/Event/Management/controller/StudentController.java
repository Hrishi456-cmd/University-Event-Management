package com.geekster.University.Event.Management.controller;

import com.geekster.University.Event.Management.model.Department;
import com.geekster.University.Event.Management.model.Student;
import com.geekster.University.Event.Management.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<Student> addStudent(@Validated @RequestBody Student student) {
        Student addedStudent = studentService.addStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedStudent);
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable String studentId) {
        return studentService.getStudentById(studentId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }

//    @PutMapping("/{studentId}/department")
//    public ResponseEntity<Student> updateStudentDepartment(@PathVariable String studentId, @RequestParam Department department) {
//        Student updatedStudent = studentService.updateStudentDepartment(studentId, department);
//        return ResponseEntity.ok(updatedStudent);
//    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable String studentId) {
        studentService.deleteStudent(studentId);
        return ResponseEntity.noContent().build();
    }
}

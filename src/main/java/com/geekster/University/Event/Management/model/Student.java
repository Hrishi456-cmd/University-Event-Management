package com.geekster.University.Event.Management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Student {
    @Id
    private String studentId;

    @NotBlank(message = "First name is required")
//    @Capitalized(message = "First name should start with a capital letter")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @Min(value = 18, message = "Age should be at least 18")
    @Max(value = 25, message = "Age should not exceed 25")
    private int age;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Department is required")
    private Department department;

}

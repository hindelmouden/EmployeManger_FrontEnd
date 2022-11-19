package com.example.app_employee.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Emplyee")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String email;

    private String JobTitle;

    private String phone;

    private String imageUrl;

    @Column(nullable = false,updatable = false)
    private String employeeCode;

}

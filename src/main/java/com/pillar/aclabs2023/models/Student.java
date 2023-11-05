package com.pillar.aclabs2023.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "student", schema = "student")
public class Student {

    @Id
    private String id;
    private String name;
    private Integer age;

}

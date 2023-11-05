package com.pillar.aclabs2023.repositories;

import com.pillar.aclabs2023.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

public interface StudentRepository extends JpaRepository<Student, String> {

}
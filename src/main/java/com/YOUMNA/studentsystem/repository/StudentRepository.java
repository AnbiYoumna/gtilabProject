package com.YOUMNA.studentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.YOUMNA.studentsystem.entities.Student;

//<student , Integer> => <name of class , type of id>

@Repository
public interface StudentRepository extends JpaRepository<Student , Integer>  {

}

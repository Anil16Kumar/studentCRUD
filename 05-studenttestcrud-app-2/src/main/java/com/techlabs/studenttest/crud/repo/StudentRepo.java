package com.techlabs.studenttest.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techlabs.studenttest.crud.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Long>{
	
	
}

package com.student.crudoperationusingspringboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.crudoperationusingspringboot.dto.StudentDto;

public interface StudentDaoRepository extends JpaRepository<StudentDto, Integer>{

	boolean existsById(int id);
}

package com.student.crudoperationusingspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.crudoperationusingspringboot.dto.StudentDto;
import com.student.crudoperationusingspringboot.servies.StudentServies;

@RestController
public class StudentController {

	@Autowired
	StudentServies studentServies;
	
	@PostMapping("/savestudent")
	public StudentDto saveStudentData(@RequestBody StudentDto sDto) {
		return studentServies.saveStudent(sDto);
	}
	@GetMapping("/savestudent/{rollNo}")
	public StudentDto getStudent(@PathVariable int rollNo){
		return studentServies.getStudentByRollNo(rollNo);
	}
	@GetMapping("/savestudent")
	public List<StudentDto> getAllStudentData(){
		return studentServies.getAllStudent();
	}
	@DeleteMapping("savestudent/{rollNo}")
	public String deleteStudentData(@PathVariable int rollNo)
	{
		return studentServies.deleteStudent(rollNo);
	}
	@PutMapping("savestudent")
	public StudentDto updateStudent(@RequestBody StudentDto sdDto)
	{
		return studentServies.updateStudent(sdDto);
	}
}
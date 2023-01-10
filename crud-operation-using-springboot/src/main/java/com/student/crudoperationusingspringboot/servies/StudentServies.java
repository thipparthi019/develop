package com.student.crudoperationusingspringboot.servies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.crudoperationusingspringboot.dao.StudentDaoRepository;
import com.student.crudoperationusingspringboot.dto.StudentDto;
import com.student.crudoperationusingspringboot.exception.IdAlredyExistException;
import com.student.crudoperationusingspringboot.exception.IdNotFoundException;

@Service
public class StudentServies {

	@Autowired
	StudentDaoRepository sDaoRepository;
	
	public StudentDto saveStudent(StudentDto sDto) {  
		
		boolean condition=sDaoRepository.existsById(sDto.getStudentRollNo());
		
		if(condition)
			
			throw new IdAlredyExistException();
		
		return sDaoRepository.save(sDto);
	}
	public StudentDto getStudentByRollNo(int rollNo)
	{
		boolean condition=sDaoRepository.existsById(rollNo);
		
		if(condition)
		{
			Optional<StudentDto> optional=sDaoRepository.findById(rollNo);
			
			return optional.get();
		}
		else {
			
			throw new IdNotFoundException();
		}
	}
	public List<StudentDto> getAllStudent()
	{
		return sDaoRepository.findAll();
	}
	public String deleteStudent(int rollNo)
	{
		StudentDto sDto=getStudentByRollNo(rollNo);
		
		if(sDto!=null)
		{
			sDaoRepository.delete(sDto);
			
			return "Student Data is deleted Sucessfully...........";
		}
		return null;
	}
	public StudentDto updateStudent(StudentDto sDto)
	{
		StudentDto existing=getStudentByRollNo(sDto.getStudentRollNo());
		if(existing!=null)
		{
			existing.setStudentName(sDto.getStudentName());
			existing.setEnglish(sDto.getEnglish());
			existing.setMaths(sDto.getMaths());
			existing.setScience(sDto.getScience());
			return sDaoRepository.save(existing);
		}
		return null;
	}
}

package second_spring_mvc.dao;

import java.util.ArrayList;

import second_spring_mvc.dto.SchoolDto;

public interface SchoolDao {

	SchoolDto saveData(SchoolDto sDto);
	SchoolDto getStuNo(int stuNo);
	ArrayList<SchoolDto> getAllStu();
	String deleteStu(int stuNo);
	String updateStu(SchoolDto sDto);
}

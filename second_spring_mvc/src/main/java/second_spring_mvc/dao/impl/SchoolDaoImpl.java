package second_spring_mvc.dao.impl;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import second_spring_mvc.dao.SchoolDao;
import second_spring_mvc.dto.SchoolDto;
@Repository
public class SchoolDaoImpl implements SchoolDao{
	EntityManagerFactory eFactory=Persistence.createEntityManagerFactory("secmvc");
	EntityManager eManager=eFactory.createEntityManager();
	EntityTransaction eTransaction=eManager.getTransaction();

	@Override
	public SchoolDto saveData(SchoolDto sDto) {
		eTransaction.begin();
		eManager.persist(sDto);
		eTransaction.commit();
		return sDto;
	}

	@Override
	public SchoolDto getStuNo(int stuNo) {
		
		return eManager.find(SchoolDto.class, stuNo);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<SchoolDto> getAllStu() {
		Query query=eManager.createQuery("select s from SchoolDto s");
		return (ArrayList<SchoolDto>) query.getResultList();
	}

	@Override
	public String deleteStu(int stuNo) {
		SchoolDto sDto=getStuNo(stuNo);
		eTransaction.begin();
		eManager.remove(sDto);
		eTransaction.commit();
		return "Student "+stuNo+" data is deleted sucessfully........";
	}

	@Override
	public String updateStu(SchoolDto sDto) {
		eTransaction.begin();
		eManager.merge(sDto);
		eTransaction.commit();
		return "Student Data with No "+ sDto.getStuNo()+" is updated sucessfully.........";
	}

}

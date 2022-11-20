package com.dk.devi.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dk.devi.hibernate.dto.CollegeDto;

public class CollegeDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dkp");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void saveStudentdata(CollegeDto cDto) {
		entityTransaction.begin();
		entityManager.persist(cDto);
		entityTransaction.commit();
		System.out.println("College data is saved sucessfully.......");
	}
	public void retrive(int rollno)
	{
		CollegeDto cDto=entityManager.find(CollegeDto.class, rollno);
		System.out.println(cDto);
		System.out.println("Candidate data retrived sucessfully......");
	}
	public void delete(int rollno)
	{
		CollegeDto cDto=entityManager.find(CollegeDto.class, rollno);
		entityTransaction.begin();
		entityManager.remove(cDto);
		entityTransaction.commit();
		System.out.println("Candidate data is deleteed sucessfully.........");
	}
	public void update(CollegeDto cDto)
	{
		entityTransaction.begin();
		entityManager.merge(cDto);
		entityTransaction.commit();
		System.out.println("Candidate data is updated sucessfully......");
	}
}

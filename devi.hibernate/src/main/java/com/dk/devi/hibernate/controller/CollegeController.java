package com.dk.devi.hibernate.controller;

import java.util.Scanner;

import com.dk.devi.hibernate.dao.CollegeDao;
import com.dk.devi.hibernate.dto.CollegeDto;

public class CollegeController {

	public static void main(String[] args) {
		
        CollegeDao cDao=new CollegeDao();
        CollegeDto cDto=new CollegeDto();
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("1.Insert Data");
		System.out.println("2.Retrive Data");
		System.out.println("3.Delete Data");
		System.out.println("4.Update Data");
        System.out.print("Select one which one u want:");
        int no=s.nextInt();
        if(no>=1 && no<=4)
        {
        	switch (no) {
			case 1:{
				System.out.print("Enter howmany candidates data insert u want:");
	        	int num=s.nextInt();
	        	for(int  i=1;i<=num;i++)
	        	{
	        		System.out.println("Enter the details:");
	        		cDto.setRollNo(s.nextInt());
	        		cDto.setName(s.next());
	        		cDto.setLoc(s.next());
	                cDao.saveStudentdata(cDto);
	        	}
	        	break;
			} 
			case 2:{
				System.out.print("Enter Candidate rollno:");
				cDao.retrive(s.nextInt());
				break;
			}
			case 3:{
				System.out.print("Enter candidate rollNo which one u wnat delete:");
				cDao.delete(s.nextInt());
				break;
			}
			case 4:{
				System.out.print("Enter the candidate rollNo whose candidate update u want:");
				cDto.setRollNo(s.nextInt());
				cDto.setName(s.next());
				cDto.setLoc(s.next());
				cDao.update(cDto);
				break;
			}
		}
     }
        else
        {
        	System.out.println("Your selection out of option.......");
        	System.out.println("Thank you for visit.......");
        }
	}

}

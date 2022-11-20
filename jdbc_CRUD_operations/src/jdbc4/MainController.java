package jdbc4;

import java.sql.SQLException;
import java.util.Scanner;

import jdbc_CRUD_operation.CRUD_Operations;

public class MainController {

	public static void main(String[] args) throws SQLException {
		CRUD_Operations cOperations=new CRUD_Operations();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Insert.");
		System.out.println("2.Retrive.");
		System.out.println("3.Update.");
		System.out.println("4.Delete.");
        System.out.print("Enter the number which one option u want from above options:");
       int selection_range=sc.nextInt();
       if(selection_range>=1 && selection_range<=4) {
    	   int number=sc.nextInt();
           switch(number) {
           case 1:
           {
           	cOperations.insertStudent();
           	break;
           }
           case 2:{
           	cOperations.retrive();
           	break;
           }
           case 3:{
           	cOperations.update();
           	break;
           }
           case 4:{
           	cOperations.delete();
           }
           }
       }
       else {
		System.out.println("Your selection out of option>>>>>>>>");
		System.out.println("Thank you for visit>>>>>>>>>");
	}
	}

}

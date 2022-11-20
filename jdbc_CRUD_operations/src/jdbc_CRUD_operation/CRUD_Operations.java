package jdbc_CRUD_operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jdbc_DataBase.DataBaseController;



public class CRUD_Operations {

	DataBaseController dataBaseController=new DataBaseController();
	public void createTable() throws SQLException {
		Connection connection=dataBaseController.getconnection();
		String str="create table school(RollNo int primary key,Name varchar(15),Address varchar(15),MobileNO varchar(10),eng int,math int,sci int)";
		Statement statement=connection.createStatement();
		statement.executeUpdate(str);
		System.out.println("Table is created sucessfully.");
	}	
	public void insertStudent()
	{
		try {
			Scanner s=new Scanner(System.in);
			System.out.print("Enter number howmany records insert u want:");
			int count=s.nextInt();
			Connection connection=dataBaseController.getconnection();
			String query="insert into school values(?,?,?,?,?,?,?)";
			PreparedStatement pStatement=connection.prepareStatement(query);
			for(int i=1;i<=count;i++)
			{
				System.out.println("Enter the Student Data");
				System.out.println("RollNo,Name,Address,MobileNO,Eng,Math,Sci");
				int no=s.nextInt();
				String name=s.next();
				String add=s.next();
				String mobNo=s.next();
				int eng=s.nextInt();
				int math=s.nextInt();
				int sci=s.nextInt();
				pStatement.setInt(1, no);
				pStatement.setString(2, name);
				pStatement.setString(3, add);
				pStatement.setString(4, mobNo);
				pStatement.setInt(5, eng);
				pStatement.setInt(6, math);
				pStatement.setInt(7, sci);
				pStatement.executeUpdate();
				System.out.println("Record inserted Sucessfully.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void retrive()
	{
		try {
			Scanner s=new Scanner(System.in);
			Connection connection=dataBaseController.getconnection();
			String str="select * from school where rollno=?";
			PreparedStatement pStatement=connection.prepareStatement(str);
			System.out.println("Enter RollNO which one student u want:");
			int a=s.nextInt();
			pStatement.setInt(1, a);
			ResultSet rs=pStatement.executeQuery();
			if(rs.next()) {
			System.out.println("RollNo:"+rs.getInt(1));
			System.out.println("Name:"+rs.getString(2));
			System.out.println("Address:"+rs.getString(3));
			System.out.println("MobileNO:"+rs.getString(4));
			System.out.println("English:"+rs.getInt(5));
			System.out.println("Maths:"+rs.getInt(6));
			System.out.println("Science:"+rs.getInt(7));
			
			System.out.println("Record Is came Sucessfully.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void update() {
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the RollNo Which one record update u want :");
			Connection connection=dataBaseController.getconnection();
			String str="update school set name=?,address=?,mobileno=?,eng=?,math=?,sci=? where rollno=?";
			PreparedStatement pStatement=connection.prepareStatement(str);
			int no=scanner.nextInt();
			pStatement.setInt(1, no);
			System.out.print("Enter Name:");
			String name=scanner.next();
			System.out.print("Enter the Address:");
			String add=scanner.next();
			System.out.print("Enter the MobileNumber:");
			String mobno=scanner.next();
			System.out.print("Enter the EnglshMarks:");
			int en=scanner.nextInt();
			System.out.print("Enter the MathsMarks:");
			int mat=scanner.nextInt();
			System.out.print("Enter the ScienceMarks:");
			int sci=scanner.nextInt();
			pStatement.setString(2, name);
			pStatement.setString(3, add);
			pStatement.setString(4, mobno);
			pStatement.setInt(5, en);
			pStatement.setInt(6, mat);
			pStatement.setInt(7, sci);
			pStatement.executeUpdate();
			System.out.println("Recrod updated Suessfully.");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void delete()
	{
		try {
			Scanner s=new Scanner(System.in);
			Connection connection=dataBaseController.getconnection();
			String str="delete from school where rollno=?";
			PreparedStatement psStatement=connection.prepareStatement(str);
			System.out.println("Enter the Rollno which one u want delete:");
			int no=s.nextInt();
			psStatement.setInt(1, no);
			psStatement.executeUpdate();
			System.out.println("Record deleted sucessfully.");
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

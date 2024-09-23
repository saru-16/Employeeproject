package client;
import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import com.util.Dbconnection;

import DAO.EmployeeDAO;
import Model.Employee;
import daoImpl.EmployeeDAOImpl;



public class ClientTest {
	public static void main(String[]args) {
	    	   
	    	   Scanner s=new Scanner(System.in);
	    	   EmployeeDAOImpl emp=new EmployeeDAOImpl();
	
    	   
	    	   System.out.println("1.insert 2.update 3.delete 4.view one info 5.view all info");
	    	   System.out.println("enter a choice");
	    	   int c=s.nextInt();
	    	   while(c!=0) {
	    		switch(c) 
	    		{
	    		case 1 :
	    		{
	    	   System.out.println("Enter emp name");
	    	   String employee_name=s.nextLine();
	    	   s.nextLine();
	    	   System.out.println("Enter emp email");
	    	   String email=s.nextLine();
	    	   System.out.println("Enter emp salary");
	    	   double salary=s.nextDouble();
	    	   s.nextLine();
	    	   System.out.println("Enter emp doj DD/MM/YYYY");
	    	   String dateString=s.nextLine();
	    	   System.out.println("Enter emp bonus");
	    	   int bonus=s.nextInt();
	    	   Employee e= new Employee(employee_name,email,salary,dateString,bonus); 
	    	   emp.createEmployee(e);
	    	   break;
	    		}
	    		case 2:
	    	    {
	    	  // Employee employee=getEmployee();
	    	  System.out.println("Enter new email");
	    	  String mail=s.nextLine();
	    	  s.nextLine();
	    	 emp.updateEmployeeEmailById(mail,3);
	    	 break;
	    	 }
	    		case 3:
	    		{
	    	   emp.deleteEmployeeById(2);
	    	   break;
	    	   }
	    		case 4:
	    		{
	    	   System.out.println("enter id");
	    	   int id=s.nextInt();
	    	   System.out.print(emp.getEmployeeById(id));
	    	   break;
	    	   }
	    		case 5:
	    	 {
	    		   EmployeeDAO empdao = new EmployeeDAOImpl();
	     List<Employee> emplist =empdao.getAllEmployeesInfo();
		
	     for(Employee emp1 : emplist)
	     {
	    	 System.out.println(emp1);
	     }
	     break;
	    	   }
	    		}
	    	     
	    	 System.out.println("enter 0 to exit ");
	    	 System.out.println("enter a choice");
	    	 int choice=s.nextInt();
	    	 c=choice;
	    	 if(c!=0)
	    		 continue;
	    	 else {
	    		 break;
	    	 }
     }
	    	   System.out.println("exit");
	    	   
}
}

	
	
	



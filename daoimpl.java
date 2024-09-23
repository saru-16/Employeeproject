package daoImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.util.Dbconnection;

import DAO.EmployeeDAO;
import Model.Employee;


public class EmployeeDAOImpl implements EmployeeDAO{
	public void createEmployee(Employee employee) {
		Connection con=Dbconnection.connectWithDb();
		String s="insert into Employee_table(employee_name ,email ,salary ,doj ,bonus)values(?,?,?,?,?)";
		try {
			
			PreparedStatement pst=con.prepareStatement(s);
			pst.setString(1, employee.getEmployee_name());
			pst.setString(2,employee.getEmail());
			pst.setDouble(3, employee.getSalary());
			pst.setString(4,employee.getDoj());//	pst.setDate(4,new Date(employee.getDoj().getTime()));;
			pst.setInt(5, employee.getBonus());
			   int executeUpdate=pst.executeUpdate();
			   if(executeUpdate == 1) {
				   System.out.println("Employee is created..!!!");
			   }
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}
		
		
		
	
	 public Employee getEmployeeById(int employeeId){
		 Employee e1=new Employee();
		 String s="select * from Employee_table where employee_id=?";
		 Connection con=Dbconnection.connectWithDb();
		try {
			PreparedStatement pst=con.prepareStatement(s);
			pst.setInt(1, employeeId);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				int empId=rs.getInt("employee_id");
				String eName=rs.getString("employee_name");
				String email=rs.getString("email");
				Double salary=rs.getDouble("salary");
				String date=rs.getString("doj");
				int bonus=rs.getInt("bonus");
				
				
				
				e1.setEmployee_id(empId);
				e1.setEmail(email);
				e1.setEmployee_name(eName);
				e1.setSalary(salary);
				e1.setDoj(date);
				e1.setBonus(bonus);
			}
		}
				
		catch(Exception e) {
			e.printStackTrace();
		}
		return e1;
	 }
	public void updateEmployeeEmailById(String newEmail,int employeeId) {
		 String s="update Employee_table set email=? where employee_id=?";
		 Connection con=Dbconnection.connectWithDb();
		 try {
		 PreparedStatement pst=con.prepareStatement(s);
		 pst.setString(1, newEmail);
		 pst.setInt(2, employeeId);
		 int executeUpdate=pst.executeUpdate();
		   if(executeUpdate == 1) {
			   System.out.println("Email is updated...!!!");
		   }
		}catch(Exception e) {
			e.printStackTrace();
		}
		 
	 }
	public void deleteEmployeeById(int employeeId) {
		String s="delete from Employee_table where employee_id=?";
		 Connection con=Dbconnection.connectWithDb();
		 try {
		 PreparedStatement pst=con.prepareStatement(s);
		 pst.setInt(1,employeeId);
		 int executeUpdate=pst.executeUpdate();
		   if(executeUpdate == 1) {
			   System.out.println("deleted successfully...!!!");
		   }
		}catch(Exception e) {
			e.printStackTrace();
		}
		 
		 
		
		
	}
	public List<Employee> getAllEmployeesInfo(){
		List<Employee> emplist=new ArrayList<>();
		String s="select * from Employee_table";
		 Connection con=Dbconnection.connectWithDb();
		try {
			PreparedStatement pst=con.prepareStatement(s);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Employee employee=new Employee();
				int empId=rs.getInt("employee_id");
				String eName=rs.getString("employee_name");
				String email=rs.getString("email");
				Double salary=rs.getDouble("salary");
				String date=rs.getString("doj");
				int bonus=rs.getInt("bonus");
				
				
				employee.setEmployee_id(empId);
				employee.setEmployee_name(eName);
				employee.setEmail(email);
				employee.setSalary(salary);
				employee.setDoj(date);
				employee.setBonus(bonus);
				
				emplist.add(employee);
				
				
			}	
			
		}catch(Exception e) {
				e.printStackTrace();
			}
			return emplist;
		}
	}


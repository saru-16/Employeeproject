package DAO;
import java.util.List;

import Model.Employee;

public interface EmployeeDAO {
		 void createEmployee(Employee employee);
		 Employee getEmployeeById(int employeeId);
		 void updateEmployeeEmailById(String newEmail,int employeeId);
		 void deleteEmployeeById(int employeeId);
		 List<Employee> getAllEmployeesInfo();
			
		}

package Model;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
public class Employee {
       private      int employee_id;
       private   	String employee_name;
       private  	String email;
       private  	Double salary;
       private   	String doj;
       private  	int bonus;
       public Employee( String employee_name, String email, Double salary, String doj, int bonus) {
		super();
		
		this.employee_name = employee_name;
		this.email = email;
		this.salary = salary;
		this.doj = doj;
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", email=" + email
				+ ", salary=" + salary + ", doj=" + doj + ", bonus=" + bonus + ", getEmployee_id()=" + getEmployee_id()
				+ ", getEmployee_name()=" + getEmployee_name() + ", getEmail()=" + getEmail() + ", getSalary()="
				+ getSalary() + ", getDoj()=" + getDoj() + ", getBonus()=" + getBonus() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public Employee() {
	}
	}

	


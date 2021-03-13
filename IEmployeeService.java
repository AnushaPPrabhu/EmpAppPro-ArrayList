package com.capg.empAppCollection.service;

import java.util.ArrayList;
import java.util.List;

import com.capg.empAppCollection.dto.Employee;
import com.capg.empAppCollection.exception.WrongSalaryException;

public interface IEmployeeService {

	public boolean addEmployee(Employee e) throws WrongSalaryException;
	 
	 public boolean editSalaryByEmployeeId(Employee e)throws WrongSalaryException;
	 
	 public List<Employee> getAllEmployees();
	 
	 public ArrayList<Employee> getEmployeeBySalary(int salary);
	 
	 public ArrayList<Employee> getEmployessBySalaryRange(int salaryRangeMin,int salaryRangeMax);

	public ArrayList<Employee> getEmployeeByExperience(int experience);
	
	public ArrayList<Employee> getEmployessByExperienceRange(int experienceRangeMin,int experienceRangeMax);

}

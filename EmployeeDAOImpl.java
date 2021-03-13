package com.capg.empAppCollection.dao;

import java.util.ArrayList;
import java.util.List;

import com.capg.empAppCollection.db.*;
import com.capg.empAppCollection.dto.*;
import com.capg.empAppCollection.exception.*;


public class EmployeeDAOImpl implements IEmployeeDAO{

	public boolean addEmployee(Employee e) throws WrongSalaryException {
		
		return EmployeeDatabase.addEmployee(e);
		
	}

	public boolean editSalaryByEmployeeId(Employee e) throws WrongSalaryException {
		
		return EmployeeDatabase.editEmployee(e);
	}

	public List<Employee> getAllEmployees() {
		
		return EmployeeDatabase.employees;
	}

	public ArrayList<Employee> getEmployeeBySalary(int salary) {
	
		return EmployeeDatabase.getEmployeeBySalary(salary);
	}

	public ArrayList<Employee> getEmployessBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
		
		return EmployeeDatabase.getEmployeeBySalaryRange(salaryRangeMin, salaryRangeMax);
	}

	public ArrayList<Employee> getEmployeeByExperience(int experience) {
		
		return EmployeeDatabase.getEmployeeByExperience(experience);
	}

	public ArrayList<Employee> getEmployessByExperienceRange(int experienceRangeMin, int experienceRangeMax) {
		
		return EmployeeDatabase.getEmployeeByExperienceRange(experienceRangeMin, experienceRangeMax);
	}

}

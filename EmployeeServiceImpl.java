package com.capg.empAppCollection.service;

import java.util.ArrayList;
import java.util.List;

import com.capg.empAppCollection.dao.*;
import com.capg.empAppCollection.dto.Employee;
import com.capg.empAppCollection.exception.WrongSalaryException;

public class EmployeeServiceImpl implements IEmployeeService {

	IEmployeeDAO dao;

	public EmployeeServiceImpl() {
		dao = new EmployeeDAOImpl();
	}

	public boolean addEmployee(Employee e) throws WrongSalaryException {

		if (e.getSalary() > 50000) {
			throw new WrongSalaryException(e.getSalary());
		} else if (e.getExp() < 3 && e.getSalary() > 10000) {
			throw new WrongSalaryException(e.getSalary());
		} else
			return dao.addEmployee(e);

	}

	public boolean editSalaryByEmployeeId(Employee e) throws WrongSalaryException {

		if (e.getSalary() > 50000) {
			throw new WrongSalaryException(e.getSalary());
		} else if (e.getExp() < 3 && e.getSalary() > 10000) {
			throw new WrongSalaryException(e.getSalary());
		} else
			return dao.editSalaryByEmployeeId(e);
	}

	public List<Employee> getAllEmployees() {

		return dao.getAllEmployees();
	}

	public ArrayList<Employee> getEmployeeBySalary(int salary) {
		
		return dao.getEmployeeBySalary(salary);
	}

	public ArrayList<Employee> getEmployessBySalaryRange(int salaryRangeMin, int salaryRangeMax) {

		return dao.getEmployessBySalaryRange(salaryRangeMin, salaryRangeMax);
	}

	public ArrayList<Employee> getEmployeeByExperience(int experience) {
		
		return dao.getEmployeeByExperience(experience);
	}

	public ArrayList<Employee> getEmployessByExperienceRange(int experienceRangeMin, int experienceRangeMax) {
		
		return dao.getEmployessByExperienceRange(experienceRangeMin, experienceRangeMax);
	}

}

package com.capg.empAppCollection.db;

import java.util.*;
import com.capg.empAppCollection.dto.Employee;

public class EmployeeDatabase {

	public static ArrayList<Employee> employees=new ArrayList<Employee>();
	public static ArrayList<Employee> salarys=new ArrayList<Employee>();
	public static ArrayList<Employee> salaryRange=new ArrayList<Employee>();
	public static ArrayList<Employee> experiences=new ArrayList<Employee>();
	public static ArrayList<Employee> experienceRange=new ArrayList<Employee>();

	public static int count = 0;

	public static boolean addEmployee(Employee e) {

		return employees.add(e);

	}

	public static int getCount() {
		return count;
	}

	public static boolean editEmployee(Employee e) {
		return true;
	}

	public static ArrayList<Employee> getEmployeeBySalary(int salary) {
	
		salarys.clear();
		for (Employee employee : employees) {
			if(employee.getSalary()==salary) {
				salarys.add(employee);
			}

		}
			return salarys;
	}

	public static ArrayList<Employee> getEmployeeBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
		
		salaryRange.clear();
		for (Employee employee : employees) {
			if(employee.getSalary()>=salaryRangeMin && employee.getSalary()<=salaryRangeMax) {
				salaryRange.add(employee);
			}
		}
		return salaryRange;
	}

	public static ArrayList<Employee> getEmployeeByExperience(int experience) {
		
		experiences.clear();
		for (Employee employee : employees) {
			if(employee.getExp() == experience) {
				experiences.add(employee);
			}
			
		}
		return experiences;
	}

	public static ArrayList<Employee> getEmployeeByExperienceRange(int experienceRangeMin, int experienceRangeMax) {
		
		experienceRange.clear();
		for(Employee employee:employees) {
			if(employee.getExp()>=experienceRangeMin && employee.getExp()<=experienceRangeMax) {
				experienceRange.add(employee);
			}
		}
		return experienceRange;
	}

}

package com.capg.empAppCollection.main;

import java.util.*;

import com.capg.empAppCollection.service.*;
import com.capg.empAppCollection.db.*;
import com.capg.empAppCollection.dto.*;
import com.capg.empAppCollection.exception.WrongSalaryException;

public class EmployeeMain {

	IEmployeeService empService = new EmployeeServiceImpl();

	public static void main(String[] args) {

		EmployeeMain app = new EmployeeMain();
		Scanner sc = new Scanner(System.in);

		List<Employee> employee = new ArrayList<Employee>();

		while (true) {

			System.out.println(" === MENU ==== ");
			System.out.println("1. Add employee ");
			System.out.println("2. Edit Employee ");
			System.out.println("3. Display All Employee ");
			System.out.println("4. Display Employee based on salary ");
			System.out.println("5. Display Employee based on salary range");
			System.out.println("6. Display Employee based on Experience");
			System.out.println("7. Display Employee based on Experience range");
			System.out.println("0. EXIT");

			System.out.println("Enter Option");
			int option = sc.nextInt();
			int n = 0;

			EmployeeDatabase empDb = new EmployeeDatabase();
			int count = empDb.getCount();
			Employee emp = new Employee();

			switch (option) {

			case 1:

				// System.out.println(count);
				System.out.println("Enter id of employee.");
				emp.setEmployeeId(sc.nextInt());
				// System.out.println(emp.getEmployeeId());
				System.out.println("Enter the name of the employee");
				emp.setName(sc.next());
				System.out.println("Enter the experience");
				emp.setExp(sc.nextInt());
				System.out.println("Enter the salary");
				emp.setSalary(sc.nextInt());

				try {
					boolean isInserted = app.empService.addEmployee(emp);
					if (isInserted) {
						System.out.println("Employee Added.");
					} else {
						throw new Exception("Cannot add Employee.");
					}
				} catch (Exception ex) {
					System.out.println("Contact to Customer Care. " + ex);
					// ex.printStackTrace();
				}

				break;

			case 2:

				System.out.println("Enter the id of the employee");
				int id = sc.nextInt();

				try {
					boolean empid = app.empService.editSalaryByEmployeeId(emp);
					if (empid) {
						System.out.println("Enter the new salary");
						emp.setSalary(sc.nextInt());
						System.out.println("Employee Details Edited.");
					} else {
						throw new Exception("Cannot edit Employee.");
					}
				} catch (Exception ex) {
					System.out.println(" Contact to Customer Care. " + ex);

				}

				break;

			case 3:

				System.out.println("Displaying all emp details");
				System.out.println(app.empService.getAllEmployees());

				break;

			case 4:

				System.out.println("Enter the salary you want to refer");
				int sal = sc.nextInt();

				ArrayList<Employee> salarys = app.empService.getEmployeeBySalary(sal);
				if (salarys.size() <=0) {
					System.out.println("The Entered salary was not matched with any Employee's salary");
				} else {
					System.out.println(salarys);
				}

				break;

			case 5:

				System.out.println("Enter the salary range");
				System.out.println("Enter the min sal");
				int a = sc.nextInt();
				System.out.println("Enter the max salary");
				int b = sc.nextInt();

				ArrayList<Employee> salaryRange = app.empService.getEmployessBySalaryRange(a, b);
				if (salaryRange.size() <=0) {
					System.out.println("The Entered salary was not matched with any Employee's salary");
				} else {
					System.out.println(salaryRange);
				}

				break;

			case 6:

				System.out.println("Enter the experience you want to refer");
				int exp = sc.nextInt();

				ArrayList<Employee> experiences = app.empService.getEmployeeByExperience(exp);
				System.out.println();
				if (experiences.size() <=0) {
					System.out.println("The entered Experience does not match with any employee's experience");
				} else {
					System.out.println(experiences);
				}

				break;

			case 7:

				System.out.println("Enter the experience range");
				System.out.println("Enter the min experience");
				a = sc.nextInt();
				System.out.println("Enter the max experience");
				b = sc.nextInt();

				ArrayList<Employee> experienceRange = app.empService.getEmployessByExperienceRange(a, b);
				if (experienceRange.size() <= 0) {
					System.out.println("The entered Experience does not match with any employee's experience");
				} else {
					System.out.println(experienceRange);
				}

				break;

			case 0:
				System.exit(0);
			}// End of switch
		} // End of while

	}// End of main
}// End of class

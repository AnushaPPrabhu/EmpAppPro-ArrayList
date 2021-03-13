package com.capg.empAppCollection.exception;

public class WrongSalaryException extends Exception {

	private int salary;

	public WrongSalaryException(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return "WrongSalaryException :- " + salary;
	}
}

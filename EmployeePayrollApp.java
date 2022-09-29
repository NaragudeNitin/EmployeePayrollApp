package com.employee.wage;

import java.util.Random;

public class EmployeePayrollApp {
	private static final String FULL_TIME = "FULL_TIME";
	private static final String PART_TIME = "PART_TIME";
	private static final int monthDays = 20;

	public static void main(String[] args) {
		EmployeePayrollApp nitin = new EmployeePayrollApp();
		int hrs = nitin.noOfHrsInDay(FULL_TIME);
		System.out.println("working time: " + hrs);

		double salary = nitin.oneDaySal();
		System.out.println("one day salary is " + salary);
		double fullMonthSal = salary * monthDays;
		System.out.println("so your 20 days full time sal is: " + fullMonthSal);

		double sal100hr = nitin.hundredHrsal(100, 20);
		System.out.println("Your salary for 100 working hours is: " + sal100hr);

	}

	public int noOfHrsInDay(String type) {
		switch (type) {
		case FULL_TIME:
			return 8;
		case PART_TIME:
			return 4;
		default:
			return 0;
		}
	}

	public double oneDaySal() {
		return noOfHrsInDay(FULL_TIME) * 20;
	}

	public double oneDaysal(int wrHr) {
		return noOfHrsInDay(PART_TIME) * wrHr;
	}

	public double hundredHrsal(int val1, int val2) {
		return val1 * val2;
	}
}

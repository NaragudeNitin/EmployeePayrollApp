package com.employee.wage;

import java.util.Random;

public class EmployeePayrollApp {

	public static void main(String[] args) {
		Random random = new Random();
		int rand = random.nextInt(3);
		System.out.println("Your Random num is " + rand);

		int wagePerHour = 20;
		int fulltime = 12;

		// This is part time employee problem.
		int partTime = 8;
		if (rand == 1) {
			System.out.println("You are present today so");
			int dailyWage;
			dailyWage = fulltime * wagePerHour;
			System.out.println("Your today's salary is: " + dailyWage + "Rs");
		} else if (rand == 2) {
			System.out.println("You are part time employer");
			int partTimeWage;
			partTimeWage = partTime * wagePerHour;
			System.out.println("Your part time salary is: " + partTimeWage + "Rs");
		} else {
			System.out.println("Employee is Absent");
		}
	}
}

package com.employee.wage;

import java.util.Random;

public class EmployeePayrollApp {
	private static int WagePerHr=20;

	public static void main(String[] args) {
		Random random = new Random();
		int rand =random.nextInt(3);
		int fullSalary;
		int partSalary;
		int fulltime=8;
		int parttime=4;
		switch (rand) {
		case 0:
			System.out.println("you were absent today");
			break;
		case 1:
			System.out.println("you are present today.");
			fullSalary=WagePerHr*fulltime;
			System.out.println("Your full time salary is "+ fullSalary+ "Rs");
			break;
		case 2:
			System.out.println("You did Part time today.");
			partSalary= WagePerHr*parttime;
			System.out.println("Your part time salary is: "+partSalary + "Rs");
			break;
		default:
			System.out.println("you are not employee of our company.");
			break;
		}
	}
}

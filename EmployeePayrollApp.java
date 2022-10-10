package com.employee.wage;

public class EmployeePayrollApp {
	public static final int IS_PART_TTIME = 1;
	public static final int IS_FULL_TIME = 2;

	public static int computeWage(String company, int empRatePerHr, int noOfWorkingDays, int maxHrsPerMonth) {
		int empHrs = 0;
		int totEmpHrs = 0;
		int totWorkingDays = 0;
		while (totEmpHrs <= maxHrsPerMonth && totWorkingDays < noOfWorkingDays) {
			totWorkingDays++;
			int empcheck = (int) (Math.floor(Math.random() * 10) % 3);
			switch (empcheck) {
			case IS_PART_TTIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totEmpHrs = totEmpHrs + empHrs;
			System.out.println("Day: " + totWorkingDays + " Total WORKING hRS: " + empHrs);
		}
		int totEmpWage = totEmpHrs + empRatePerHr;
		System.out.println("Employee Salary for company " + company + " is: " + totEmpWage);
		return totEmpWage;
	}
	
	public static void main(String[] args) {
		computeWage("Studio", 20, 2, 10);
		computeWage("croma", 10, 4, 20);
	}
}

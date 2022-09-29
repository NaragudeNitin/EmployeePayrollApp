package com.employee.wage;

import java.util.Random;

public class EmployeePayrollApp {
	private static final String FULL_TIME ="FULL_TIME";
	private static final String PART_TIME ="PART_TIME";
	private static final int monthDays =20;
	
	public static void main(String[] args) {
		EmployeePayrollApp full = new EmployeePayrollApp();
		full.noOfHrsInDay(FULL_TIME);
		
		int FulltimeSalary= monthDays*(full.dailySal(20, 8));
		System.out.println("Your full time monthly salary is "+FulltimeSalary);
//		salary=no of days* Daily salary
		int PartTimeSal = monthDays * (full.dailySal(20, 4));
		System.out.println("Your Monthly Part time salary is "+ PartTimeSal);
		
	}
	
	public int noOfHrsInDay(String type) {
		switch (type) {
		case FULL_TIME:
			return 8;
		case PART_TIME :
			return 4;
		default:
			return 0;
		}
	}
	
	public int dailySal(int time, int hrwage) {
		return time * hrwage;
	}
}

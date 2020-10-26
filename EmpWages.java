package org.emp;

import java.util.Random;
import java.util.Scanner;

public class EmpDailyWages {

	public static final int isFullTime = 1;
	public static final int isPartTime = 0;
	public static final int perHour = 20;
	public static final int FullDayHour = 8;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("---------Employee_Wages-----------");
		EmpDailyWages emp = new EmpDailyWages();
		emp.CalEmpWages();
	}

	public void CalEmpWages() {
		Random rn = new Random();
		int rand = rn.nextInt(2);
		int TotalWages = 0;
		if (rand == isFullTime) {
			System.out.println("Enter fullTimeDays Employee Worked : ");
			int day = in.nextInt();
			TotalWages = perHour * (FullDayHour * day);
		} else if (rand == isPartTime) {
			System.out.println("Enter partTimeDays Employee Worked : ");
			int day = in.nextInt();
			TotalWages = perHour * ((FullDayHour / 2) * day);
			System.out.println("Total_Salary for " + day + " days : " + TotalWages + " Rs.");
		} else
			System.out.println("Employee is absent..!!!");
		in.close();
	}
}

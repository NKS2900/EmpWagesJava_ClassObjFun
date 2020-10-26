package com.Employee;

import java.util.Random;
import java.util.Scanner;

public class EmployeeFunction {

	public static final int Is_Full_Time = 1;
	public static final int Is_Part_Time = 0;
	public static final int EmpRate_Hour = 20;
	public static final int EmpHrs = 8;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("---------Employee_Wages-----------");
		
		EmployeeFunction emp = new EmployeeFunction();
		emp.CalEmployeeFunction();
	}

	public void CalEmployeeFunction() {
		Random rn = new Random();
		int rand = rn.nextInt(2);
		if (rand == Is_Full_Time) {
			System.out.println("Enter fullTimeDays Employee Worked : ");
			int day = in.nextInt();
			int TotalWages = EmpRate_Hour * (EmpHrs * day);
			System.out.println("Total_Salary for " + day + " days : " + TotalWages + " Rs.");
		} 
		else if(rand == Is_Part_Time) {
			System.out.println("Enter partTimeDays Employee Worked : ");
			int day = in.nextInt();
			int TotalWages = EmpRate_Hour * ((EmpHrs/2) * day);
			System.out.println("Total_Salary for " + day + " days : " + TotalWages + " Rs.");
		}else
			System.out.println("Employee is Absent & Salary is 0..!!!");
		in.close();
	}
}

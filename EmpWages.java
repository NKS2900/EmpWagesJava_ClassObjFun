package org.empFun;

import java.util.Random;
import java.util.Scanner;

public class EmpWages {

	static Scanner in = new Scanner(System.in);
	public static final int FullDayHour = 8;
	public static final int WorkingDayMonth = 20;
	public static final int maxHoursInMonth = 100;
	public static final int perHour = 20;
	public static final int isFullTime = 1;
	public static final int isPartTime = 0;
	int day;
	Random rn = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		EmpWages emp = new EmpWages();
		EmpWages.EmpCondition empc =emp.new EmpCondition(); //nested class object 
		do {
			System.out.println("------------Employee_Wages---------------");
			System.out.println("1. CheckEmployee present or Not");
			System.out.println("2. Employee Daily Wages.");
			System.out.println("3. Employee PartTime Wages.");
			System.out.println("4. Emp. PartTime Using SwitchCase");
			System.out.println("5. Employee Monthly Wages.");
			System.out.println("6. EmployeeWages Till empH.100 OR Day 20.");
			System.out.println("7. Exit");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				emp.CheckEmp();
				break;
			case 2:
				emp.EmpDailyWages();
				break;
			case 3:
				emp.EmpPartTime();
				break;
			case 4:
				emp.EmpPartTimeScase();
				break;
			case 5:
				emp.EmpMonthlyWages();
				break;
			case 6:
				empc.EmpWagesTill();
				break;
			default:
				System.out.println("ending...");
			}
		} while (choice < 7);
	}

	public void CheckEmp() {
		int rand = rn.nextInt(2);
		if (rand == isFullTime) {
			System.out.println("Employee present");
		} else
			System.out.println("Empoyee absent.");
	}

	public void EmpDailyWages() {
		int rand = rn.nextInt(2);
		System.out.println("-----------Employee_Daily_Wages---------------");
		if (rand == isFullTime) {
			System.out.println("Enter no Days Employee Worked : ");
			day = in.nextInt();
			int TotalWages = perHour * (FullDayHour * day);
			System.out.println("Total_Salary for " + day + " days : " + TotalWages + " Rs.");
		} else
			System.out.println("Employee is absent..!!!");
	}

	public void EmpPartTime() {
		int rand = rn.nextInt(3);
		if (rand == isPartTime) {
			System.out.println("-------PartTime_Employee_Wages-------");
			System.out.println("Enter no Days Employee Worked : ");
			day = in.nextInt();
			int partTimeWages = (day * (FullDayHour / 2)) * perHour;
			System.out.println("PartTime_Wages_for " + day + " days : " + partTimeWages + " Rs.");

		} else if (rand == isFullTime) {
			System.out.println("-------FullTime_Employee_Wages-------");
			System.out.println("Enter no Days Employee Worked : ");
			int day = in.nextInt();
			int FullTimeWages = perHour * (FullDayHour * day);
			System.out.println("PartTime_Wages_for " + day + " days : S" + FullTimeWages + " Rs.");
		} else
			System.out.println("Employee Absent..!!!!");
	}

	public void EmpPartTimeScase() {
		int rand = rn.nextInt(3);
		switch (rand) {
		case 1:
			System.out.println("-------FullTime_Employee_Wages-------");
			System.out.println("Enter no Days Employee Worked : ");
			day = in.nextInt();
			int FullTimeWages = perHour * (FullDayHour * day);
			System.out.println("Full_Time_Wages_for " + day + " days : " + FullTimeWages + " Rs.");
			break;
		case 2:
			System.out.println("-------PartTime_Employee_Wages-------");
			System.out.println("Enter no Days Employee Worked : ");
			day = in.nextInt();
			int partTimeWages = (day * (FullDayHour / 2)) * perHour;
			System.out.println("PartTime_Wages_for " + day + " days : " + partTimeWages + " Rs.");
			break;
		default:
			System.out.println("Employee is Absent..!!!!");
			break;
		}
	}

	public void EmpMonthlyWages() {
		int rand = rn.nextInt(3);
		System.out.println("-------Employee_Monthly_Wages--------");
		switch (rand) {
		case 1:
			System.out.println("-------FullTime_Employee_Wages_Monthly-------");
			int FullTimeWages = perHour * (FullDayHour * WorkingDayMonth);
			System.out.println("Full_Time_Wages_for " + WorkingDayMonth + " days : " + FullTimeWages + " Rs.");
			break;
		case 2:
			System.out.println("-------PartTime_Employee_Wages_Monthly-------");
			int partTimeWages = (WorkingDayMonth * (FullDayHour / 2)) * perHour;
			System.out.println("PartTime_Wages_for " + WorkingDayMonth + " days : " + partTimeWages + " Rs.");
			break;
		default:
			System.out.println("Employee is Absent..!!!!");
			break;
		}
	}

	class EmpCondition {
		public void EmpWagesTill() {
			int fullTimeDays = 0;
			int partTimeDays = 0;
			int totalempHour = 0;
			int totalWorkingDay = 0;
			int absent = 0;

			while (maxHoursInMonth > totalempHour && WorkingDayMonth > totalWorkingDay) {
				int rand = rn.nextInt(3);
				totalWorkingDay++;
				switch (rand) {

				case 1:
					fullTimeDays++;
					totalempHour = totalempHour + FullDayHour;
					break;
				case 2:
					partTimeDays++;
					totalempHour = totalempHour + (FullDayHour / 2);
					break;
				default:
					absent++;
					break;
				}
			}
			int FullTimeSalary = perHour * (FullDayHour * fullTimeDays);
			int PartTimeSalary = (partTimeDays * (FullDayHour / 2)) * perHour;
			System.out.println("------------Employee_Wages_Till_EmpH=100_||_Day=20-------------");
			System.out.println("---------------------------------------------------------------");
			System.out.println("FullTime_Days_in_month: " + fullTimeDays);
			System.out.println("PartTime_Days_in_month: " + partTimeDays);
			System.out.println("Absent_Days_in_month: " + absent);
			System.out.println("Total_working_Days_IN_month : " + (fullTimeDays + partTimeDays));
			System.out.println("Total_Hours    :===> " + totalempHour);
			System.out.println("FullTime_Salary:===> " + FullTimeSalary);
			System.out.println("PartTime_Salary:===> " + PartTimeSalary);
			System.out.println("Total_Salary   :===> " + (FullTimeSalary + PartTimeSalary));
			System.out.println("---------------------------------------");
		}
	}
}
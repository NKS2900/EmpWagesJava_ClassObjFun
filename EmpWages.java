package org.emp;

import java.util.Random;

public class EmpWagesMonthly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calculate Employee Wages Monthly.
		
		
		int perHour = 20;
		int FullDayHour = 8;
		int WorkingDayMonth = 20;

		System.out.println("-------Employee_Wages--------");

		Random rn=new Random();
		int rand=rn.nextInt(3);

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

}

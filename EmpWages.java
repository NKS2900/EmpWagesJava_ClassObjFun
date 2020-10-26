package org.emp;

import java.util.Random;

public class EmpWagesTill {

	public static final int FullDayHour = 8;
	public static final int WorkingDayMonth = 20;
	public static final int maxHoursInMonth = 100;
	public static final int perHour = 20;
	
	public static void main(String[] args) {
		

//Calculate Wages till a condition of total working hours or days is reached for a month - Assume 100 hours
			
		int fullTimeDays = 0;
		int partTimeDays = 0;		
		int totalempHour = 0;
		int totalWorkingDay = 0;
		int absent = 0;
		

		while (maxHoursInMonth > totalempHour && WorkingDayMonth > totalWorkingDay) {

			totalWorkingDay++;
			
			Random rn = new Random();
			int rand = rn.nextInt(3);

			switch (rand) {

			case 0:
				fullTimeDays++;
				totalempHour = totalempHour + FullDayHour;
				break;
			case 1:
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

		System.out.println("------------Employee_Wages-------------");
		System.out.println("---------------------------------------");
		System.out.println("FullTime_Days_in_month: " + fullTimeDays);		
		System.out.println("PartTime_Days_in_month: " + partTimeDays);		
		System.out.println("Absent_Days_in_month: " + absent);
		System.out.println("Total_working_Days_IN_month : " + (fullTimeDays + partTimeDays));
		System.out.println("Total_Hours    :===> " + totalempHour);
		System.out.println("FullTime_Salary:===> " + FullTimeSalary);
		System.out.println("PartTime_Salary:===> " + PartTimeSalary);
		System.out.println("Total_Salary   :===> " + (FullTimeSalary + PartTimeSalary));
		System.out.println("---------------------------------------");
		System.out.println(totalWorkingDay);
	}
}

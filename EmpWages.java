package org.emp;

import java.util.*;

//Employee PartTime Wages

public class EmpPartTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int isFullTime = 1;
		int isPartTime = 0;
		int perHour = 20;
		int FullDayHour = 8;
		Random rn=new Random();
		int rand=rn.nextInt(3);

		if (rand == isPartTime) {
			System.out.println("-------PartTime_Employee_Wages-------");
			System.out.println("Enter no Days Employee Worked : ");
			int day = in.nextInt();
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
		
		in.close();
	}

}

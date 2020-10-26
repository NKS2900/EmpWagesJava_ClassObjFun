package org.emp;

import java.util.Random;

public class EmpCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check Employee is present or not Using Random()

		int isFullTime = 1;
		Random rn = new Random();
		int rand = rn.nextInt(2);
		System.out.println(rand);
		System.out.println("-------Employee_Wages--------");
		if (rand == isFullTime) {
			System.out.println("Employee present");
		} else
			System.out.println("Empoyee absent.");
	}
}

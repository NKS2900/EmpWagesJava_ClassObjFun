package org.empFun;

public class EmpForDiffComp {

		public static final int IS_PART_TIME =1;
		public static final int IS_FULL_TIME= 2;
		private final String company;
		private final int empRateHours;
		private final int numofWorkDays;
		private final int maxHoursperMonth;
		
		public EmpForDiffComp(String company, int empRateHours, int numofWorkDays,int maxHoursperMonth)
		{
			this.company=company;
			this.empRateHours=empRateHours;
			this.maxHoursperMonth=maxHoursperMonth;
			this.numofWorkDays=numofWorkDays;
		}

		private int CalEmpWages()
		{
			int empHrs=0,totalEmpHours=0,totalWorkDays=0;

			while(totalEmpHours<=maxHoursperMonth && totalWorkDays< numofWorkDays )
			{
				totalWorkDays++;
				int empCheck=(int)(Math.random()*10%3);
				switch(empCheck)
				{
					case IS_PART_TIME:
										empHrs=4;
										break;
					case IS_FULL_TIME:
										empHrs=8;
										break;
					default:
							empHrs=0;
				}
				totalEmpHours+=empHrs;				
			}
			System.out.println("Total Employee work Hours: "+totalEmpHours);
			return totalEmpHours*empRateHours;
		}

		public static void main(String[] args)
		{
		
			EmpForDiffComp Wipro = new EmpForDiffComp("wipro",20,20,100);
			EmpForDiffComp Infosys = new EmpForDiffComp("infosys",30,20,100);
			
			System.out.println("============Emloyee_Wages_in_Wipro==============");
			System.out.println("Total Employee Wage for "+Wipro.company+": "+Wipro.CalEmpWages());
			System.out.println("============Emloyee_Wages_in_Infosys==============");
			System.out.println("Total Employee Wage for "+Infosys.company+": "+Infosys.CalEmpWages());
		}
		
	}

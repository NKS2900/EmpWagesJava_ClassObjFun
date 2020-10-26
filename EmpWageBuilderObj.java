package UC_9;

public class EmpWageBuilderObj {

	//constants
		public static final int IS_PART_TIME=1;
		public static final int IS_FULL_TIME=2;
		
		private final String company;
		private final int empRatePerHour;
		private final int numOfWorkingDays;
		private final int maxHrsPerMonth;
		private int totalEmpWage;
		
		public EmpWageBuilderObj(String company, int empRatePerHour, int numOfWorkingDays, int maxHrsPerMonth) {
			this.company = company;
			this.empRatePerHour = empRatePerHour;
			this.numOfWorkingDays = numOfWorkingDays;
			this.maxHrsPerMonth = maxHrsPerMonth;
		}
		

		public void computeWage() {
			//variables
			int empHrs=0 , totalEmpHrs=0 , totalWorkingDays=0;
			//computation
			while(totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < numOfWorkingDays) {
				totalWorkingDays++;
				int empCheck = (int) Math.floor(Math.random() *10 )%3;
				switch(empCheck) {
				case IS_FULL_TIME :
					empHrs=8;
					break;
				case IS_PART_TIME :
					empHrs=4;
					break;
				default :
					empHrs=0;
				}
				totalEmpHrs+=empHrs;
				System.out.println("Day : " + totalWorkingDays + "  Emp Hrs : " + empHrs);
				
			}
			totalEmpWage = totalEmpHrs*empRatePerHour;
		}
		
		@Override
		public String toString() {
			return "Total Emp Wage for Company : " + company + " is : " + totalEmpWage;
		}
		public static void main(String[] args) {
			EmpWageBuilderObj dMart = new EmpWageBuilderObj("Dmart", 20, 2, 10);
			EmpWageBuilderObj reliance = new EmpWageBuilderObj("Reliance", 10, 4, 20);
			dMart.computeWage();
			System.out.println(dMart);
			reliance.computeWage();
			System.out.println(reliance);
		}

}

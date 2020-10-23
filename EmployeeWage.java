import java.util.Random;
import java.util.Scanner;
	public class EmployeeWage{
		//private final int NUMBER_WORKING_DAYS = 20, MAX_HRS_IN_MONTH = 100;
		//int totalWorkingDays = 0,empRatePerHr = 20, empHr ,randomNumber,totalEmpHr,totalSalary;
		private final String company;
 		private final int empRatePerHr;
 		private final int numWorkingDays;
 		private final int maxHoursPerMonth;
 		private  int totalEmpWage = 0;

		public EmployeeWage(int empRatePerHr,int maxHoursPerMonth,int numWorkingDays,String company) {
  			this.empRatePerHr = empRatePerHr;
   			this.maxHoursPerMonth = maxHoursPerMonth;
   			this.numWorkingDays = numWorkingDays;
   			this.company = company;
 		}
		public int randomGeneration() {
  				Random random = new Random();
    				int upperbond = 3;
				int randomNumber = random.nextInt(upperbond);
    				return randomNumber;
 		}
		public void computeEmpWage() {
    				int empHr = 0,totalEmpHr = 0,totalWorkingDays = 0;
  			while (totalEmpHr < maxHoursPerMonth && totalWorkingDays < numWorkingDays) 
			{
  				int randomNumber = randomGeneration();
     				switch(randomNumber){
     				case 2:
        				empHr = 8;
        			break;
     				case 1:
        				empHr = 4;
        			break;
     				default:
        				empHr =0;
        			break;
    				}
     				totalEmpHr = totalEmpHr + empHr;
    			}
    			totalEmpWage = totalEmpHr * empRatePerHr ;
 		}
		public String toString() {
 				 return "Total Emp Wage For Company : " + company + " "  +" is: " + totalEmpWage;
		}
		public static void main(String[] args){
			EmployeeWage object_1 = new EmployeeWage(20,100,20,"jio");
  			EmployeeWage object_2 = new EmployeeWage(10,50,20,"reliance");
  			object_1.computeEmpWage();
  			System.out.println(object_1);
  			object_2.computeEmpWage();
  			System.out.println(object_2);
		}
	}


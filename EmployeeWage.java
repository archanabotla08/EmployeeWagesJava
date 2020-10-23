import java.util.Random;
import java.util.Scanner;
	public class EmployeeWage{
		//private final int NUMBER_WORKING_DAYS = 20, MAX_HRS_IN_MONTH = 100;
		//int totalWorkingDays = 0,empRatePerHr = 20, empHr ,randomNumber,totalEmpHr,totalSalary;
		/*
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
 		}*/
		private CompanyEmployeeDetails[] companyEmpWageArray = new CompanyEmployeeDetails[3];
 		public int counter = 0;
		public int randomGeneration() {
  				Random random = new Random();
    				int upperbond = 3;
				int randomNumber = random.nextInt(upperbond);
    				return randomNumber;
 		}
		public void addCompanyEmpWageDetails(int empRatePerHr,int maxHoursPerMonth,int numWorkingDays,String company) {
 				companyEmpWageArray[counter]= new CompanyEmployeeDetails(empRatePerHr,maxHoursPerMonth,numWorkingDays,company);
    				counter++;
 		}
		public void computeEmpWage() {
  			for(int i=0;i<counter;i++) {
    				companyEmpWageArray[i].setTotalWage(this.computeEmpWage(companyEmpWageArray[i]));
    				System.out.println(companyEmpWageArray[i]);
  			}
 		}
		public int computeEmpWage(CompanyEmployeeDetails companyEmpWage) {
    				int empHr = 0,totalEmpHr = 0,totalWorkingDays = 0;
  			while (totalEmpHr < companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numWorkingDays) 
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
    			return totalEmpHr * companyEmpWage.empRatePerHr ;
 		}
		/*
		public String toString() {
 				 return "Total Emp Wage For Company : " + company + " "  +" is: " + totalEmpWage;
		}
		*/
		public static void main(String[] args){
			EmployeeWage emp = new EmployeeWage();
			emp.addCompanyEmpWageDetails(20,100,20,"jio");
  			emp.addCompanyEmpWageDetails(10,80,10,"reliance");
  			emp.computeEmpWage();
		}
	}


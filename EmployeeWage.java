import java.util.Random;
import java.util.Scanner;
	public class EmployeeWage{
		//private final int NUMBER_WORKING_DAYS = 20, MAX_HRS_IN_MONTH = 100;
		//int totalWorkingDays = 0,empRatePerHr = 20, empHr ,randomNumber,totalEmpHr,totalSalary;
		public int randomGeneration() {
  				Random random = new Random();
    				int upperbond = 3;
				int randomNumber = random.nextInt(upperbond);
    				return randomNumber;
 		}
		public void calculateEmpHr(String name,int MAX_HRS_IN_MONTH,int TOTAL_WORKING_DAYS) {
			  	int max =  MAX_HRS_IN_MONTH;
    			  	int Days = TOTAL_WORKING_DAYS;
    			  	String companyName = name;
    				int empRatePerHr =20,empHr=0,totalWorkingDays=0,totalSalary=0,totalEmpHr=0;
  			while (totalEmpHr < MAX_HRS_IN_MONTH && totalWorkingDays < Days) 
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
    			totalSalary = totalEmpHr * empRatePerHr ;
     			System.out.println("Employee name = "+companyName+" "+"Employee Salary = "+totalSalary);
 		}
		public static void main(String[] args){
			EmployeeWage emp = new EmployeeWage();
                	Scanner sc =  new Scanner(System.in);
                	System.out.println("Enter the number of company's");
                	int companyNumber = sc.nextInt();
                	for(int i=1;i<=companyNumber;i++){
                	System.out.println("Enter the company's name");
                 	String name = sc.next();
                	System.out.println("Enter the MAX_HRS_IN_MONTH");
                	int MAX_HRS_IN_MONTH = sc.nextInt();
                	System.out.println("Enter the working days");
                	int TOTAL_WORKING_DAYS = sc.nextInt();
                	emp.calculateEmpHr(name,MAX_HRS_IN_MONTH,TOTAL_WORKING_DAYS);
			}
		}
	}

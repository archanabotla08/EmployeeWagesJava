import java.util.Random;
	public class EmployeeWage{
		public static void main(String[] args){
			//System.out.println("Welcome to Master");
			Random random = new Random();
			int upperbond = 3 , empRatePerHr = 20,empHr = 0,isFullTime = 2,isPartTime = 1,numWorkingDays = 20,totalSalary = 0,MAX_HRS_IN_MONTH = 100,totalWorkingDays = 0, totalEmpHrs=0;
                	while( totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < numWorkingDays ) {
                 		int randomNumber = random.nextInt(upperbond);
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
				totalEmpHrs = totalEmpHrs + empHr;
		}
				totalSalary = totalEmpHrs * empRatePerHr;
                		System.out.println("Employee Wage Month With MAX_HRS_IN_MONTH::");
                		System.out.println("Total Salary = " + totalSalary);
		}
	}

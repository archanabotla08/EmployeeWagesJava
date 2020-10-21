import java.util.Random;
	public class EmployeeWage{
		public static void main(String[] args){
			//System.out.println("Welcome to Master");
			Random random = new Random();
			int upperbond = 3 , empRatePerHr = 20,empHr = 0,isFullTime = 2,isPartTime = 1,numWorkingDays = 20,totalSalary = 0;
                	for(int day=1;day<=numWorkingDays;day++) {
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
				int Salary = empRatePerHr * empHr;
				totalSalary = totalSalary + Salary;
		}
                		System.out.println("Employee Wage Month :");
                		System.out.println("Total Salary = " + totalSalary);
		}
	}

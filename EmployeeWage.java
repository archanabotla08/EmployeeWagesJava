import java.util.Random;
	public class EmployeeWage{
		public static void main(String[] args){
			//System.out.println("Welcome to Master");
			Random random = new Random();
                	int upperbond = 2;
                	int randomNumber = random.nextInt(upperbond);
			int empRatePerHr = 20,empHr = 0,isFullTime = 2,isPartTime = 1;
                	if(randomNumber == isFullTime) {
                 		empHr = 8;
			}else if(randomNumber == isPartTime) {
                        	empHr = 4;
                	}else {
                        	empHr = 0;
                	}
				int Salary = empRatePerHr * empHr;
                		System.out.println("Employee Daily Wage Based on Part of full Time :");
                		System.out.println("Salary = " + Salary);
		}
	}

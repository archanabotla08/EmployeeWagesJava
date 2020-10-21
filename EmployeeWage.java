import java.util.Random;
	public class EmployeeWage{
		public static void main(String[] args){
			//System.out.println("Welcome to Master");
			Random random = new Random();
                	int upperbond = 3;
                	int randomNumber = random.nextInt(upperbond);
			int empRatePerHr = 20,empHr = 0,isFullTime = 2,isPartTime = 1;
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
                		System.out.println("Employee Daily Wage Based on Part of full Time Case :");
                		System.out.println("Salary = " + Salary);
		}
	}

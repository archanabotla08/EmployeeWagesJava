import java.util.Random;
	public class EmployeeWage{
		public static void main(String[] args){
			//System.out.println("Welcome to Master");
			Random random = new Random();
                	int upperbond = 2;
                	int randomNumber = random.nextInt(upperbond);
			int empRatePerHr = 20;
                 	int empHr = 8;
                	if(randomNumber == 1) {
                 		int Salary = empRatePerHr * empHr;
			       	System.out.println("Employee Daily Check Salary = " + Salary);
                	}else {
				int Salary = 0;
                        	System.out.println("Employee Daily Check Salary = "+ Salary);
                	}
		}
	}

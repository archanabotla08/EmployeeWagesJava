import java.util.Random;
	public class EmployeeWage{
		public static void main(String[] args){
			//System.out.println("Welcome to Master");
			Random random = new Random();
                	int upperbond = 2;
                	int randomNumber = random.nextInt(upperbond);
                	if(randomNumber == 1) {
                        	System.out.println("Employee is present");
                	}else {
                        	System.out.println("Employee is absent");
                	}
		}
	}

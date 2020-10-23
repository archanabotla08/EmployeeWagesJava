import java.util.Random;
	public class EmployeeWage{
		private final int NUMBER_WORKING_DAYS = 20, MAX_HRS_IN_MONTH = 100;
		int totalWorkingDays = 0,empRatePerHr = 20, empHr ,randomNumber,totalEmpHr,totalSalary;
		public int randomGeneration() {
  				Random random = new Random();
    				int upperbond = 3;
			    	randomNumber = random.nextInt(upperbond);
    				return randomNumber;
 		}
		public int calculateEmpHr() {
  			while (totalEmpHr < MAX_HRS_IN_MONTH && totalWorkingDays < NUMBER_WORKING_DAYS) 
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
    			return totalEmpHr;
 		}
		public int totalSalary() {
  			totalSalary = totalEmpHr * empRatePerHr ;
     			return totalSalary;
 		}
 		public void display(int totalSalary) {
      			System.out.println("Salary = "+ totalSalary);
 		}
		public static void main(String[] args){
			EmployeeWage emp = new EmployeeWage();
                	emp.randomGeneration();
                	emp.calculateEmpHr();
                	int salary = emp.totalSalary();
                	emp.display(salary);
	}
}

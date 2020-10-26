import java.util.Random;
import java.util.*;
	public class EmployeeWage implements IComputeEmpWage{
 		public int counter = 0;
		public List<CompanyEmployeeDetails> companyEmpWageList;
		public Map<String,CompanyEmployeeDetails> companyEmpWageMap;
 		public EmployeeWage() {
   			companyEmpWageList = new ArrayList<>();
			companyEmpWageMap = new HashMap<>();
 		}
		public int randomGeneration() {
  				Random random = new Random();
    				int upperbond = 3;
				int randomNumber = random.nextInt(upperbond);
    				return randomNumber;
 		}
		public void addCompanyEmpWageDetails(int empRatePerHr,int maxHoursPerMonth,int numWorkingDays,String company) {
 		//		companyEmpWageArray[counter]= new CompanyEmployeeDetails(empRatePerHr,maxHoursPerMonth,numWorkingDays,company);
    		//		counter++;
				 CompanyEmployeeDetails companyEmpWage = new CompanyEmployeeDetails(empRatePerHr,maxHoursPerMonth,numWorkingDays,company);               
 				 companyEmpWageList.add(companyEmpWage);
				companyEmpWageMap.put(company,companyEmpWage);
 		}
		public void computeEmpWage() {
  			for(int i=0;i<companyEmpWageList.size();i++) {
    		//		companyEmpWageArray[i].setTotalWage(this.computeEmpWage(companyEmpWageArray[i]));
    		//		System.out.println(companyEmpWageArray[i]);
				CompanyEmployeeDetails companyEmpWage = companyEmpWageList.get(i);
  				companyEmpWage.setTotalWage(this.computeEmpWage(companyEmpWage));
  				System.out.println(companyEmpWage);
  			}
 		}
		public int getTotalWage(String company){
			return companyEmpWageMap.get(company).totalEmpWage;
		}
		public int computeEmpWage(CompanyEmployeeDetails companyEmpWage) {
    				int empHr = 0,totalEmpHr = 0,totalWorkingDays = 0,totalWage=0,dailyWage = 0;
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
    				totalWage = totalEmpHr * companyEmpWage.empRatePerHr ;
 				return totalWage;
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
			System.out.println("Total Wage for company : " + emp.getTotalWage("jio"));
		}
	}


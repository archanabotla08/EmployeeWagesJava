public class CompanyEmployeeDetails {
        public int empRatePerHr,maxHoursPerMonth,numWorkingDays,totalEmpWage;
        public String company;
        public CompanyEmployeeDetails(int empRatePerHr,int maxHoursPerMonth,int numWorkingDays,String company)
        {
                this.empRatePerHr = empRatePerHr;
                this.maxHoursPerMonth = maxHoursPerMonth;
                this.numWorkingDays = numWorkingDays;
                this.company = company;
        }
        public void setTotalWage(int totalEmpWage) {
                this.totalEmpWage = totalEmpWage;
        }
        public String toString() {
                return "Total Emp Wage for Company : " +company+ " " + " is: "+totalEmpWage;
        }
}

public class EmployeeWageUc5 {
	public static final int Is_Part_Time = 1;
	public static final int Is_Full_Time = 2;
	public static final int Emp_Rate__Per_Hour =20;
	public static final int Num_Of_Working_Days =2;
	
	
	public static void main(String[] args) {
		
		int empHrs = 0;
		int empWage = 0;
		int totalWage = 0;
		
		for (int day = 0; day < Num_Of_Working_Days; day++) {
			int empCheck = (int)Math.floor(Math.random() * 10)%3;
			switch (empCheck) {
				case Is_Part_Time:
					empHrs = 4;
					break;
				case Is_Full_Time:
					empHrs = 8;
					break;
				default:
					empHrs = 0;
		}
		empWage = empHrs * Emp_Rate__Per_Hour;
		totalWage += empWage;
			System.out.println("Employee Wage :" +empWage);
	}
	System.out.println("Total Emp Wage: " + totalWage );

}
}

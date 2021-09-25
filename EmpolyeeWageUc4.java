public class EmpolyeeWageUc4 {
	public static final int Is_Part_Time = 1;
	public static final int Is_Full_Time = 2;
	public static final int Emp_Rate__Per_Hour =20;
	
	public static void main(String[] args) {
		
		int empHrs = 0;
		int empWage = 0;
		
		int empCheck = (int)Math.floor(Math.random() * 10)%2;
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
			System.out.println("Employee Wage :" +empWage);
	}
}

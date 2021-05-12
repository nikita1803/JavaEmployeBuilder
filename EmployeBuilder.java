package employeBuilderUC1;

public class EmployeBuilder {
	public static void main(String[] args) {
		System.out.println("Welcome in employee wage");
		
		int isFullTime = 1;
		int wagePerHour = 20;
		int workHours = 0;
		double attendance = Math.floor(Math.random() * 10) % 2; 
		if(attendance==1) {
		  System.out.println("Employee is present");
		  workHours = 8;
		}
		else {
			System.out.println("Employee is absent");
		}
			int dailyWage = (wagePerHour * workHours);
			System.out.println (dailyWage);
		}
	}
	


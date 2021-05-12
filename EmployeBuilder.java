package employeBuilderUC1;

public class EmployeBuilder {
	public static void main(String[] args) {
		System.out.println("Welcome in employee wage");
		
		//UC-1 (EMPLOYEE ATTENDANCE)
		
		int isFullTime = 1;
		double attendance = Math.floor(Math.random() * 10) % 2; 
		if(attendance==1) {
		  System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is absent");
		}
	}

}

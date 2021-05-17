package employeBuilderUC1;

public class EmployeBuilder 
{
	public static void main(String[] args) {
		System.out.println("Welcome in employee wage");
		
		int wagePerHour = 20;
		int workHours = 0;
		int attendance = (int) ((Math.random() * 10) % 3);
		switch (attendance)
		{
			case 1: 
				workHours = 8;
			break;
			case 2: 
				workHours = 4;
			break;
		    default: 
		    	workHours = 0;
		}	
		int dailyWage = (wagePerHour * workHours);
		System.out.println("Part time or Full time salray of employe :" +dailyWage);
		}
}
	


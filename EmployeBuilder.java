package employeBuilderUC1;

public class EmployeBuilder 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome in employee wage");
		int isPartime = 2;
		int isFullTime = 1;
		int wagePerHour = 20;
		int workHours = 0;
		int totalSalary = 0;
		int numWorkDays = 20;
		for( int day = 1; day <= numWorkDays; day++)
		{
		int attendance = (int) ((Math.random() * 10) % 3 + 1);
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
		System.out.println("Wages for a month :" +totalSalary);
	}
}

	


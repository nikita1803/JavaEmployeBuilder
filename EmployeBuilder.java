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

		int attendance = (int) ((Math.random() * 10) % 3);
		switch (attendance)
		{
			case 1: 
				workHours = 8;
			break;
			case 2: 
				workHours = 4;
			break;
		    case 3: 
		    	workHours = 0;
		}
			
		int dailyWage = (wagePerHour * workHours);
		System.out.println("Part time or Full time salray of employe :" +dailyWage);
		}
}

	


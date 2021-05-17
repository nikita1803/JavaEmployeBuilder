package employeBuilderUC1;

public class EmployeBuilder 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome in employee wage");
		
		int isPartime = 1;
		int isFullTime = 2;
		int wagePerHour = 20;
		int workHours = 0;
		int totalSalary = 0;
		int numWorkDays = 20;
		for( int day = 1; day <= numWorkDays; day++)
		{
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
		int salary = (workHours * wagePerHour);
		totalSalary = (salary * numWorkDays);
		}
		System.out.println("Wages for a month :" +totalSalary);
	}
}

	


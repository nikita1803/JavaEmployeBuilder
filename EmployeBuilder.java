package employeBuilderUC1;

public class EmployeBuilder 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome in employee wage");
		
		int hrsInMonth = 100;
		int wagePerHour = 20;
		int numWorkDays = 20;
		int totalEmpHours = 0;
		int workHours = 0;
		int totalSalary = 0;
		int workDays = 0;
		
		while(totalEmpHours <= hrsInMonth && workDays <= numWorkDays)
		{
			workDays++ ;
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
			totalEmpHours = (workHours + totalEmpHours);
			System.out.println("Total Working hours :" +totalEmpHours);
		}
		totalSalary = (totalEmpHours * wagePerHour);
		System.out.println("Total Wages for a working hours and days :" +totalSalary);
	}
}

	


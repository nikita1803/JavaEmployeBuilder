package employeBuilderUC1;

public class EmployeBuilder 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome in employee wage");
		int wagePerHour = 20;
		int workHours = 0;
		int totalSalary = 0;
		int numWorkDays = 20;
		int totalEmpHours = 0;
		int workDays = 0;
		for( int day = 1; day <= numWorkDays; day++)
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

	


package employeBuilderUC1;

public class EmployeBuilder {
	public static void main(String[] args) 
	{
		System.out.println("Welcome in employee wage");
		int isPartime = 2;
		int isFullTime = 1;
		int wagePerHour = 20;
		int workHours = 0;

		double attendance = Math.floor(Math.random() * 10) % 3; 
		if(isPartime == attendance)
		{
			workHours = 4;
		}
		else if (isFullTime == attendance) 
		{
			workHours = 8;
		}
		else 
		{
			workHours = 0;
			System.out.println("no salary");
		}
		int dailyWage = (wagePerHour * workHours);
		System.out.println("Part time or Full time salray of employe :");
		System.out.println (dailyWage);
	}
}

	


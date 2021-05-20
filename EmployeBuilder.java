package employeBuilderUC1;
import java.util.Scanner;
public class EmployeBuilder 
{		
	public final static int fullday = 1;
	public final static int halfday = 2;
	
	private final String companyName ;
	private final int WagePerHour ;
	private int workDays ;
	private final int MaxHours;
	public int totalSallary;
	
	public EmployeBuilder(String companyName , int WagePerHour , int workDays , int MaxHours)
	{
		this.companyName = companyName;
		this.WagePerHour = WagePerHour;
		this.workDays = workDays;
		this.MaxHours = MaxHours;
	}
		public double calculateEmpWage() 
		{
			int workHours = 0 ,empHours = 0 ;
			int TotalWorkDays = 0;
			while(workHours <= MaxHours && TotalWorkDays <= workDays)
			{
				workDays++ ;	
				int attendance = (int) Math.floor(Math.random() * 10) % 3; 
				switch (attendance)
				{
					case fullday: 
						empHours = 8;
					break;
					case halfday: 
						empHours = 4;
					break;
					default: 
						empHours = 0;
				}
				workHours += empHours;
			
			}
			System.out.println("Total working days" + workDays +  "Total working hours" + workHours );
			int totalSalary = ( WagePerHour * workHours);
			return totalSalary;
		}
		public static void main(String[] args)
		{
			System.out.println("Welcome in employee wage");
			
			EmployeBuilder Honda = new EmployeBuilder("Honda", 50, 7, 10);
			EmployeBuilder Relience = new EmployeBuilder("Relience", 50, 6, 10);
			double salaryHonda = Honda.calculateEmpWage();
			System.out.println("Employe Wage of honda is : " +salaryHonda);
			double salaryRelience =Relience.calculateEmpWage();
			System.out.println("Employe Wage of relience is : " +salaryRelience);
		}
}

	


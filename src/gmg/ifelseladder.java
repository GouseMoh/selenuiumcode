package gmg;

import java.util.Scanner;

public class ifelseladder {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the week_num");
		int week_no= sc.nextInt();

		if (week_no==1)
		{
			System.out.println("Print the day as SUNDAY");
		}
		else if(week_no==2) {
			System.out.println("Print the day as monday");
		} 
		else if(week_no==3)
		{
			System.out.println("print the day as TUESDAY");
		}
		else if(week_no==4)
		{
			System.out.println("print the day as WEDNESDAY");
		}
		else if(week_no==5)
		{
			System.out.println("print the day as THURESDAY");
		}
		else if(week_no==6)
		{
			System.out.println("print the day as FRIDAY");
		}
		else if(week_no==7)
		{
			System.out.println("print the day as SATURDAY");
		}
		else
		{
			System.out.println("invalid week number");
		}

	}

}

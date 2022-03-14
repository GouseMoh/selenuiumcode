package gmg;

import java.util.Scanner;

public class positive_negative {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the number:");
	int num=sc.nextInt();
	if (num<0)
	{
		System.out.println("The number is Negative");
	}
	else if(num>0)
	{
		System.out.println("THE numberis positive");
		
	}
	else 
	{
		System.out.println("zero");
	}
	}

}

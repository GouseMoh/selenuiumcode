package Utilesfuntion;

import java.util.Scanner;



public class NumberFormatExection{

	public static void main(String[] args)
	{
	System.out.println("The Program IS Started:");
	System.out.println("The Program is in Progress:");
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the String:");
	String Str=sc.next();
	try
	{
		int num=Integer.parseInt(Str);
	}
	catch(NumberFormatException e)
	{
	System.out.println("Enter the Integer Value:");
	}
	System.out.println("Program is completed:");
	System.out.println("Program is Exicuted:");
	
	
	
	}
	}
	

	

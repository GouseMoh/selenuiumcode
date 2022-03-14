package Utilesfuntion;

import java.util.Scanner;

public class Execepton {

	public static void main(String[] args) {

		System.out.println("Program is Started..");
        System.out.println("Program is in Progress...");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num =sc.nextInt();
//        System.out.println(100/num);
        try
        {
        System.out.println(100/num);
        }
        catch(ArithmeticException e)
        {
        	System.out.println("Enter Invalid input ple give correct Input:");
        }
        System.out.println("Program  is completed....");
        System.out.println("program is exited..");
	}

}

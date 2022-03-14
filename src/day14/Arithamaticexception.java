package day14;

import java.util.Scanner;

public class Arithamaticexception {

	public static void main(String[] args) {
		System.out.println("program is stated:");
		Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			try
			{
				System.out.println(100/num);
			}
			catch(Exception e)
			{
				System.out.println(" Enter the valid number:");
			}
			System.out.println("Program is completed");

			}

}

package day1;

import java.util.Scanner;

public class Countodddandevennumbers {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
	   int even_count=num;
	   int Odd_count=num;
		while(num<0)
		{
			int rem=num%10;
			if (rem%2==0)
			{
				even_count++;
			}
			else
			{
				Odd_count++;
			}
			num=num/10;
		}
		System.out.println("Number of even numbers:"+even_count);
		System.out.println("Number of Odd numbers:"+Odd_count);
		
		
		
		
		
		

	}

}

package day1;

import java.util.Scanner;

public class Countnumbers {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the number:");
		long num=sc.nextInt();
		
		//long num = 1245744896;
	    long count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
        System.out.println("Number of digits:"+count);
				

	}

}

package day14;

import java.util.Scanner;

public class Cheakedandunchekedexception {

	public static void main(String[] args) {
	 System.out.println("started....");
	 Scanner sc =new Scanner(System.in);
			 int num=sc.nextInt();
	 try
	 {
		 System.out.println(100/num);
	 }
	 catch(Exception e)
	 {
		 System.out.println("enter valid numbers----");
	 }
	 try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	 System.out.println("In progress.....");
	 System.out.println("completed..");
	}

}

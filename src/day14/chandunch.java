package day14;

import java.util.Scanner;

public class chandunch {

	public static void main(String[] args) {

System.out.println("program is strated");
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int digi=num+100;
try
{
	System.out.println(100/digi);
}
catch(Exception e)
{
	System.out.println("Enter a valid num:");
}
try {
	Thread.sleep(6000);
} catch (InterruptedException e) {
	
	e.printStackTrace();
}
System.out.println("successfully completed");



	}

}

package gmg;

import java.util.Scanner;

public class largestnumber {

	public static void main(String[] args) {

Scanner sc =new Scanner(System.in);
System.out.println("Enter the number a:");
int a=sc.nextInt();
System.out.println("Enter the number b:");
int b=sc.nextInt();
System.out.println("Enter the number c:");
int c=sc.nextInt();
if(a>b&&a>c)
{
	System.out.println("a is the largest number");
}
if (b>a&&b>c)
{
	System.out.println("b is the largest number");
	}
if (c>a&&c>b)
{
	System.out.println("c is the largest number");
}

	}

}

package day14;

import java.util.Scanner;

public class ExceptionArray {

	public static void main(String[] args) {
		System.out.println("Program is started");
    int a[]=new int [5];
    Scanner sc=new Scanner (System.in);
    System.out.println("enter the value:");
    int num=sc.nextInt();
    System.out.println(" enter the position:");
    int pos=sc.nextInt();a[pos]=num;
    System.out.println(a[pos]);
    //a[pos]=num;
   // System.out.println(a[pos]);
    try
    {
    	a[pos]=num;
        System.out.println(a[pos]);
    	
    }
    catch( ArrayIndexOutOfBoundsException e)
    {
    	System.out.println(("give the valid path"));
    }
    System.out.println("program completed");
	}

}

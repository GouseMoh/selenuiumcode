package day14;

import java.util.Scanner;

public class Exceptionbynum {

	public static void main(String[] args)
	{
   System.out.println("Program is started");
   Scanner sc=new Scanner(System.in);
   String str=sc.next();
   //int num=Integer.parseInt(str);
  try
   {
	   int num=Integer.parseInt(str);
	   
   }

   catch(Exception e)
   {
	 System.out.println(" give the integer value:");
   }
   System.out.println(" progtram is competed");
   
		   

	}

}

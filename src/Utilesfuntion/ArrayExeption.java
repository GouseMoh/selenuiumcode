package Utilesfuntion;

import java.util.Scanner;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ArrayExeption {

	public static void main(String[] args) {
System.out.println("Program is Started.....");
System.out.println("prograam is in Progress.....");
int a[]=new int[5];
Scanner sc =new Scanner(System.in);
System.out.println("Enter The Value:");
int num=sc.nextInt();
System.out.println("Enter th position");
int pos =sc.nextInt();
//a[pos]=num;
try
{
	a[pos]=num;
	System.out.println(a[pos]);
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("Enter the Valide Position:");
}



	}

}

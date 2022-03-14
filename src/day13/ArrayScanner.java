package day13;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner {
	
public static void main(String[] args) {

		int a[]=new int [5];
		Scanner sc= new Scanner(System.in);
		/*System.out.println("Enter First Value ");
		a[0]=sc.nextInt();
		System.out.println("Enter second Value ");
		a[1]=sc.nextInt();
		System.out.println("Enter third Value ");
		a[2]=sc.nextInt();
		System.out.println("Enter Fourth Value ");
		a[3]=sc.nextInt();
		System.out.println("Enter Fifth Value ");
		a[4]=sc.nextInt();
		*/
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Enter"+i+"value");
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
	}

}

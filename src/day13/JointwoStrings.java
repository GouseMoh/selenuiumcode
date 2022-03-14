package day13;

import java.util.Scanner;

public class JointwoStrings {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter two names:");
	String Firstname = sc.next();
	String lastname = sc.next();
	String goodname = Firstname+lastname;
	System.out.println("GOOD NAME:"+goodname);
	
	
	}

}

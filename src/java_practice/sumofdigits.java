package java_practice;

public class sumofdigits {

	public static void main(String[] args) {
int num=12345;
int sum=0;
while (num>0) {
	sum=sum+num%10;
	num=num/100;
}
System.out.println(" sum of the digits in sum:"+sum);
	}

}

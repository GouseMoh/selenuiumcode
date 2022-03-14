package gmg;

public class CountSumOfDigits {

	public static void main(String[] args) {
	int num=641253;
	int sum=0;
	while(num>0)
	{
		sum=sum+num%10;
		num=num/10;
	}
	System.out.println("sum of the digits in a num:"+sum);

	}

}

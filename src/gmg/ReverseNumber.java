package gmg;

public class ReverseNumber {

	public static void main(String[] args) {
	int num=1235321;
	int org=num;
	int rev=0;
	while(num!=0)
	{
		rev=rev*10+num%10;
		num=num/10;
			}
	System.out.println("Reverse number is:"+rev);
	if(rev==org)
	{
		System.out.println("Number is palindrome");
	}
	else
	{
		System.out.println("Number is not a palindrome");
	}
	
	}

}

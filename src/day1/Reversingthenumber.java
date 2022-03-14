package day1;

public class Reversingthenumber {

	public static void main(String[] args) {
int num=12421;
int temp_num=num;
int rev=0;
while (num!=0)
{
	rev=rev*10+num%10;
	num=num/10;
}
System.out.println("Reverse number:"+rev);

if (temp_num==rev)
{
	System.out.println("Number is palindrom");
}
else
{
	System.out.println("number is not palindrom");
}









	}

}

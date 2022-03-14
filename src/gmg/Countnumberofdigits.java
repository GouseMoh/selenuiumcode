package gmg;

public class Countnumberofdigits {

	public static void main(String[] args) {
	int num=65413;
	int count =0;
	while (num>0)
	{
		num=num/10;
		count++;
	}
	System.out.println("Number of Digits:"+count);
	}

}

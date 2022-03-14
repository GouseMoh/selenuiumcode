package java_practice;

public class evencountandoddcount {

	public static void main(String[] args) {
		long num=123456789;
		int even_count=0;
		int odd_count=0;
		while (num>0)
		{
			long rem=num%10;
					if (rem%2==0)
					{
						even_count++;
					}
					else
					{
						odd_count++;
					}
					num=num/10;
		}
System.out.println("number of even number:"+even_count);
System.out.println("number of odd number:"+odd_count);
	}

}

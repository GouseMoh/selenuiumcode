package gmg;
class cal
{
	int x;
	void add(cal a)
	{
		x=a.x+5;
	}
}


public class Call_by_reference {

	public static void main(String[] args) {
		cal c=new cal();
		c.x=10;
		c.add(c);
		System.out.println(c.x);
		

	}

}

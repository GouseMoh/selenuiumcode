package day12;

interface shape
{
	int length=10;
	int breath=20;
	void  circle();
	default  void square()
	{
		System.out.println("iam squre");
	}
	static void retangle()
	{
		System.out.println(" iam reactangle");
	}
	
}

public class interfacedemo implements shape
{
public void circle()
{
System.out.println(" iam circle");
}

public static void main(String[]args)
{
	//shape sh=new shape();
  shape sh = new interfacedemo();
  sh.circle();
  sh.square();
  shape.retangle();
  
	
}
}


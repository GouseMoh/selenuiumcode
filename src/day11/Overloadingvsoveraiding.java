package day11;

class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	void m2(int b)
	{
		System.out.println(b);
	}
	void m3(int c)
	{
		System.out.println(c);
	}
}
class xyz extends ABC
{
	void m1(int a)
	{
		System.out.println(a*a);  ///over riding
	}
	void m2(int a , int b )
	{
		System.out.println(a+b);   ///over loading
	}
	void m3 ( int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	void m3(int c)
	{
		System.out.println(c*c);
	}
	
}
public class Overloadingvsoveraiding {

	public static void main(String[] args) {
		xyz obj=new xyz();
		obj.m1(10);
		obj.m3(10,20,30);
		obj.m2(10, 200);
		obj.m3(5);
				
		
		

	}

}

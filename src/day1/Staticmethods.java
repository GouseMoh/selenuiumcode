  package day1;
    public class Staticmethods {

	static int a=10;
	int b=20;
	static void m1()
	{
		System.out.println("this is a static method");
	}
	void m2()
	{
		System.out.println(" this is not a static method");
	}
	public static void main(String[] args) {
	System.out.println(a);
	m1();
	Staticmethods sat=new Staticmethods();
	System.out.println(sat.b);
	sat.m2();
		}

}

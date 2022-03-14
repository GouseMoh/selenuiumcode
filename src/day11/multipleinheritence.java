package day11;
class C
{
	int a=10;
	void display()
	{
		System.out.println(a);	
		}
}
class D extends C
{
	int b=20;
	void show()
	{
		System.out.println(b);
	}
}
class E extends D
{
	int c=30;
	void print()
	{
		System.out.println(c);
		
	}
}

public class multipleinheritence {
	public static void main(String []args) {
		E eobj=new E();
		eobj.print();
		eobj.show();
		eobj.display();
		
		
		
}
}
















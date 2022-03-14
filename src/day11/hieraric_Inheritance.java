package day11;
class parent
{
	void display( int a)
	{
		System.out.println(a);
	}
}

class child1 extends parent
{
	void show (int b)
	{
		System.out.println(b);
	}
}
 class child2 extends parent
 {
	 void print(int c)
	 {
		 System.out.println(c);
	 }
 }

public class hieraric_Inheritance {

	public static void main(String[] args) {
   parent pat = new parent();
   pat.display(100);
   
   child1 c1=new child1();
   c1.show(200);
   c1.display(10);
   
   child2 c2= new child2();
   c2.print(300);
   c2.display(400);
   
   
	}

}

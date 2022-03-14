package gmg;
class X
{
	int x=10;
 void display()
	{
	System.out.println(x);
	}
}
class Y extends X
{
	int Y=20;
	void show()
	{
		System.out.println(Y);
	}
}
class Z extends Y
{
	int z=30;
			void Print()
			{
		System.out.println(z);
			}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		Z obj=new Z();
		obj.display();
		obj.show();
		obj.Print();
		

	}

}

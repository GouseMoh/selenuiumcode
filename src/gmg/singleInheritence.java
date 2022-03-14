package gmg;
class a
{
	int A=100;
	void display()
	{
		System.out.println(A);
	}
}
class b extends a{
	int B=200;
	void show()
	{
		System.out.println(B);
	}
}

public class singleInheritence{
	public static void main(String[]args) {
		b Bobj = new b();
		Bobj.display();
		Bobj.show();
		
		
	}

}

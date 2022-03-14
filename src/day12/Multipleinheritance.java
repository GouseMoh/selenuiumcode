package day12;

public class Multipleinheritance extends PQR implements XYZ,ABC
{
public void m1()
{
	System.out.println(x);
}
public void m2()
{
	System.out.println(y);
}
public void m3()
{
	System.out.println(z);
}
	public static void main(String[] args) {

		 Multipleinheritance mi= new Multipleinheritance ();
		 mi.m1();
		 mi.m2();
		 mi.m3();
		 

	}

}

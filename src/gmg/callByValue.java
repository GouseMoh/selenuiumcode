package gmg;
class A
{
	int x;
	void add(int a)
	{
		x=a+5;
	}
}

public class callByValue {

	public static void main(String[] args) {
		A aobj=new A();
		int x=10;
		aobj.add(x);
		System.out.println(x);
		System.out.println(aobj.x);
				
		

	}

}

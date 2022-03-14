package gmg;

public class StaaticExample {
	static int a=100;
		   int b=200;
		   static void m1()
		   {
			   System.out.println(" this is a static meythod");
		   }
		   void m2()
		   {
			   System.out.println(" this is not a stativc method");
		   }

	public static void main(String[] args) {
		System.out.println(a);
		m1();
		StaaticExample se=new StaaticExample();
		System.out.println(se.b);
		se.m2();
	}

}

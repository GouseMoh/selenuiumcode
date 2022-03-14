package gmg;

public class ObjecttypeArray {

	public static void main(String[] args) {
	Object a[]= {10,10.5,"gullaplli",'a',true};
	/*for (int i=0; i<a.length;i++)
	{
		System.out.println(a[i]);
	}*/
	for(Object x:a)
	{
		System.out.println(x);
	}

	}

}

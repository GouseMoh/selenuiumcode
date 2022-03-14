package test;

public class Tofindthevalue {

	public static void main(String[] args) {
		int a[]= {500,100,200,400,600};
		int num=500;
		boolean status=false;
		for (int value:a)
		{
			if(value==num)
			{
				System.out.println( "value found");
				status=true;
				break;
	     }
		}
		if (status=false)
		{
			System.out.println("value was not found");
		}
		
		
		
		
	}

}

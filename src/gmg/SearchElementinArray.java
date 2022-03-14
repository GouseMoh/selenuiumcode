package gmg;

public class SearchElementinArray {

	public static void main(String[] args) {
	int a[]= {10,20,30,40,50,60};
	int num=10;
	boolean status=false;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==num)
		{
			System.out.println("Element found");
			status=true;
			break;
		}
		if(status==false)
		{
			System.out.println("Element is not found");
		}
		
	
	}
	}

}

package test;

public class TofindtheString {

	public static void main(String[] args) {
	String s[]= {"john","kim","ravi","suresh","noor"};
	String name="noor";
	boolean status=false;
	for(String value:s)
	{
		if(value==name) 
		{
			System.out.println("value found");
			status=true;
			break;
		}
	}
	if (status==false)
	{
		System.out.println("value is not found");
		}
		
	
	
	
	



	}

}

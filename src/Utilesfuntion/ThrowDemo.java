package Utilesfuntion;

public class ThrowDemo {


   void cheaksum(int num)
    {
	if (num<2)
    {
	//System.out.println("Number is Negetive can not Caliculate Square");
	 throw new ArithmeticException("Number is negative cannot Caliculate Square:");
     }
	else 
	{
		System.out.println("square of the number:"+(num*num));
	}

    }
	public static void main(String[] args) {		
		ThrowDemo td = new ThrowDemo();
  try
  {
  td.cheaksum(0);	
  }
  catch(ArithmeticException e)
  {
	System.out.println("Exception Occured an Handled.....");
  }
  
  
  
	}

}

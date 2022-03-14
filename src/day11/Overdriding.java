package day11;
 class bank
 {
	double roi()
	{
		return 0;
	}
 }

  class icic extends bank 
  {
	  double roi()
	  {
		  return 10.5;
	  }
  }
 class sbi extends bank
 {
	 double roi()
	 {
		return 9.5; 
	 }
 }
  class canara extends bank
  {
	  double roi()
	  {
		  return 11.2;
	  }
  }


public class Overdriding {


	public static void main(String[] args) {
		icic ic=new icic();
		System.out.println(ic.roi());
		
      sbi sb=new sbi();
      System.out.println(sb.roi());
      
      canara can=new canara();
      System.out.println(can.roi());
      
	
	}
	
	

}

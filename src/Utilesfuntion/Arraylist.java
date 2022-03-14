package Utilesfuntion;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List mylist=new ArrayList();
		//List<String>mylist=new ArrayList<String>();
		//List<Integer>mylist=new ArrayList<Integer>();
		
				mylist.add(100);
				mylist.add(200);
				mylist.add("welcome");
				mylist.add("Gullapalli mohammad gowse");
				System.out.println(mylist);
			
				int x =mylist.size(); 
				/*System.out.println("Size of the Array:"+x);
				mylist.remove(1);
				System.out.println("After removing the array:"+mylist);
				
		       mylist.add(500);
		       System.out.println("After addition of the Array:"+mylist);
		       mylist.add(3,"Abdulnabi");
		       System.out.println("After addition of the Array:"+mylist);
		       
		      
		      System.out.println(mylist.get(2));*/
		      
		    /*  for(Object x1:mylist)
		      {
		    	  System.out.println(x1);
		      }
		      */
				for (int i=0;i<=x;i++)
				{
					System.out.println(mylist.get(i));
				}
		      
		     
				mylist.clear();
				System.out.println(mylist);
		      
		       
		       
		       
	
		

	}

}

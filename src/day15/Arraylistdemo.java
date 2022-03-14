package day15;

import java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) {
    ArrayList mylist = new ArrayList();
	 // List  mylist=new ArrayList();
   mylist.add (100);
   mylist.add ("Gullaplli Mohammad Gowse");
   mylist.add(10.2);
   mylist.add('A');
   mylist.add(true);
  mylist.add(100);
  mylist.add(null);
 
  System.out.println(mylist);
  
  System.out.println(mylist.size());
  
   System.out.println(mylist.remove (5));    
   System.out.println(mylist);
   System.out.println(mylist.add("java"));
   System.out.println(mylist);
   System.out.println(mylist.size());
   mylist.add(5,"gowse");
   System.out.println("AfterInsertion in java:"+ mylist);
   mylist.remove(3);
   System.out.println("After Remove :"+mylist);
  mylist.get(1) 
   ;
  System.out.println(mylist.get(1));
  System.out.println(mylist.get(0));
   mylist.add(5,"ravi");
   System.out.println(mylist);
  /* for (Object x: mylist)
   {
	   System.out.println(x);
   }
   */
   for(int i=0;i<mylist.size();i++)
   {
	   System.out.println(mylist.get(i));
   }
   
   
   
   
   
	}

}

package Utilesfuntion;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
    HashMap <Integer,String>hm=new HashMap<Integer,String>();
    hm.put(101,"gowse");
    hm.put(102, "RAVI");
   hm.put(103,"surya");
   hm.put(104,"chinna somiya");
   System.out.println(hm.size());
  System.out.println(hm);
   // hm.remove(104);
   // System.out.println("After removing:"+hm);
   // System.out.println(hm.get(102));
    //System.out.println(hm.keySet());  
   for(Object K: hm.keySet())
   {
	   System.out.println(K+":"+hm.get(K));
   }
 hm.clear();
   
   
   
	}

}

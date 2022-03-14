package day15;

import java.util.HashSet;

public class Demohashset {

	public static void main(String[] args) {
		HashSet Hs=new HashSet();
		Hs.add(100);
		Hs.add("gowse");
		Hs.add('A');
		Hs.add(true);
		System.out.println(Hs);
		Hs.add("welcome");
		System.out.println(Hs);
		System.out.println(Hs.size());
	Hs.add(null);
	System.out.println("After Addition of numbers:"+Hs);
		System.out.println(Hs.size());
		Hs.add(null);
		System.out.println(("After additon odfn another null value:"+Hs));
		// contain
		System.out.println(Hs.contains("welcome"));
		Hs.remove("gowse");
		System.out.println("Set After Removing gowse:"+Hs);
		System.out.println(Hs.size());
	Hs.clear();
	System.out.println(Hs);
	System.out.println(Hs.isEmpty());
		
		
	}

}

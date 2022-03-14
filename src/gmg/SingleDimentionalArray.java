package gmg;

public class SingleDimentionalArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		 a[0]=10;
		 a[1]=20;
		 a[2]=30;
		 a[3]=40;
		 a[4]=50;
		 System.out.println("Array list:"+a[4]);
		 System.out.println("length of the SDA:"+a.length);
		 for(int x:a) {
			 System.out.println(x);
		 }

	}

}

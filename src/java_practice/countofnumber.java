package java_practice;

public class countofnumber {

	public static void main(String[] args) {
   int num=12356;
   int count=0;
   while(num>0)
   {
	   num=num/10;
	   count++;
    }
     System.out.println("Number of Digits:"+count);
	}

}

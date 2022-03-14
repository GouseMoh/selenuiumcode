package day1;

public class Swappingnumbers {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	/*System.out.println("before swapping :" +a+"  "+b+"   ");
   int t=a;
     a=b;
     b=a;
     System.out.println("after swapping:" +a+"   "+b+"   ");
*/
	b=a+b-(a=b);
    System.out.println("after swapping:" +a+"   "+b+"   ");
    
	
	
	
	}

}

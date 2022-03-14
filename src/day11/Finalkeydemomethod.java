package day11;
class Tem
{
void m1()
{
System.out.println("this is m1 from temp");	
}
}
class childtem extends Tem
{
 void m1()
 {
	 System.out.println(" this is over ride from tem");
	 super.m1();
 }
}

public class Finalkeydemomethod {

	public static void main(String[] args) {
		childtem ct=new childtem();
		ct.m1();
		
	}

}

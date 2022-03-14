package day12;

abstract class Animal
{
abstract void eat();
void run()
{
	System.out.println(" Runs Fast..........");
}
static void Sleep() 

{
	System.out.println(" sleeping");
}
 Animal()
{
	System.out.println(" this ic used by constructor");
}

}

class Horse extends  Animal
{
void eat()
{
	System.out.println("eating grass");
}
}

public class Abstract {

	public static void main(String[] args) {
	Horse hos=new Horse();
	hos.eat();
	hos.Sleep();
	
	

	}

}

package day1;

abstract class Animal
{
	abstract void eat();
	
	void run()
	{
		System.out.println("runs fast..........");
	}
	static void Sleep()
	{
		System.out.println("Sleeps for a long timee....");
	}
	Animal()
	{
		System.out.println("This is  a good animal");
	}
	
}

 class Horse extends Animal
{

	void eat() 
	{
		System.out.println("Eating grass");
	}

	
	
}



public class Abstractionmethod {

	public static void main(String[] args) {
		///Animal ani=new Horse();
		Horse hor=new Horse();
		hor.eat();
		hor.run();
		Animal.Sleep();

	}

}

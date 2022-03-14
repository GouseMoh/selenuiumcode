package Utilesfuntion;

abstract class Animal {
	
	abstract void eat();
	
	void run()
	{
		System.out.println("Runs fats");
	}
	
	static void Sleep()
	{
	System.out.println("Sleep...");	
	}
    
	Animal()
	{
		System.out.println("this is Constructor");
	}
}
	class Horse extends Animal
	{
		void eat()
		{
			System.out.println("eating grass");
		}
		
	}
	
   public class AbstractClassDemo
   {
	   public static void main(String[]args) 
	{
	Animal obj=new Horse();
	obj.eat();
	obj.run();
	Animal.Sleep();
	
	}
   }    
	
		
		
		
		
		
		
		
		
		
		
		
		

		
	



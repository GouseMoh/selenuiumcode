package test;


public class Animals {
	String Name;
	int  id;
	 double age;
	 //----------------------------------------------------->variables
	void display()
	{
		System.out.println(Name);
		System.out.println(id);
		System.out.println(age);
	}
	//-------------------------------------------------------->method
	public static void main (String arg[]) {
		Animals ani=new Animals();
		ani.Name="laprada";
		ani.id=10213;
		ani.age=2.6;
		ani.display();
		Animals ani1=new Animals();
		ani1.Name="Dabourman";
		ani1.id=10241;
		ani1.age=3.2;
		ani1.display();	
		}

}


	

	



package day1;

public class Methodoverloading {
int x,y,z;
double d;
void sum()
{
	x=10;
	y=50;
	System.out.println(x+y);
}
void sum(int a,int b)
{
	x=a;
	y=b;
			System.out.println(x+y);
}
void sum( int a,double b)
{
	x=a;
	d=b;
	System.out.println(x+d);
	
}
void sum( double a,int b )
{
	a=d;
	y=b;
	System.out.println(d+b);
}
 void sum( int a,int b,int c)
 {
	 a=x;
	 b=y;
	 c=z;
	 System.out.println(a+b+c);
	  }
 void main()
 {
	 String s=("gowse");
	 System.out.println("Method overloading:"+s);
 }
 
	public static void main(String[] args) {
Methodoverloading mld=new Methodoverloading();
mld.sum();
mld.sum(10,20);
mld.sum(10,10.5);
mld.sum(20.5,50);

mld.sum(10,20,30);
mld.main();


	}

}

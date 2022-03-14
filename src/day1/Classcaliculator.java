package day1;

public class Classcaliculator {
	int x=10,y=20;
	/*void add()
	{
		System.out.println(x+y); 
	}*/
	 /*int add()
	 {
	 return x+y;
		}
	 */
	/*void add(int a,int b)
	{
		x=a;
		y=b;
		System.out.println(a+b);
	}*/
	int add( int a,int b)
	{
		x=a;
		y=b;
		return(a+b);
	}
	public static void main(String[] args) {
Classcaliculator cal=new Classcaliculator();
//cal.add();
//int res=cal.add();
//S	qystem.out.println(res);
//cal.add(20, 30);
int res=cal.add(50,60);
System.out.println(res);
















































	}

}

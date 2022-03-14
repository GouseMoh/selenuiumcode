package gmg;

public class Student {
	int sid;
	String name;
	String sub;
	int smarks;
	 void display()
	 {
		 System.out.println(sid);
		 System.out.println(name);
		 System.out.println(sub);
		 System.out.println(smarks);
	 }

	public static void main(String[] args) {
		Student stu = new Student();
		stu.sid=101;
		stu.name="gullapalli mohammad gouse";
		stu.sub="maths";
		stu.smarks=100;
		stu.display();
		
			}
}

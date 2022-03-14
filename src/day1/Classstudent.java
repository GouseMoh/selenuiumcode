package day1;

public class Classstudent {
 int sid;
 String studentname;
 double percentage;
 void show()
 {
	 System.out.println(sid);
	 System.out.println(studentname); 
	 System.out.println(percentage);
   System.out.println(sid+"    "+studentname +"     "+percentage+"  ");
	 
 }

	public static void main(String[] args) {
		Classstudent stu1=new Classstudent();
	stu1.sid=102;
	stu1.studentname=("gowse");
	stu1.percentage=96.5;
	stu1.show();

	}

}

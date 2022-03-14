package Sunday;

public class Methodstudent {
	 int sid;
	  String sname;
	  char grade;
 void setdata(int id,String name,char g)
 {
	 sid=id;
	 sname=name;
	 grade=g;
	  
 }
 void show()
 {
	 System.out.println(sid+"  "+sname+"  "+grade);
 }

  public static void main(String[] args) {
Methodstudent stu=new Methodstudent();
stu.setdata(102,"gowse",'b');
stu.setdata(103,"mohammad",'a');
stu.show();

	}

}

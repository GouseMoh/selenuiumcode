package day1;

public class Class {

	int eid;
	String name;
	Double average;
	String group;
	
	void display()
	{
		System.out.println(eid);
		System.out.println(name);
		System.out.println(average);
		System.out.println(group);
	}
 public static void main(String[] args) {
Class cla=new Class();	
cla.eid=101;
cla.name=("gowse");
cla.average=  65.5 ;
cla.group=("mpcs");
cla.display();
 
 Class cla1=new Class();
 cla1.eid=102;
 cla1.name=("mohammad");
 cla1.average=40.5;
 cla.group=("computers");
 cla1.display();
 
 
 
	 
	 
	 
	 


	}

}

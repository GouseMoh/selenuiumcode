package day1;

public class Constructor {
	int sid;
	String sname;
	char grade;
	Constructor(int id ,String name,char g)
	{
		sid =id;
		sname =name;
		grade = g;
	}
	void show() {
		System.out.println(sid+"  "+sname+"  "+grade);
	}
	public static void main(String[] args) {
		Constructor con =new Constructor(101,"gowse",'a');
		con.show();
	}

				


	}



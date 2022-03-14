package gmg;

public class employee {
	int eid;
	String ename;
	char grade;
	employee(int id,String name,char g)
	{
		eid=id;
		ename=name;
		grade=g;
		
	}
	void setdata(int id,String name,char g)
	{
		eid=id;
		ename=name;
		grade=g;
	}
	void show()
	{
		System.out.println(eid+" "+ename+" "+grade);
	}

}

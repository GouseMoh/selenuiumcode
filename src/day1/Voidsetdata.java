package day1;

public class Voidsetdata {
	int sid;
	String sname;
	double spercentage;
	void setdata(int id,String name,double percentage)
	{
		sid=id;
		sname=name;
		spercentage=percentage;
	}
	void show()
	{
		System.out.println(sid+"  "+sname+"  "+spercentage);
		
	}

	public static void main(String[] args) {
		Voidsetdata  vsd=new Voidsetdata ();
		vsd.show();

	}

}

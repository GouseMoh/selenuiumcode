package gmg;

public class thisKeyword {
	int x,y;
	void setData(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void Display() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		thisKeyword th=new thisKeyword();
		th.setData(50,60);
		th.Display();
		}

}

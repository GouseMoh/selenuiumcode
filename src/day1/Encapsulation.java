package day1;

public class Encapsulation {
	private int Accno;
	private String name;
	private double amount;

	public int getAccno() {
		return Accno;
	}

	public void setAccno(int accno) {
		Accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
    // public class Encspsulation1{
	public static void main(String[] args) {
		Encapsulation ele=new Encapsulation();
		ele.setAccno(10111011);
		ele.setName("gowse");
		ele.setAmount(1425.5);
		System.out.println(ele.getAccno());
		System.out.println(ele.getAmount());
		System.out.println(ele.getName());
		
	
	//}

}
}
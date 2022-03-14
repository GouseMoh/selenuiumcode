package gmg;

public class Account {
private long Acc_no;
private String name ;
private double amount;
	
	
	public long getAcc_no() {
	return Acc_no;
}


public void setAcc_no(long acc_no) {
	Acc_no = acc_no;
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


	public static void main(String[] args) {
		Account accobj=new Account();
		accobj.setAcc_no(1011);
		accobj.setName("Gullapalli");
		accobj.setAmount(100452130);
		
		System.out.println(accobj.getAcc_no());
		System.out.println(accobj.getName());
		System.out.println(accobj.getAmount());
		
		
	}

}


public class Account {
	private String name;
	private double balance;
	
	public Account(String name, double balance) {
		this.name=name;
		if(balance>0.0)this.balance=balance;
	
	}
	public void deposit(double depositAmnt) {
		if(depositAmnt>0.0)balance+=depositAmnt;
	}
	public void setName(String name) {this.name=name;}
	public String getName() {return name;}
	public double getBalance() {return balance;}
	

}

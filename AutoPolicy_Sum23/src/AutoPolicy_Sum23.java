package autoPolicy_Sum23;
public class AutoPolicy_Sum23 {
	private int accountNumber;
	private String makeAndModel;
	private String state;
	
	public AutoPolicy(int accountNumber, String makeAndModel,String state) {
this.accountNumber=accountNumber;
this.makeAndModel=makeAndModel;
this.state=state;
}
	public void setaccountNumber(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	
public int getaccountNumber() {
	return accountNumber;
}
public void setMakeAndModel(String makeAndModel) {
	this makeAndModel=makeAndModel;
	
}
public String getMakeAndModel() {
	return makeAndModel;
}
public void setState(String state) {
	this.state=state;
}
public String getState() {
	return state;
}
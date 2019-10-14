
public class CreditCard implements StrategyPayment{
	
	private String firstName;
	private String lastName;
	private String cardNumber;
	private String cvv;
	private String expiryDate;
	
	public CreditCard(String n, String lnm, String ccn, String cvv, String dateOfEx) {
		this.firstName = n;
		this.lastName = lnm;
		this.cardNumber = ccn;
		this.cvv = cvv;
		this.expiryDate = dateOfEx;
	}
	
	public void pay(double amount) {
		System.out.println("$" + amount + " paid with card. Please sign the Merchant Receipt Copy." + '\n' + " Thank you for visiting the Lewis Cafe! ");
		
	}
}
//strategyPayment 
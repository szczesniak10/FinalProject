
public class Cash implements StrategyPayment {

	public void pay(double amount) {
		System.out.println("Cash payment in the amount of $" + amount + " has been made. Thank you for your payment." + '\n' + "Thank you for visiting the Lewis Cafe!");
	}
	
}

//StrategyPayment
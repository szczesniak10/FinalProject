
public class Waitress {
	private LewisMenu lewisMenu;
	private OrderBuild orderBuild;
	
	public Waitress(LewisMenu lewisMenu) {
		this.lewisMenu = lewisMenu;
		this.orderBuild = new OrderBuild();
	}
	
	public void printMenu() {
		Iterator lewisIterator = this.lewisMenu.createIterator();
		
		System.out.println("Lewis Cafe Menu : " + '\n');
		printMenu(lewisIterator); 
	}
	
	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem);
			System.out.println("\n");
		}
	 }
	
	public void placeOrder(int option) {
		try {
			this.orderBuild.foodSelect(option);
		} catch (java.io.IOException e) {
			System.out.print("Invalid option");
		}
	}
	
	public String printOrder() {
		return this.orderBuild.getOrder().getItems();
	}
	
	public String getTotal() {
		return "Your total is $" + this.orderBuild.getOrder().getCost();
	}
	
	public String taxTotal() {
		return "Your total with tax is $" + (this.orderBuild.getOrder().getCost()) * 1.08;
	}
/// payment method
	public double payTotal() {
		return this.orderBuild.getOrder().getCost() * 1.08;
	}
	
	public void pay(StrategyPayment paymentMethod) {
		double amount = payTotal();
		paymentMethod.pay(amount);
	}
	//paymentmethod
}


//Iterator Pattern
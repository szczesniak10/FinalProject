
public class PlaceOrderCommand implements Command {

	private CommandOrder order;
	
	public PlaceOrderCommand(CommandOrder order) {
		this.order = order;
	}
	
	@Override
	public void execute() {
		this.order.setOrderPlaced(true);
		System.out.println("Your Order Has Been Placed: " +  this.order);
	}
	
}
//command
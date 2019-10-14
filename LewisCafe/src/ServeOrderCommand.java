
public class ServeOrderCommand implements Command {
private CommandOrder order;
	
	public ServeOrderCommand(CommandOrder order) {
		this.order = order;
	}
	
	@Override
	public void execute() {
		this.order.setOrderServed(true);
		System.out.println(" Your Order Has Been Served  :" + '\n' + this.order + '\n' + "Enjoy your meal!" + '\n');
	}

}

//command

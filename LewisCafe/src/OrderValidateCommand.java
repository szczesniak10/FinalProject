
public class OrderValidateCommand implements Command {
private CommandOrder order;
	
	public OrderValidateCommand(CommandOrder order) {
		this.order = order;
	}
	
	@Override
	public void execute() {
		this.order.setOrderValidated(true);
		
	}
	
}
//command

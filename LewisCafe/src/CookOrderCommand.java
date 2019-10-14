
public class CookOrderCommand implements Command {

	private CommandOrder order;
	
	public CookOrderCommand(CommandOrder order) {
		this.order = order;
	}
	
	@Override
	public void execute() {
		this.order.setOrderPrepared(true);
		
	}

}
//command
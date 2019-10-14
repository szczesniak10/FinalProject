
public class CommandOrder {
	
	private String foodItem;
	
	private boolean orderPlaced;
	private boolean orderValidated;
	private boolean orderPrepared;
	private boolean orderServed;
	
	public CommandOrder(String foodItem) {
		this.foodItem = foodItem;
	}

	public String getFoodItem() {
		return foodItem;
	}


	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}

	public boolean isOrderPlaced() {
		return orderPlaced;
	}

	
	public void setOrderPlaced(boolean orderPlaced) {
		this.orderPlaced = orderPlaced;
	}

	
	public boolean isOrderValidated() {
		return orderValidated;
	}


	public void setOrderValidated(boolean orderValidated) {
		this.orderValidated = orderValidated;
	}


	public boolean isOrderPrepared() {
		return orderPrepared;
	}


	public void setOrderPrepared(boolean orderPrepared) {
		this.orderPrepared = orderPrepared;
	}


	public boolean isOrderServed() {
		return orderServed;
	}

	
	public void setOrderServed(boolean orderServed) {
		this.orderServed = orderServed;
	}

	@Override
	public String toString() {
		StringBuffer sbuffer = new StringBuffer();
		
		sbuffer.append("Order [ " + "\n")
		  .append(foodItem).append(", ").append("\r\n")
		  .append("Order Placed : ").append(orderPlaced).append("\r\n")
		  .append("Order Validated : ").append(orderValidated).append("\r\n")
		  .append("Order Prepared : ").append(orderPrepared).append("\r\n")
		  .append("Order Served : ").append(orderServed).append("\r\n")
		  .append("] \r\n");
		
		return sbuffer.toString();
	}
	
	
}
//Command
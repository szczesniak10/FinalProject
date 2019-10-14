
public class MenuItem {
	private String name;
	private String description;
	private String type;
	private double price;
	
	public MenuItem(String name, String description, String type, double price) { 
		this.name = name;
		this.description = description;
		this.type = type;
		this.price = price;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String getType() {
		return this.type;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String toString() {
		return this.getName() + ", " + "$" + this.getPrice() + "\n" + this.getDescription();
	}
}

//Iterator Pattern

class LewisMenu implements Menu {
	private final int MAX_ITEMS = 18;
	private int numberOfItems = 0;
	private MenuItem[] menuItems;
	
	public LewisMenu() {
		this.menuItems = new MenuItem[MAX_ITEMS];
	
		addItem("1. Chicken & Gouda", "with baby arugula, caramelized onion, pickle, horseradish mayo","sandwich", 7.45);
		addItem("2. Oragnic Turkey & Gruyere", "with pears, leafy greens, cranberry chutney", "sandwich", 8.25);
		addItem("3. Club Med", "ABF chicken, european feta cheese, red pepper hummus, cucumber, vine tomato, avocado, red onion, baby arugula" , "sandwich", 7.85);
		addItem("4. BLT", "Blackforest ham, leafy greens, vine Tomato","sandwich", 6.95);
		addItem("5. El Rancho","organic free range beef, european feta cheese, vine tomato, leafy greens, caramelized onion, horseradish mayo" ,"sandwich", 8.25);	
		addItem("6. Chewheato", "blackforest ham, Gruyere cheese, spicy chipotle sauce, avocado,cucumber, red onion", "sandwich", 8.15);
		addItem("7. Cobb", "ABF chicken, gouda cheese, bacon, avocado, leafy greens, egg, cranberry chutney", "sandwich", 8.25);	
		addItem("8. Parma Ham & Brie ", "with pear, baby arugula, fig spread", "sandwich", 8.75);	
		addItem("9. Wild Caught Alaskan Smoked Salmon" , "with european feta cheese, cucumber, red onion, fresh dill", "sandwich", 8.95);	
		addItem("10. Cabbage, Potato and White Bean","Freshly made","soup", 3.95);
		addItem("11. Harvest", "leafy greens, crumbled european feta cheese, pears, dried figs, pepitas with maple walnut vinaigrette","salad", 6.95);		
		addItem("12. Spinach & Feta","roasted red peppers, chickpeas, cucumbers, pepitas with lemon pepper basil vinaigrette","salad", 7.25);
		addItem("13. Chicken With Garlic Cream Sauce","Chicken breast, green and red peppers, mushrooms, artichoke hearts and creamy garlic sauce tossed with fettuccine","pasta", 15.99);	
		addItem("14. Blackened Chicken Alfredo","FBlackened chicken breast served with creamy alfredo sauce, broccoli and tossed with fettuccine pasta","pasta", 17.99);	
		addItem("15. Shrimp Diablo","6 jumbo shrimp, tomato, garlic, spicy white wine sauce, tossed with penne pasta" , "pasta", 19.99);		
		addItem("16. Pepsi","Bottled" , "drink", 1.99);
		addItem("17. Orange Juiec","Bottled" , "drink", 1.99);
		addItem("18. Beer","Tap Beer" , "drink", 5.00);
	}
	
	public int getMaxItmes() {
		return this.MAX_ITEMS;
	}
		
	public void addItem(String name, String description, String type, double price) {
			MenuItem menuItem = new MenuItem(name, description, type, price);
			
			if (MAX_ITEMS <= numberOfItems) {
				System.out.println("Sorry the menu is full");
			} else {
				this.menuItems[numberOfItems] = menuItem;
				this.numberOfItems += 1;
			}
			
	}
	
	public MenuItem[] getMenuItems() {
		return this.menuItems;
	}
	
	public Iterator createIterator() {
		return new LewisMenuIterator(this.menuItems);
	}
	
	public int getMenuCount() {
		return this.menuItems.length;
	}
}
	
//Iterator Pattern
		


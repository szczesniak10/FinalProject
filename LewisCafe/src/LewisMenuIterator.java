
public class LewisMenuIterator implements Iterator {
	private MenuItem[] items;
	private int position = 0;
	
	public LewisMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	public Object next() {
		MenuItem menuItem = this.items[this.position];
		this.position = this.position + 1;
		return menuItem;
	}
	
	public boolean hasNext() {
		if(this.position >= this.items.length || this.items[this.position] == null) {
			return false;
		} else {
			return true;
		}
	}
}


//Iterator Pattern
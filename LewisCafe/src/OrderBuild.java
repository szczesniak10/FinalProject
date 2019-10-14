
import java.io.IOException;  

public class OrderBuild {
	private OrderedItems orderedItems;
	
	public OrderBuild() {
		this.orderedItems = new OrderedItems();
	}
	
    public void foodSelect(int option) throws IOException {
    	List select = null;
    	
    	switch (option) {
    		case 1:
    			select = new List1();
    			break;
    		case 2:
    			select = new List2();
    			break;
    		case 3:
    			select = new List3();
    			break;
    		case 4:
    			select = new List4();
    			break;
    		case 5:
    			select = new List5();
    			break;
    		case 6:
    			select = new List6();
    			break;
    		case 7:
    			select = new List7();
    			break;
    		case 8:
    			select = new List8();
    			break;
    		case 9:
    			select = new List9();
    			break;
    		case 10:
    			select = new List10();
    			break;
    		case 11:
    			select = new List11();
    			break;
    		case 12:
    			select = new List12();
    			break;
    		case 13:
    			select = new List13();
    			break;
    		case 14:
    			select = new List14();
    			break;
    		case 15:
    			select = new List15();
    			break;
    		case 16:
    			select = new List16();
    			break;
    		case 17:
    			select = new List17();
    			break;
    		case 18:
    			select = new List18();
    			break;
    		
    		default:
    			break;
    	}
    	
    	if (select != null) {
    		this.orderedItems.addItems(select);
    	}
    }
    
    public OrderedItems getOrder() {
    	return this.orderedItems;
    }
    
}

//builder

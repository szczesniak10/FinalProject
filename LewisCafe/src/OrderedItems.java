import java.util.ArrayList;
import java.util.List;

public class OrderedItems {
	     
	    List<Items> items=new ArrayList<Items>();  
	      
	    public void addItems(Items item){ 
	        this.items.add(item);  
	    }
	    
	    public double getCost(){  	          
	        double cost=0.0f;  
	            for (Items item : this.items) {  
	                cost+=item.price();  
	             }  
	        return cost;  
	    }
	    
	    public String getItems(){
	    	String items = "";
	        for (Items item : this.items) {  
	            	items += item.name() + ", " + item.price() + "\n";  
	        }  
	        
	        return items;
	    }  
}


//builder
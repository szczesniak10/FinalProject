import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.RoundingMode;

public class Test {
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		LewisMenu lewisMenu = new LewisMenu();
		Waitress waitress = new Waitress(lewisMenu);
		//OrderBuild builder = new OrderBuild();
		boolean orderAgain = true;
		char next;
		int option;
		waitress.printMenu();
		
		
		
		
		
		System.out.println(("________________________________________") + '\n'+'\n');
		System.out.print("Thank you for coming to the Lewis Cafe." + '\n' + "What would you like to order from the Menu above? ");
		
		do {
			System.out.print("Pick Item to Order: ");
			option = sc.nextInt();
			if (option >= 1 && option <= lewisMenu.getMenuCount()) {
				waitress.placeOrder(option);
				
				System.out.print("Anything else?  Y = yes / N = no    ");
				
				next = sc.next().charAt(0);
				if (next == 'n'|| next == 'N') {
					orderAgain = false ;
				}
			} else {
				 System.out.println ("Invalid Selection");
			}
		} while (orderAgain == true);
		
		
		System.out.println(" You have ordered: " + "\n");
		System.out.print(waitress.printOrder());
		System.out.print(waitress.getTotal() + "\n") ;  
		
		
		//command pattern		
		
		CommandOrder theOrder = new CommandOrder("" + '\n' + waitress.printOrder());
		
		//Place Order
		PlaceOrderCommand cmdPlaceOrder = new PlaceOrderCommand(theOrder);
		
		CommandWaitress cwaitress = new CommandWaitress();
		cwaitress.setCommand(cmdPlaceOrder);
		cwaitress.takeOrder();
		
		
		//Validate Order
		OrderValidateCommand cmdValidateOrder = new OrderValidateCommand(theOrder);
		
		Manager manager = new Manager();
		manager.setCommand(cmdValidateOrder);
		manager.validateOrder();
		
		CookOrderCommand cmdCookOrder = new CookOrderCommand(theOrder);
		
		Cook cook = new Cook();
		cook.setCommand(cmdCookOrder);
		cook.prepareOrder();
		

		ServeOrderCommand cmdServeOrder = new ServeOrderCommand(theOrder);
		
		cwaitress.setCommand(cmdServeOrder);
		cwaitress.serveOrder();

		 // strategy
	
		
		
		String paymentMethod = "";
		StrategyPayment method = null;
		
		do {
		System.out.print( waitress.taxTotal() + ". How would you like to pay? (Cash or Credit)" );
		paymentMethod = sc.next();
		} while (paymentMethod.compareToIgnoreCase("cash") != 0 && paymentMethod.compareToIgnoreCase("credit") != 0); 
			
		
		
		if (paymentMethod.compareToIgnoreCase("cash") == 0) {
			paymentMethod.toLowerCase();
			method = new Cash();
			
			
		} else if(paymentMethod.compareToIgnoreCase("credit") == 0) {
			String name,lastnm , cvv, number, date;
			
			System.out.print("Provide first name :");
			name = sc.next();
			System.out.print("Provide last name :");
			lastnm = sc.next();
			System.out.print("Provide cvv (3 digits) :");
			cvv = sc.next();
			System.out.print("Provide card number :");
			number = sc.next();
			System.out.print("Provide expiry date (mm/yy) :");
			date = sc.next();
			
			method = new CreditCard( name, lastnm, cvv, number, date );
		}
		
		if (method != null) {
			waitress.pay(method);
		}
	}
	
		
}
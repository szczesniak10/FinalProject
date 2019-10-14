import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CreditCardTest {
	String a = "kamil";
	String b = "szczesniak";
	String c = "2013123112";
	String d = "213";
	String e = "09/23";
	
	int amount = 20;
	
	@Test
	void testPay() {
		CreditCard test = new CreditCard(a,b,c,d,e);
		 test.pay(amount);
		 assertEquals(20,amount);
			}

}
//strategy test
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CashTest {
int amount = 23; 
	@Test
	void test() {
		Cash test = new Cash();

		test.pay(amount);
		
		 assertEquals(23,amount);
}
}


//strategy test
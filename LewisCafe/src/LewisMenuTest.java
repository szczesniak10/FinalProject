import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class LewisMenuTest {
	String name = "pizza";
	String description = "cheese";
	String type ="thin";
	double price = 1;


	@Test
	void testLewisMenu() {
		LewisMenu menu = new LewisMenu();
	}

	@Test
	void testGetMaxItmes() {
		LewisMenu menu = new LewisMenu();
		int actual = menu.getMaxItmes();
		
		int expected = 18;
		assertEquals(18,actual);
		 
	}

	@Test
	void testCreateIterator() {
		LewisMenu menu = new LewisMenu();
		Iterator actual = menu.createIterator();
		Iterator expected = menu.createIterator();
		assertEqual( expected,actual);
	}

	private void assertEqual(Iterator expected, Iterator actual) {
		// TODO Auto-generated method stub
		
	}

	@Test
	void testGetMenuCount() {
		LewisMenu menu = new LewisMenu();
		int actual = menu.getMenuCount();
		int expected = 18;
		
		assertEquals(18,actual);
	}

}

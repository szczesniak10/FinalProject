import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class MenuItemTest {
	
	String a = "pizza";
	String b = "cheese"; 
	String c = "thin";
	int d = 1;
	MenuItem menu = new MenuItem(a,b,c, 1);
	
			
	
	@Test
	void testMenuItem() {
	
		MenuItem menu = new MenuItem(a,b,c,d);
		String expected = menu(a, b, c, d);
		assertEquals(expected, menu("pizza", "cheese", "thing", 1));
	}

	private String menu(String string, String string2, String string3, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	void testGetName() {
		
		String expected = "pizza";
		String actual = menu.getName();
		assertTrue(expected.equals(actual));
		
		
	}

	@Test
	void testGetDescription() {
		
		String expected = "cheese";
		String actual = menu.getDescription();
		assertTrue(true,"cheese");
		assertEquals(expected,actual);
	}

	@Test
	void testGetType() {
		
			String expected = "thin";
			String actual = menu.getType();
			assertEquals(actual,"thin");
			assertFalse(false,"thick");
			assertTrue(true,"thin");
	}

	@Test
	void testGetPrice() {
		
			double expected = 1;
			double actual = menu.getPrice();
			assertEquals(actual,1);
			
	}

	@Test
	void testToString() {
			String expected = menu(a,b,c,d);
			assertEquals(a+b+d,"pizza"+ "cheese" + 1);
	}

}

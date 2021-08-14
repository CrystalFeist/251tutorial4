package tutorial4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCalc {
	@Test 
	public void testAdd() {
		assertEquals(Calc.add(5, 6), 11);
	}

	@Test
	public void testSubtract() {
		assertEquals(Calc.subtract(6, 5), 1);
	}
}

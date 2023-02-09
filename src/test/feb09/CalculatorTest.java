package feb09;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	static Calculator c;

	@BeforeAll
	static void setUp() {
		c = new Calculator();
	}

	@Test
	@DisplayName("Somma di numeri")
	public void testAdd() {
		float result = c.add(1, 2);
		assertEquals(3, result, "La somma deve essere 3");
	}

	@Test
	@DisplayName("Sottrazione tra numeri")
	public void testSubtract() {
		float result = c.subtract(2, 1);
		assertEquals(1, result, "La differenza deve essere 1");
	}

	@Test
	@DisplayName("Moltiplicazione tra numeri")
	public void testMultiply() {
		float result = c.multiply(2, 3);
		assertEquals(6, result, "Il prodotto deve essere 6");
	}

	@Test
	@DisplayName("Divisione tra numeri")
	public void testDivide() {
		float result = c.divide(6, 3);
		assertEquals(2, result, "Il quoziente deve essere 2");
	}
}
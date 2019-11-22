package JunitT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTester {

	@Test
	void test() {
		Math test = new Math();
		
	int output = test.square(5);
	assertEquals(25, output);
	}
}

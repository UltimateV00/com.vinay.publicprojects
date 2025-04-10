package com.vinay.programs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testTwoPlusTwoEqualsFour() {
		int sum = Calculator.add(2, 2);
		assertEquals(4, sum);
	}
	
	@Test
	void testSevenPlusThreeEqualsTen() {
		int sum = Calculator.add(7, 3);
		assertEquals(10, sum);
	}
	
}

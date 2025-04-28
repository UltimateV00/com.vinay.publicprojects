package com.vinay.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.vinay.calculator.Calculator;

class CalculatorTest {

	//Addition

	@Test
	void testAddition_CommutativeProperty_PositiveNumbers() {
		assertEquals(8, Calculator.add(5, 3));
		assertEquals(8, Calculator.add(3, 5));
	}	

	@Test
	void testAddition_CommutativeProperty_NegativeNumbers() {
		assertEquals(-8, Calculator.add(-5, -3));
		assertEquals(-8, Calculator.add(-3, -5));
	}

	@Test
	void testAddition_CommutativeProperty_PositiveAndNegativeNumbers() {
		assertEquals(2, Calculator.add(5, -3));
		assertEquals(2, Calculator.add(-3, 5));
		assertEquals(-4, Calculator.add(-7, 3));
		assertEquals(-4, Calculator.add(3, -7));
	}

	@Test
	void testAddition_IdentityProperty_PositiveNumbers() {
		assertEquals(5, Calculator.add(5, 0));
		assertEquals(5, Calculator.add(0, 5));
	}

	@Test
	void testAddition_IdentityProperty_NegativeNumbers() {
		assertEquals(-5, Calculator.add(-5, 0));
		assertEquals(-5, Calculator.add(0, -5));
	}

	@Test
	void testAddition_AdditiveInverseProperty() {
		assertEquals(0, Calculator.add(5, -5));
		assertEquals(0, Calculator.add(-5, 5));
		assertEquals(0, Calculator.add(7, -7));
		assertEquals(0, Calculator.add(-7, 7));
	}


	//Subtraction

	@Test
	void testSubtraction_NonCommutativeProperty_PositiveNumbers() {
		assertEquals(2, Calculator.subtract(5, 3));
		assertNotEquals(2, Calculator.subtract(3, 5));
	}

	@Test
	void testSubtraction_NonCommutativeProperty_NegativeNumbers() {
		assertEquals(2, Calculator.subtract(-3, -5));
		assertNotEquals(2, Calculator.subtract(-5, -3));
	}

	@Test
	void testSubtraction_NonCommutativeProperty_PositiveAndNegativeNumbers() {
		assertEquals(8, Calculator.subtract(5, -3));
		assertNotEquals(8, Calculator.subtract(-3, 5));
		assertEquals(-8, Calculator.subtract(-5, 3));
		assertNotEquals(-8, Calculator.subtract(3, -3));
		assertEquals(10, Calculator.subtract(5, -5));
		assertNotEquals(10, Calculator.subtract(-5, 5));
	}

	@Test
	void testSubtraction_PositiveNumbers_EqualNumbers() {
		assertEquals(0, Calculator.subtract(5, 5));
	}

	@Test
	void testSubtraction_NegativeNumbers_EqualNumbers() {
		assertEquals(0, Calculator.subtract(-5, -5));
	}

	@Test
	void testSubtraction_IdentityProperty_RightIdentity() {
		assertEquals(5, Calculator.subtract(5, 0));
		assertEquals(-5, Calculator.subtract(-5, 0));
	}

	@Test
	void testSubtraction_IdentityProperty_NoLeftIdentity() {
		assertEquals(-5, Calculator.subtract(0, 5));
		assertEquals(5, Calculator.subtract(0, -5));
	}


	//Multiplication

	@Test
	void testMultiplication_CommutativeProperty_PositiveNumbers() {
		assertEquals(15, Calculator.multiply(5, 3));
		assertEquals(15, Calculator.multiply(3, 5));
	}

	@Test
	void testMultiplication_CommutativeProperty_NegativeNumbers() {
		assertEquals(15, Calculator.multiply(-5, -3));
		assertEquals(15, Calculator.multiply(-3, -5));
	}

	@Test
	void testMultiplication_CommutativeProperty_PositiveAndNegativeNumbers() {
		assertEquals(-15, Calculator.multiply(5, -3));
		assertEquals(-15, Calculator.multiply(-3, 5));
		assertEquals(-21, Calculator.multiply(-7, 3));
		assertEquals(-21, Calculator.multiply(3, -7));
	}

	@Test
	void testMultiplication_IdentityProperty_PositiveNumbers() {
		assertEquals(5, Calculator.multiply(5, 1));
		assertEquals(5, Calculator.multiply(1, 5));
	}

	@Test
	void testMultiplication_IdentityProperty_NegativeNumbers() {
		assertEquals(-5, Calculator.multiply(-5, 1));
		assertEquals(-5, Calculator.multiply(1, -5));
	}

	@Test
	void testMultiplication_ZeroProperty_PositiveNumbers() {
		assertEquals(0, Calculator.multiply(5, 0));
		assertEquals(0, Calculator.multiply(0, 5));
	}

	@Test
	void testMultiplication_ZeroProperty_NegativeNumbers() {
		assertEquals(0, Calculator.multiply(-5, 0));
		assertEquals(0, Calculator.multiply(0, -5));
	}


	//Division

	@Test
	void testDivision_NonCommutativeProperty_PositiveNumbers() {
		assertEquals(5, Calculator.divide(10, 2));
		assertNotEquals(5, Calculator.divide(2, 10));
	}

	@Test
	void testDivision_NonCommutativeProperty_NegativeNumbers() {
		assertEquals(5, Calculator.divide(-10, -2));
		assertNotEquals(5, Calculator.divide(-2, -10));
	}

	@Test
	void testDivision_NonCommutativeProperty_PositiveAndNegativeNumbers() {
		assertEquals(-5, Calculator.divide(10, -2));
		assertNotEquals(-5, Calculator.divide(-2, 10));
		assertEquals(-5, Calculator.divide(-10, 2));
		assertNotEquals(-5, Calculator.divide(2, -10));
	}

	@Test
	void testDivision_DivisionByItself() {
		assertEquals(1, Calculator.divide(5, 5));
		assertEquals(1, Calculator.divide(-5, -5));
	}

	@Test
	void testDivision_IdentityProperty_RightIdentity() {
		assertEquals(5, Calculator.divide(5, 1));
		assertEquals(-5, Calculator.divide(-5, 1));
	}

	@Test
	void testDivision_IdentityProperty_NoLeftIdentity() {
		assertNotEquals(5, Calculator.divide(1, 5));
		assertNotEquals(-5, Calculator.divide(1, -5));
	}

	@Test
	void testDivision_ZeroProperty() {
		assertEquals(0, Calculator.divide(0, 5));
		assertEquals(0, Calculator.divide(0, -5));
	}

	@ParameterizedTest
	@ValueSource(ints = { 1, 3, 5, 7, 9 })
	void testDivision_DivisionByZero_ShouldThrowArithmeticException(int num1) {
		assertThrows(ArithmeticException.class, () -> Calculator.divide(num1, 0));
	}

}

package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ucad.Calcul;

public class CalculTest {
	Calcul calc = new Calcul();

	@Test
	public void testAddition() {
		assertEquals("bon", calc.addition(23, 43));
	}

	@Test
	public void testMultiplication() {
		
		fail("Not yet implemented");
	}
	@Test
	public void testDouble()
	{
		
	}
	


}

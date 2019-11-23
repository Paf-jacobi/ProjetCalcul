package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ucad.Calcul;

public class CalculTest {
	Calcul calc = new Calcul();

	@Test
	public void testAddition() {
		assertTrue("a et b positif", calc.addition(23, 35) == 23+35);
	}

	@Test
	public void testMultiplication() {
		assertTrue("normal", calc.multiplication(1200, 4500)== 1200*4500);
		
	}
	@Test
	public void testLettreAdd()
	{
		assertEquals("", calc.addition('a', 'x'));
	}
	
	@Test
	public void testLettreDoubleAdd()
	{
		assertEquals("", calc.addition(234, 'x'));
	}
	
	@Test
	public void testLettreMult()
	{
		assertEquals("echec", calc.multiplication('f', 's'));
	}
	@Test
	public void testLettreDoubleMult()
	{
		assertEquals("", calc.multiplication(234, 'x'));
	}


}

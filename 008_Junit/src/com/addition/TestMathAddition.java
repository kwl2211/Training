package com.addition;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMathAddition {


	@Test
	public void testaddNumber()
	{ MathAddition m=new MathAddition();
		int num=10;int b=5;
		int actualResult=m.addNumber(num, b);
		assertEquals(15, actualResult);
	}
	

}

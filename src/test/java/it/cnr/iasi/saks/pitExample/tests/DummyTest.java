package it.cnr.iasi.saks.pitExample.tests;

import org.junit.Assert;
import org.junit.Test;

import org.apache.commons.lang3.math.Fraction;

public class DummyTest {

	
	@Test
	public void testConformance() throws Exception {
		char data[] = {'a', 'b', 'c'};
		String str = new String(data);		
		String c = str.substring(2,3);
		
		Fraction f = Fraction.getFraction(2,3);
		Fraction f1 = f.invert();
	
		Assert.assertEquals(f, f1.invert());
	}

	
}

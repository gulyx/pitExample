package it.cnr.iasi.saks.pitExample;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        App a = new App();
        
        a.foo("even");
        a.foo("odd");
        
        assertTrue( true );
    }
}

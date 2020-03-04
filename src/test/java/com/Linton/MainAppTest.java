package com.Linton;
import static org.junit.Assert.assertTrue;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MainAppTest  extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MainAppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( MainAppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

}

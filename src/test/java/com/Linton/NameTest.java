package com.Linton;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class NameTest
{
    Name name;

    @Before
    public void setUp()
    {
        name = new Name("Linton", "Appollis");
    }

    @Test
    public void tesToString() throws Exception {
        assertEquals("Linton Appollis", name.toString());
    }
}

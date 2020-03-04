package com.Linton;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonCompositionTest
{

    Name name;
    DateOfBirth dob;
    PersonComposition dimitri;

    @Before
    public void setUp()
    {
        name = new Name("Dimitri", "Johannes");
        dob = new DateOfBirth(11, 9, 1985);
        dimitri = new PersonComposition(name, dob);
    }

    @Test
    public void testToString()
    {
        assertEquals("Name, Dimitri Johannes, my birthday is 11/9/1999", dimitri.toString());
    }

}

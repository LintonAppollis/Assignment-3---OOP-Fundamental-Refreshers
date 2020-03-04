package com.Linton;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest
{
    Person linton;

        @Before
        public void setUp()
        {
            linton  = new Person("Linton", "Hathey", 17, 8, 1985);
        }

        @Test
        public void testGetName() throws Exception {

            assertEquals("Linton", linton.getName());
        }

        @Test
        public void testGetSurname() throws Exception {
            assertEquals("Appollis", linton.getSurname());
        }

        @Test
        public void testGetDay() throws Exception {
            assertEquals(17, linton.getDay());
        }

        @Test
        public void testGetMonth() throws Exception {
            assertEquals(8, linton.getMonth());
        }

        @Test
        public void testGetYear() throws Exception {
            assertEquals( 1985, linton.getYear());
        }

        @Test
        public void testToString() throws Exception {
            assertEquals("Name - Linton Appollis and my birthday is 17/8/1985", linton.toString());
        }


}

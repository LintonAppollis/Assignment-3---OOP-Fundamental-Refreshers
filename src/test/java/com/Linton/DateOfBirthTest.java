package com.Linton;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DateOfBirthTest
{
    DateOfBirth dob;

        @Before
        public void setUp()
        {
            dob = new DateOfBirth(17,8,1984);
        }

        @Test
        public void tesToString() throws Exception {

            assertEquals("17/8/1984", dob.toString());
        }


}

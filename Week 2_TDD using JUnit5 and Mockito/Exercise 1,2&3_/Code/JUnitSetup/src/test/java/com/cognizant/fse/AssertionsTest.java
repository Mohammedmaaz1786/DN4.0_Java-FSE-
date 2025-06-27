package com.cognizant.fse;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert equality
        assertEquals(5, 2 + 3);

        // Assert boolean true
        assertTrue(5 > 3);

        // Assert boolean false
        assertFalse(5 < 3);

        // Assert null
        Object obj = null;
        assertNull(obj);

        // Assert not null
        Object newObj = new Object();
        assertNotNull(newObj);
    }
}

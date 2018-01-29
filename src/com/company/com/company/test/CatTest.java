package com.company.com.company.test;


import com.company.Cat;
import org.junit.*;

public class CatTest extends junit.framework.TestCase {
    @Test
    public void testSomething() {
        Cat c1 = new Cat( 6, "John");
        Cat c2 = new Cat(0,"Adam");
        assertTrue("An empty bowl should report empty. ",
                c1.getMousesKilled() >= 0 );
        assertFalse("An empty bowl should report empty. ",
                c2.getMousesKilled() == 0 );
    }
}

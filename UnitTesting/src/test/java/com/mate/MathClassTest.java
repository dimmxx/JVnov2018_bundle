package com.mate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MathClassTest {

    private MathClass mathClass;

    @Before
    public void setUp() throws Exception {
        mathClass = new MathClass();
    }

    @After
    public void tearDown() throws Exception {
        mathClass = null;
    }

    @Test
    public void getCalls() {
        assertEquals(0, mathClass.getCalls());
        mathClass.factorial(5);
        assertEquals(1, mathClass.getCalls());
        mathClass.sum(3, 2);
        assertEquals(2, mathClass.getCalls());
    }

    @Test
    public void sum() {
        assertEquals(100, mathClass.sum(30, 70));
    }

    @Test
    public void factorial() {
        assertTrue(mathClass.factorial(5) == 120);
        assertTrue(mathClass.factorial(0) == 1);
        assertTrue(mathClass.factorial(1) == 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void factorialNegative(){
        mathClass.factorial(-1);
    }
}
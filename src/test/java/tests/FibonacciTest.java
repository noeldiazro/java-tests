package tests;

import junit.framework.TestCase;

public class FibonacciTest extends TestCase {
    public void testFibonacci() {
	assertEquals(0, fib(0));
	assertEquals(1, fib(1));
	assertEquals(1, fib(2));
	assertEquals(2, fib(3));
	assertEquals(3, fib(4));
	assertEquals(5, fib(5));
	assertEquals(8, fib(6));
	assertEquals(13, fib(7));
    }

    int fib(int index) {
	if (index <= 1) {
	    return index;
	}
	return fib(index-1) + fib(index-2);
    }
}

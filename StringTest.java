package tests;

import junit.framework.TestCase;

public class StringTest extends TestCase {
    public void testSimpleConcatenation() {
	assertEquals("abcde", "abc".concat("de"));
	assertEquals("abcde", "abc" + "de");
    }

    public void testMultipleConcatenation() {
	assertEquals("123456", "12" + "3" + "456");
    }
}

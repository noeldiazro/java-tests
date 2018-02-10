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

    public void testStringComparison() {
	String firstString = "123";
	String secondString = "123";
	assertTrue(firstString == secondString);
    }

    public void testUppercaseCount() {
	String board = "ABC...abc";
	int total = 0;
	for (char cell: board.toCharArray()) {
	    if (Character.isUpperCase(cell)) {
		total++;
	    }
	}
	assertEquals(3, total);
    }
	
}

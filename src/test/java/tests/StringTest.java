package tests;

import java.util.Arrays;
import java.util.List;
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

    public void testIterate() {
	String text = "ABCDE";
	int i = 0;
	while (i < text.length()) {
	    text.charAt(i);
	    i++;
	}
    }

    public void testSplitEmptyString() {
	String sentence = "";
	List<String> words = Arrays.asList(sentence.split(" "));
	assertEquals(1, words.size());
	assertEquals("", words.get(0));
    }

    public void testCompareEmptyString() {
	assertEquals(new String(""), new String(""));
    }
}

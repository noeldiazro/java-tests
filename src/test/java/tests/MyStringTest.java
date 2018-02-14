package tests;

import junit.framework.TestCase;

public class MyStringTest extends TestCase {
    private MyString text;
    
    public void testCharCountOnEmptyString() {
	text = new MyString("");
	assertEquals(0, text.countChar('a'));
    }

    public void testWhenOneCharStringEqualsSearchForChar() {
	text = new MyString("A");
	assertEquals(1, text.countChar('A'));
    }

    public void testWhenOneCharStringNotEqualSearchForChar() {
	text = new MyString("A");
	assertEquals(0, text.countChar('B'));
    }

    public void testSecondCharEqualsSearchForChar() {
	text = new MyString("AB");
	assertEquals(1, text.countChar('B'));
    }

    public void testCharAppearsMoreThanOnce() {
	text = new MyString("ABCABC");
	assertEquals(2, text.countChar('B'));
    }
}

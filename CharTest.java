package tests;

import junit.framework.TestCase;

public class CharTest extends TestCase {
    private char capitalA;
    
    public void setUp() {
	capitalA = 'A';
    }
    
    public void testNumericValue() {
	assertEquals(65, capitalA);
    }

    public void testUnicodeEscapeSequence() {
	assertEquals('\u0041', capitalA);
    }

    public void testOctalEscapeSequence() {
	assertEquals('\101', capitalA);
    }

    public void testSpecialCharacters() {
	char carriageReturn = '\r';
	char lineFeed = '\n';
	char tab = '\t';
	char formFeed = '\f';
	char backspace = '\b';
	
	char singleQuote = '\'';
	char backslash = '\\';
	assertEquals('"', '\"');
    }
}

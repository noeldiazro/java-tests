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

    public void testEmptyCharIsPalindrome() {
	text = new MyString("");
	assertTrue(text.isPalindrome());
    }

    public void testOneCharacterIsPalindrome() {
	text = new MyString("A");
	assertTrue(text.isPalindrome());
    }

    public void testTwoDifferentCharactersAreNotPalindrome() {
	text = new MyString("AB");
	assertFalse(text.isPalindrome());
    }

    public void testTwoEqualCharactersArePalindrome() {
	text = new MyString("AA");
	assertTrue(text.isPalindrome());
    }

    public void testFourCharactersEqualExtremesButDifferentMiddleCharsAreNotPalindrome() {
	text = new MyString("ABCA");
	assertFalse(text.isPalindrome());
    }

    public void testCompare() {
	assertEquals(0, new MyString("").compareTo(new MyString("")));
    }

    public void testEndTrimEmptyString() {
	assertTrimming(new MyString(""), new MyString(""));
    }

    public void testEndTrimStringNotWhitespaceEnding() {
	assertTrimming(new MyString("A"), new MyString("A"));
    }

    public void testEndTrimStringWithAWhitespaceEnding() {
	assertTrimming(new MyString("A "), new MyString("A"));
    }

    public void testArbitraryTrimming() {
	assertTrimming(new MyString("  AB CDE   "), new MyString("  AB CDE"));
    }
    
    private void assertTrimming(MyString original, MyString expected) {
	assertEquals(0, original.endTrim().compareTo(expected));
    }

    public void testEquality() {
	assertEquals(new MyString("A"), new MyString("A"));
	assertFalse(new MyString("A").equals(new MyString("B")));
    }

    public void testConcat() {
	assertEquals(new MyString("AB"), new MyString("A").concat(new MyString("B")));
    }

    public void testJoinEmptySeparatorNoStrings() {
	MyString separator = new MyString("");
	assertEquals(new MyString(""), separator.join());
    }

    public void testJoinCommaSeparatorNoStrings() {
	MyString separator = new MyString(",");
	assertEquals(new MyString(""), separator.join());
    }

    public void testJoinCommaSeparatorOneString() {
	MyString separator = new MyString(",");
	assertEquals(new MyString("A"), separator.join(new MyString("A")));
	assertEquals(new MyString("B"), separator.join(new MyString("B")));
    }

    public void testJoinCommaSeparatorSeveralStrings() {
	MyString separator = new MyString(",");
	assertEquals(new MyString("A,B"), separator.join(new MyString("A"), new MyString("B")));
	assertEquals(new MyString("A,B,C"), separator.join(new MyString("A"),
							   new MyString("B"),
							   new MyString("C")));
    }

    public void testArbitraryJoins() {
	assertEquals(new MyString("A--AA--AAA--AAAA--AAAAA"),
		     new MyString("--").join(new MyString("A"),
					     new MyString("AA"),
					     new MyString("AAA"),
					     new MyString("AAAA"),
					     new MyString("AAAAA")));
    }
}

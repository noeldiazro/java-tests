package tests;

import junit.framework.TestCase;

public class SequenceTest extends TestCase {
    public void testPrintingSequenceOfSizeOne() {
	Sequence sequence = new Sequence(1, 1);
	assertEquals("1", sequence.print());
    }

    public void testPrintingAnotherSequenceOfSizeOne() {
	Sequence sequence = new Sequence(2, 2);
	assertEquals("2", sequence.print());
    }

    public void testPrintingSequenceOfSizeTwo() {
	Sequence sequence = new Sequence(1, 2);
	assertEquals("1,2", sequence.print());
    }

    public void testPrintingSequenceOfArbitrarySize() {
	Sequence sequence = new Sequence(1, 5);
	assertEquals("1,2,3,4,5", sequence.print());
    }
}

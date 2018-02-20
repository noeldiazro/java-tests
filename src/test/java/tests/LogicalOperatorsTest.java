package tests;

import junit.framework.TestCase;

public class LogicalOperatorsTest extends TestCase {
    public void testLogicalAnd() {
	assertFalse(false && false);
	assertFalse(false && true);
	assertFalse(true && false);
	assertTrue(true && true);
    }

    public void testLogicalOr() {
	assertFalse(false || false);
	assertTrue(false || true);
	assertTrue(true || false);
	assertTrue(true || true);
    }

    public void testLogicalNot() {
	assertTrue(!false);
	assertFalse(!true);
    }

    public void testLogicalXor() {
	assertFalse(false ^ false);
	assertTrue(false ^ true);
	assertTrue(true ^ false);
	assertFalse(true ^ true);
    }
}

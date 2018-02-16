package tests;

import java.util.Arrays;
import junit.framework.TestCase;

public class ArrayEqualityTest extends TestCase {
    public void testArrayEquality() {
	int[] a = {1, 2, 3};
	int[] b = {1, 2, 3};
	assertFalse(a == b);
	assertFalse(a.equals(b));
	assertTrue(Arrays.equals(a, b));
    }
}

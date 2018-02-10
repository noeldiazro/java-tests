package tests;

import java.lang.StringBuilder;
import junit.framework.TestCase;

public class StringBuilderTest extends TestCase {
    public void testDynamicallyBuildString() {
	StringBuilder builder = new StringBuilder();
	builder.append("AB");
	builder.append('C');
	builder.append(1);
	assertEquals("ABC1", builder.toString());
    }
}

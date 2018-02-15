package tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import junit.framework.TestCase;

public class CastingTest extends TestCase {
    private static final String NEWLINE;
    static {
	NEWLINE = System.lineSeparator();
    }
    
    public void testCasting() {
	List words = new ArrayList();
	words.add("Hello");
	words.add("World");

	StringBuilder greeting = new StringBuilder();
	
	for (Iterator<Object> it = words.iterator(); it.hasNext(); ) {
	    String word = (String)it.next();
	    greeting.append(word);
	    greeting.append(NEWLINE);
	}
	assertEquals("Hello" + NEWLINE + "World" + NEWLINE, greeting.toString());
    }
}

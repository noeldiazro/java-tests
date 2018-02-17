package tests;

import junit.framework.TestCase;

public class FinallyTest extends TestCase {
    public void testFinally() {
	try {
	    show();
	}
	catch (Exception e) {
	}
    }

    private void show() throws Exception {
	try {
	    throwException();
	}
	/* OPTIONAL 
	catch (Exception e) {
	    throw e;
	} */
	finally {
	    System.out.println("Finally clause");
	}
    }
    
    private void throwException() throws Exception {
	System.out.println("Entering throwException...");
	throw new Exception();
	// System.out.println("Never gets reached!"); -- Does not even compile
    }
}

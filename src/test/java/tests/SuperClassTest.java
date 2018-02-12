package tests;

import junit.framework.TestCase;

public class SuperClassTest extends TestCase {
    public void testConstructorCalls() {
	SuperClass object = new SubClass();
	assertTrue(object.constructorWasCalled);
    }

    private class SuperClass {
	private boolean constructorWasCalled = false;
	SuperClass() {
	    constructorWasCalled = true;
	}
    }

    private class SubClass extends SuperClass {
	SubClass() {
	/* IMPLICITLY EQUIVALENT TO EXPLICITLY WRITING:
	    super();
	*/
	}
    }

    public void testConstructorWithParameterCalls() {
	SuperClassParam object = new SubClassParam("parm");
	assertTrue(object.constructorWasCalled);
    }

    private class SuperClassParam {
	private boolean constructorWasCalled = false;
	SuperClassParam(String parm) {
	    constructorWasCalled = true;
	}
    }

    private class SubClassParam extends SuperClassParam {
	SubClassParam(String parm) {
	    super(parm);
	}
    }
}

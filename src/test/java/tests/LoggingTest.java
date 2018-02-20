package tests;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.LogRecord;
import junit.framework.TestCase;

public class LoggingTest extends TestCase {
    private Logger logger;

    @Override public void setUp() {
	logger = Logger.getLogger(getClass().getName());
    }
    
    public void testLogInfoMessage() {
	logger.info("Hello logger");
	assertNull(logger.getLevel());
    }

    public void testSetLevel() {
	logger.setLevel(Level.WARNING);
	logger.info("Hello logger"); // Not logged
	logger.severe("The nuclear fusion is inminent"); // Logged
    }

    public void testHandlers() {
	logger.setLevel(Level.ALL);
	Handler[] handlers = logger.getHandlers();
	TestHandler handler = new TestHandler();
	logger.addHandler(handler);
	assertFalse(handler.wasLogged);
	logger.info("Hello logger");
	assertTrue(handler.wasLogged);
    }
}

class TestHandler extends Handler {

    boolean wasLogged = false;

    @Override public void close() {
    }

    @Override public void flush() {
    }

    @Override public void publish(LogRecord log) {
	wasLogged = true;
    }
}

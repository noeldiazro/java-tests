package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import junit.framework.TestCase;

public class SortingTest extends TestCase {
    private List<String> list;
    
    public void setUp() {
	list = new ArrayList<String>();
	list.add("Heller");
	list.add("Kafka");
	list.add("Camus");
	list.add("Boyle");
    }
    
    public void testSortStringsInPlace() {
	Collections.sort(list);
	assertEquals("Boyle", list.get(0));
	assertEquals("Camus", list.get(1));
	assertEquals("Heller", list.get(2));
	assertEquals("Kafka", list.get(3));
    }

    public void testSortStringsInNewList() {
	List<String> sortedList = new ArrayList<String>(list);
	Collections.sort(sortedList);
	assertEquals("Boyle", sortedList.get(0));
	assertEquals("Camus", sortedList.get(1));
	assertEquals("Heller", sortedList.get(2));
	assertEquals("Kafka", sortedList.get(3));

	assertEquals("Heller", list.get(0));
	assertEquals("Kafka", list.get(1));
	assertEquals("Camus", list.get(2));
	assertEquals("Boyle", list.get(3));
    }
}

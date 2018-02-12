package tests;

import junit.framework.TestCase;

public class SwitchTest extends TestCase {
    private enum Score {
	FIELD_GOAL,
	TOUCHDOWN,
	EXTRA_POINT,
	TWO_POINT_CONVERSION,
	SAFETY
    }
	
    public void testFootballScoreWithoutBreaks() {
	Score score = Score.TOUCHDOWN;

	int points = 0;
	
	switch (score) {
	case FIELD_GOAL:
	    points = 3;
	case TOUCHDOWN:
	    points = 6;
	case EXTRA_POINT:
	    points = 1;
	case TWO_POINT_CONVERSION:
	    points = 2;
	case SAFETY:
	    points = 2;
	}

	assertEquals(2, points);
    }

    public void testFootballScoreWithBreaks() {
	Score score = Score.TOUCHDOWN;

	int points = 0;
	
	switch (score) {
	case FIELD_GOAL:
	    points = 3;
	    break;
	case TOUCHDOWN:
	    points = 6;
	    break;
	case EXTRA_POINT:
	    points = 1;
	    break;
	case TWO_POINT_CONVERSION:
	    points = 2;
	    break;
	case SAFETY:
	    points = 2;
	    break;
	}

	assertEquals(6, points);
    }

    public void testFootballScoreWithCompactedSwitch() {
	Score score = Score.SAFETY;

	int points = 0;
	
	switch (score) {
	case FIELD_GOAL:
	    points = 3;
	    break;
	case TOUCHDOWN:
	    points = 6;
	    break;
	case EXTRA_POINT:
	    points = 1;
	    break;
	case TWO_POINT_CONVERSION:
	case SAFETY:
	    points = 2;
	    break;
	}

	assertEquals(2, points);
    }
    
}

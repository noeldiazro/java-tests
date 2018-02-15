package tests;

import junit.framework.TestCase;

public class MultidimensionalArrayTest extends TestCase {
    public void testTwoDimensionalArrays() {
	int[][] matrix;
	matrix = new int[3][4];
	matrix[0][0] = 0;
	matrix[0][1] = 1;
	matrix[0][2] = 2;
	matrix[0][3] = 3;
	matrix[1] = new int[] {4, 5, 6, 7,};
	matrix[2] = new int[] {8, 9, 10, 11,};
	assertEquals(0, matrix[0][0]);
	assertEquals(6, matrix[1][2]);
    }

    public void testPartialDimensions() {
	int[][] matrix = new int[3][];
	matrix[0] = new int[] {0,};
	matrix[1] = new int[] {1, 2,};
	matrix[2] = new int[] {3, 4, 5,};
	assertEquals(0, matrix[0][0]);
	assertEquals(4, matrix[2][1]);
    }
}

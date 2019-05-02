package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursiveFunctionsTest {

	@Test
	void factorialTest() {
		
		assertTrue(RecursiveFunctions.factorial(5)==120, "The method is functional");
		assertTrue(RecursiveFunctions.factorial(3)==6, "The method is functional");
		assertTrue(RecursiveFunctions.factorial(0)==1, "The method is functional");
	}
	
	@Test
	void fibonacciTest() {
		
		assertTrue(RecursiveFunctions.fibonacci(3)==2,"Congratulations");
		assertTrue(RecursiveFunctions.fibonacci(5)==5,"Congratulations");
		assertTrue(RecursiveFunctions.fibonacci(9)==34,"Congratulations");

		
	}
	
	@Test
	void arraySumatoryTest() {
		int[] arrayOne= {1,2,3,4,5};
		int[] arrayTwo= {1,2,3,4,5,6,7};
		int[] arrayThree= {1,2,3,4,5,8,10};
		assertTrue(RecursiveFunctions.arraySumatory(arrayOne)==15,"Congratulations");
		assertTrue(RecursiveFunctions.arraySumatory(arrayTwo)==28,"Congratulations");
		assertTrue(RecursiveFunctions.arraySumatory(arrayThree)==33,"Congratulations");

	}
	
	
	
}

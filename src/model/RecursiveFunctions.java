package model;

public class RecursiveFunctions {
	
	public static int factorial(int number) {
		
		if(number==0) {
			return 1;
		} else {
			return number*factorial(number-1);
			
		}
		
	}
	
	public static long fibonacci (long number) {
		
		if((number==0) || (number==1)) {
			return number;
		} else {
			
			return fibonacci(number-1)+fibonacci(number-2);
		}
		
		
	}
	
	public static int arraySumatory(int[] a) {
		
		return arraySumatory(a, a.length-1);
	}
	
	public static int arraySumatory(int[] a,int n) {
		
		if(n==0) {
			return a[0];
		} else {
			return a[n]+arraySumatory(a, n-1);
		}
	}
	

}

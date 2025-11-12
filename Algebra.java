// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		
		for (int i = 0; x2>i; i++){
			x1++;
		}
		return x1;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		if (x2>0){
		for (int i = 0; x2>i; i++){
			x1--;
		}
	}
	else if (x2<0) {
		for (int i = 0; x2<i; i--){
			x1++;
		}
		
	}
		return x1;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int temp = 0;
		if (x2>0) {
			
		
		for (int i = 0; x2>i; i++){
		temp = plus(temp, x1);	

		}
	}
		else if (0>x2){
		for (int i = 0; x2<i; i--){
		temp = minus(temp, x1);
		}	
		}

		return temp;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int temp = x;
		for (int i = 1; n>i; i++){
		temp = times(temp, x);	
		}

		return temp;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		if (x2 == 0) {
            System.err.println("Error: Cannot divide by zero.");
            return 0;
        }
		int count = 0;
		int temp = x2;
		while (temp <= x1) {
		temp =	plus(temp, x2);

			count++;}
			if (x2 == x1) {count = 1;}
				
		return count;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		// Replace the following statement with your code
		return 0;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		// Replace the following statement with your code
		return 0;
	}	  	  
}
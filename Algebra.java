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
		if (x2>0){
		for (int i = 0; x2>i; i++){
			x1++;
		}
	}
	else if (x2<0){
		for (int i = 0; x2<i; i--){
			x1--;
		}
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
		if (n == 0) {
			temp = 1;
		}

		return temp;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		if (x1 == 0) {
          return 0 ;
        }
		int count = 0;
		int temp = x2;
		while (temp <= x1) {
		temp =	plus(temp, x2);

			count++;}
			if (x2 == x1) {count = 1;}
			if (x1>0 && 0>x2) {
				temp = times(-1, x2);
				while (temp <= x1) {
				temp =	plus(temp, x2);

				count++;}
				count = times(count, -1);
			}
			if (x1<0 && 0<x2) {
				x1 = times(-1, x1);
				while (temp <= x1) {
				temp =	plus(temp, x2);

				count++;}
				count = times(count, -1);
			}
				
		return count;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
	int divisionResult = div(x1, x2);
    int amountToSubtract = times(divisionResult, x2);
	int modulu = minus(x1, amountToSubtract);
		return modulu;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		int sqrt = 0;
		for (int i = 0;x>i;i++){
			times(i, i);
			if (times(i, i) == x) {
				sqrt = i;
				
			}
			if (x == 1){sqrt=1;}
		}
		return sqrt;
	}	  	  
}
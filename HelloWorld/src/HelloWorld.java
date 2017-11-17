/*public class HelloWorld {
	public static void main(String[] args)  {
	 String x = "Hello World!";
		System.out.println(x);
		x1(x);
		System.out.println(x2());
		x3(2,3);
		System.out.println(x4(4, 0, false));
		iteration();
	}
	
//parameters
	public static void x1(String x) {
		System.out.println(x);
			}
//return types	
	public static String x2(){
	return "Hello World!";
	}
// parameters/operators
	
	public static void x3(int a, int b) {
		int c;
		c = a + b;
	System.out.println(c);
	} */
// conditionals 1 & 2 with iteration and array
/*public class HelloWorld {
	public static void main (String[]args) {
	int[] arrayOfInts = new int[10];
	int[] newArray = {0,1,2,3,4,5,6,7,8,9};
	
		for (int i = 0; i < 10; i++) {
			System.out.println(newArray[i]);
		}
	}
	public static int x4 ( int a, int b, boolean test) {
		int d = 0;
		if (a == 0) {
			return b;
		}
		else if (b == 0) {
			return a;
			}
		else if (test == true) {
			d = a + b;
		} else
		{
			d = a * b;
		}
		return d;
		}
	}
	*/
// iteration
/*	public static void iteration() {
		for (int i = 0; i < 10; i++){
			System.out.println(x4(i,2, true));
		}
		}
//arrays
	public static void array() {
		int[] arrayOfInts = new int[10];
		int[] arrayofInts2 = {0,1,2,3,4,5,6,7,8,9};
	}
}*/
// Iteration/Arrays
public class HelloWorld {
	public static void main (String[]args) {
	int[] arrayOfInts = new int[10];
	int[] newArray = {0,1,2,3,4,5,6,7,8,9};
	
		for (int i = 0; i < 10; i++) {
			System.out.println(newArray[i]);
		}
	}
	public static int x4 ( int a, int b, boolean test) {
		int d = 0;
		if (a == 0) {
			return b;
		}
		else if (b == 0) {
			return a;
			}
		else if (test == true) {
			d = a + b;
		} else
		{
			d = a * b;
		}
		return d;
		}
	}


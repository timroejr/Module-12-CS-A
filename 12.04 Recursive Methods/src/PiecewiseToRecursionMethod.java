/**
 * 
 * @author timothyroejr
 * @version 8/10/15
 */
class PiecewiseToRecursionMethodInit {
	
	PiecewiseToRecursionMethodInit() {
		
	}
	
	public int fOf(int x) {
		if (x <= 10) {
			System.out.println(x + " <= 10, therefore ... f(" + x + ") = -7");
			return -7;
		} 
		else {
			System.out.println(x + " > 10, therefore ... f(" + x + " - 4) + 2 = f("+ (x-4) + ") + 2");
			return fOf(x-4) + 2;
		}
		
	}

}

public class PiecewiseToRecursionMethod {
	public static void main(String[] args) {
		int x;
		PiecewiseToRecursionMethodInit method = new PiecewiseToRecursionMethodInit();
		System.out.println("---------------------------------");
		System.out.println("       f(x - 4) + 2    if x >  10");
		System.out.println("f(x) = ");
		System.out.println("       -7              if x <= 10");
		System.out.println("---------------------------------");
		System.out.println();
		
		/*x = 25;
		System.out.println("Example 1: x = " + x);
		System.out.println("f(" + x + ") = " + ));
		System.out.println(); */
		
		ExampleThreeMethod three = new ExampleThreeMethod();
		x = 30;
		System.out.println("---------------------------------");
		System.out.println("     f(x/12 + 5) - 3   if x >  25");
		System.out.println("f(x) = ");
		System.out.println("     20                if x <= 25");
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println("Example 3: x = " + x);
		System.out.println("f(" + x + ") = " + three.fOf(x));
		System.out.println();
		
		
		//This Method Gives You Infinitiy and can not be solved for.
		//The Method has been commented out for this reason
		//You may uncomment if you would like.
		
		/*ExampleFourMethod four = new ExampleFourMethod();
		x = 500;
		System.out.println("---------------------------------");
		System.out.println("       f(x*2) - 4      if x >  20");
		System.out.println("f(x) = ");
		System.out.println("       -100            if x <= 20");
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println("Example 4: x = " + x);
		System.out.println("f(" + x + ") = " + four.fOf(x));
		System.out.println(); */
		
	}
}

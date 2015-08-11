/**
 * @author timothyroejr
 */
import java.util.Scanner;

public class FibonacciNumbers {

	/**
	 * 
	 * @param n is the number that was inputted
	 * @return Fibonacci value of number input
	 */
	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	/**
	 * Run Method
	 */
	public static void run() {
		System.out.print("Number to Calculate for Fibonacci Value: ");
		Scanner in = new Scanner(System.in);
		String fiboString = in.next();
		if (fiboString.equals("q")) {
			System.out.println();
		} else {
			int fibo = Integer.parseInt(fiboString);
			fibo = fibonacci(fibo);
			System.out.println("Fibonacci Value: "+ fibo);
			run();
		}
	}
	/**
	 * Main Method
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Calculate the Fibonacci Value");
		System.out.println("Enter \"q\" at any time to quit");
		System.out.println();
		run();
	}

}

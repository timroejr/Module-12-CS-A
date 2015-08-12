/**
 * @author timothyroejr
 * @version V1
 */
import java.util.Scanner;
public class RecursivePalindromeTester {
	public static void run(){
		Scanner in = new Scanner(System.in);
		RecursivePalindrome rp = new RecursivePalindrome();
		System.out.print("Palindrome Word: ");
		String dataIn = in.next();
		if (dataIn.equals("q")) {
			System.out.println();
		} else {
			Boolean palindromeBool = rp.checkWord(dataIn);
			if (palindromeBool) {
				System.out.println("The Word " + dataIn + " is a Palindrome");
				run();
			} else {
				System.out.println("The Word " + dataIn + " is not a Palindrome");
				run();
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Palindrome Tester. V1");
		System.out.println("Type \"q\" at any time to quit");
		run();
	}

}

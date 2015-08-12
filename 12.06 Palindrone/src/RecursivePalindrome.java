/**
 * 
 * @author timothyroejr
 * @version V1
 */
public class RecursivePalindrome {
	public static String phrase;
	/**
	 * 
	 * @param word - Word to test to see if Palindrome
	 * @return True/False whether the word is a Plaindrome or not
	 */
	public boolean checkWord (String word) {
		if (word.length() == 0 || word.length() == 1) {
			return true;
		}
		int lengthEnd = word.length()-1;
		int lengthStart = 1;
		int wordsRight = 0;
		for (int i = 0;i < word.length()/2; i++) {
			lengthEnd--;
			if (word.charAt(lengthStart) == word.charAt(lengthEnd)) {
				wordsRight++;
			}
			lengthStart++;
		}
		if (wordsRight == word.length()/2) {
			return true;
		} else {
			return false;
		}
	}

}

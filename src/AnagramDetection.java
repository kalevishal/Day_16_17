import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
	static boolean areAnagram(char[] str1, char[] str2) {
		// Get lenghts of both strings
		int strOneLength = str1.length;
		int strTwoLength = str2.length;

		// Check both hte string size is same or not
		if (strOneLength != strTwoLength)
			return false;

		// Sort both strings
		Arrays.sort(str1);
		Arrays.sort(str2);

		// Compare sorted strings
		for (int i = 0; i < strOneLength; i++) {
			if (str1[i] != str2[i])
				return false;
		}
		return true;
	}

	public static char[] stringToChar(String s) {
		char[] ch = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
		}
		return ch;
	}

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first string");
		String first = scan.next();
		System.out.println("Enter second string");
		String second = scan.next();

		char charArray1[] = stringToChar(first);
		char charArray2[] = stringToChar(second);

		// Function Call
		if (areAnagram(charArray1, charArray2))
			System.out.println("The two strings are" + " anagram of each other");
		else
			System.out.println("The two strings are not" + " anagram of each other");
	}
}
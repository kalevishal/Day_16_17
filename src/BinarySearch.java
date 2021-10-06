import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of words you wish to input: ");
		int n = scan.nextInt();
		String[] words = new String[n];

		System.out.println("Enter the words");
		for (int i = 0; i < words.length; i++) {
			System.out.print("WORD " + (i + 1) + ": ");
			words[i] = scan.next();
		}

		// To sort the words and print them
		Arrays.sort(words);
		for (int m = 0; m < words.length; m++) {
			System.out.print(words[m] + " ");
		}

		System.out.println("\nEnter the word you want to search for");
		String word = scan.next();
		int startIndex = 0, endIndex = n - 1, mid = 0;

		// For searcendIndexng the word from the given words
		while (startIndex <= endIndex) {
			mid = (startIndex + endIndex) / 2;
			if (words[mid].equals(word)) {
				System.out.println(word + " is word number=" + (mid + 1));
				break;
			} else if ((words[mid].compareTo(word)) < 0) {
				startIndex = mid + 1;
			} else {
				endIndex = mid-1;
			}
		}
	}
}
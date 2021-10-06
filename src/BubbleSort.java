import java.util.Scanner;

public class BubbleSort {

	// sort array
	public void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	// print array
	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static int[] userInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many numbers to be sorted:");
		int n = scan.nextInt();
		int array[] = new int[n];
		System.out.println();
		System.out.println("Enter value for " + n + " numbers:");

		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt(); // taking input from user
		}
		return array;

	}

	public static void main(String args[]) {
		BubbleSort ob = new BubbleSort();
		int array[] = userInput();
		ob.bubbleSort(array);
		System.out.println("Sorted array");
		ob.printArray(array);
	}
}
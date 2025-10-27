package basic_questions;

class QuestionSeries3 {

	void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

//	Write a program to find the sum of elements of an array.
	void sumOfArrayele(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum of array = " + sum);
	}

//	Write a program to find the maximum and minimum element in an array.
	void maxMin(int[] arr) {
		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
	}

//	Write a program to search a number in an array (Linear Search).
	void searchNum(int[] arr, int num) {
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.println(num + " found at index " + i);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println(num + " not present in array");
		}
	}

//
//	Write a program to sort an array in ascending order using any loop.

//	Write a program to count even and odd elements in an array.

	void countEvenOddEle(int[] arr) {

		int evenCount = 0;
		int oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Even number present in array = " + evenCount);
		System.out.println("Odd number present in array = " + oddCount);
	}
//
//	Write a program to copy all elements of one array into another.

	void copyArrayElement(int[] arr) {

		System.out.print("Original Array: ");
		printArray(arr);

		int[] cArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			cArr[i] = arr[i];
		}
		System.out.print("Copy Array element = ");
		printArray(cArr);

	}
}

public class ArrayProblems1 {
	public static void main(String[] args) {
		QuestionSeries3 ob = new QuestionSeries3();

		int arr[] = { 10, 34, 33, 40, 47 };

		ob.printArray(arr);
		System.out.println();
		System.out.println("------------------------");
		ob.sumOfArrayele(arr);
		ob.maxMin(arr);
		ob.searchNum(arr, 3);
		ob.searchNum(arr, 30);
		ob.countEvenOddEle(arr);
		ob.copyArrayElement(arr);
	}

}

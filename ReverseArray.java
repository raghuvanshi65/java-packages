import testers.CheckStatic;

import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;


/**
 * https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
 * https://practice.geeksforgeeks.org/problems/reverse-a-string/1
 */
public class ReverseArray {

	private int temp;

	public ReverseArray() {
		this.temp = 0;
		Class cls = this.getClass();
		System.out.println(cls.getName());
	}

	public static void main(String[] args) {
		ReverseArray obj = new ReverseArray();
		System.out.println(obj.getClass().getCanonicalName());
		CheckStatic cs = new CheckStatic();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int[] inputArr = new int[n];
		System.out.println("Enter the array input");
		for (int i = 0; i < n; i++)
			inputArr[i] = sc.nextInt();
		obj.reverseArray3(inputArr, 0, n - 1);
		System.out.println(Arrays.toString(inputArr));
	}

	// Time O(n) and Space O(n)
	public int[] reverseArray1(int[] arr) {
		int n = arr.length;
		int[] tempArr = new int[n];
		for (int i = 0; i < n; i++)
			tempArr[n - i - 1] = arr[i];
		return tempArr;
	}

	// Time O(n/2) Space O(1)
	public void reverseArray2(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;
		}
	}

	// Time O(n) Space O(n)
	public void reverseArray3(int[] arr, int startIndex, int endIndex) {
		if (startIndex >= endIndex)
			return;
		this.temp = arr[startIndex];
		arr[startIndex] = arr[endIndex];
		arr[endIndex] = this.temp;
		reverseArray3(arr, startIndex + 1, endIndex - 1);
	}
}
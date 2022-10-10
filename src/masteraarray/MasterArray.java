package masteraarray;

import java.util.Arrays;

public class MasterArray {
	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7 };
		int[] b = { 2, 0,4,-1,0,-2, 6, 8 };
		// printArray(a, "Before");
		printArray(moveZeros(b), "After");
	}

	public static void printArray(int[] a, String s) {
		System.out.println(s + "------->" + Arrays.toString(a));
	}

	public static int[] removeDupsfromArray(int[] nums) {
		Arrays.sort(nums);
		int[] result = new int[nums.length];
		int prev = nums[0];
		result[0] = prev;
		for (int i = 1; i < nums.length; i++) {

			if (prev != nums[i]) {
				result[i] = nums[i];
			}
			prev = nums[i];
		}
		return result;

	}

	public static int[] reverseArrays(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;

		}

		return a;

	}

	public static int[] moveZeros(int[] a) {
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				a[j++] = a[i];

			}

		}
		while (j < a.length) {
			a[j++] = 0;
		}

		return a;

	}

	public static int[] mergeSortedArrays(int[] a, int[] b) {
		int[] mergedArra = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				mergedArra[k++] = a[i++];
			} else {
				mergedArra[k++] = b[j++];
			}
		}
		while (i < a.length) {
			mergedArra[k++] = i++;
		}
		while (j < a.length) {
			mergedArra[k++] = j++;
		}

		return mergedArra;
	}

}

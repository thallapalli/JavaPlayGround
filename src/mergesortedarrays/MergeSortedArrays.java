package mergesortedarrays;

import java.util.Arrays;

public class MergeSortedArrays {
	public static void main(String[] args) {
		int[] a= {1,3,5,7};
		int[] b= {2,4,6,9};
		int[] mergetwoSortedArray = mergetwoSortedArray(a, b);
		System.out.println(Arrays.toString(mergetwoSortedArray));
	}
	public static int[]  mergetwoSortedArray(int[] a, int b[]) {
		int[] c = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k++] = a[i++];

			} else {
				c[k++] = b[j++];
			}
		}
		while (i < a.length) {
			c[k++] = a[i++];
		}
		while (j < b.length) {
			c[k++] = b[j++];
		}

		return c;

	}
}

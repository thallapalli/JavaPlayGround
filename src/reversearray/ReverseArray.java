package reversearray;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ReverseArray {
	public int[] reverseArray(int[] a) {
		for(int i=0;i<a.length/2;i++) {
			int temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
		
		return a;
		
	}
	@Test
	public void reverseArray() {
		ReverseArray arr=new ReverseArray();
		int[] b= {3,4,6,1};
		arr.reverseArray(b);
		System.out.println(Arrays.toString(b));
	}
}

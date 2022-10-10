package masteraarray;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MasterArray {
	public static void main(String[] args) {
		int[] a= {6,5,5,6,7,1};
		System.out.println(Arrays.toString(removeDupsfromArray(a)));
		
	Set<Integer> collect = Arrays.stream(a).boxed().collect(Collectors.toSet());
	Object[] array = collect.toArray();
	System.out.println(Arrays.toString(array));
	
	}
	
	public static int[] removeDupsfromArray(int[] nums) {
		Arrays.sort(nums); 
		int[] result=new int[nums.length];
		int prev=nums[0];
		result[0]=prev;
		for(int i=1;i<nums.length;i++) {
			
			if(prev!=nums[i]) {
				result[i]=nums[i];
			}
			prev=nums[i];
		}
		return result;
		
	}
}

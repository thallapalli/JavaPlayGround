
public class SingleDimension {
	int arr[]=null;
	public SingleDimension(int size) {
		arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.MIN_VALUE;
		}
	}
	public void insert(int location,int value) {
		try {
		if(arr[location]==Integer.MIN_VALUE) {
			arr[location]=value;
			System.out.println("Sucessfully Inserted");
		}else {
			System.out.println("this location is being used by another value");
		} }
		catch(ArrayIndexOutOfBoundsException e) {
			throw new ArrayIndexOutOfBoundsException(location);
		}
	}
	public void traverseAraay() {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i!=arr.length-1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}
}

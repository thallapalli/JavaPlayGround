import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
	public static void main(String[] args) {
		MyLinkedList mylis=new MyLinkedList();
		mylis.createLinkedList(5);
		int[] tab = {12,2};
		int min = Arrays.stream(tab).min().getAsInt();
		int asInt = Arrays.stream(tab).min().getAsInt();
		int sum = Arrays.stream(tab).sum();
		System.out.println(sum);
		Set set=new HashSet<>(Arrays.asList(tab));
		IntStream.of(tab).boxed().collect(Collectors.toList());
		System.out.println(Arrays.toString(tab));
		
	}
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyHackerTest {
	public static void main(String[] args) {
		double d = (double) 2 / 5;
		System.out.println(timeConversion("12:00:01AM"));
		System.out.println(timeConversion("12:00:01PM"));
		// 07:05:45PM
		shortestSubstring("abcbcabdd");

	}

	public static void test(int m) {
		LinkedList<Integer> linkedlist = new LinkedList<>();
		linkedlist.add(42);
		/**
		 * linkedlist.add(200); linkedlist.add(3); linkedlist.add(40000);
		 * linkedlist.add(5);
		 **/

		int size = linkedlist.size();
		if (size > 0 && m <= size) {
			System.out.println(linkedlist.get(size - m));

		} else {
			System.out.println("NILL");
		}

	}

	public static void miniMaxSum(List<Integer> arr) {

		// Write your code here
		arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);

		Collections.sort(arr);

		long max = 0;
		long min = 0;
		for (int i = 0; i < 4; i++) {
			max += arr.get(i);

		}
		for (int i = arr.size() - 1; i > arr.size() - 5; i--) {

			min += arr.get(i);
		}
		System.out.println(max + " " + min);

	}

	public static String timeConversion(String s) {
		// ss hh:mm:ssAM
		String[] split = s.split(":");
		String hh = split[0];
		String ssAM = split[2];
		int parsedHH = Integer.parseInt(hh);
		if (Integer.parseInt(hh) >= 12 && ssAM.contains("AM")) {
			int amval = parsedHH - 12;
			String h = "";
			if (amval < 10) {
				h = "0" + amval;

			}
			return h + ":" + split[1] + ":" + ssAM.substring(0, 2);
		}

		else if (Integer.parseInt(hh) <= 12) {
			int amval = parsedHH + 12;
			return amval + ":" + split[1] + ":" + ssAM.substring(0, 2);
		} else {
			return s.substring(0, 8);
		}

		// Write your code here

	}

	public static String test1(String s) {
		String[] split = s.split(":");
		String hh = split[0];
		String ssAM = split[2];
		int parsedHH = Integer.parseInt(hh);
		if (s.contains("AM")) {
			if (parsedHH >= 12) {
				int amval = parsedHH - 12;
				String h = "";
				if (amval < 10) {
					h = "0" + amval;

				}
				return h + ":" + split[1] + ":" + ssAM.substring(0, 2);
			} else {
				return s.substring(0, 8);
			}
		} else {
			if (Integer.parseInt(hh) < 12) {
				int amval = parsedHH + 12;
				return amval + ":" + split[1] + ":" + ssAM.substring(0, 2);
			} else {
				return s.substring(0, 8);
			}
		}

	}

	public static int lonelyinteger(List<Integer> a) {
		a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(2);
		a.add(4);
		a.add(1);
		Set set = new HashSet<>();
		int repeated = -1;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < a.size(); i++) {
			int num = a.get(i);
			if (map.get(num) == null) {
				map.put(num, 1);
			} else {
				map.put(num, map.get(num) + 1);
			}
		}
		Set<Integer> keySet = map.keySet();
		System.out.println("map is " + map.toString());
		System.out.println("keySet" + keySet.toString());
		Integer integer = map.get(4);
		System.out.println("what is " + integer);
		for (int i : keySet) {
			System.out.println(i);

			if (map.get(i) == 1) {
				System.out.println("map.get90-->" + i);
				repeated = i;
				System.out.println("repeated" + repeated);
				break;

			}
		}
		return repeated;

		// Write your code here

	}

	public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
		// Write your code here
		List<Integer> myarr = new ArrayList<>();
		for (String s : queries) {
			int count = 0;

			for (int i = 0; i < strings.size(); i++) {
				if (s.equalsIgnoreCase(strings.get(i))) {
					count++;
				}
			}
			myarr.add(count);
		}
		return myarr;

	}

	public static int shortestSubstring(String givenString) {
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < givenString.length(); i++) {
			if (!set.contains(givenString.charAt(i))) {
				set.add(givenString.charAt(i));
			}
		}
		// if string has to be all chars then  length should minimum of size of the above set
		int minLength = set.size();
		// now lets find subString 0 to length of the string ,if contains all  chars then add to the list
		// start from 0 to length of
		ArrayList<Integer> list = new ArrayList();
		for (int i = 0; i < givenString.length(); i++) {
			String subStr = givenString.substring(i, minLength);
			if (containsall(subStr, set)) {
				list.add(subStr.length());
			}

		}
		Collections.sort(list);
	
		return list.stream().max(Integer::compare).get();

	}

	private static boolean containsall(String s, Set<Character> set) {
		for(Character s1:set) {
			if(!s.contains(s1.toString())) {
				return false;
			}
		}
		return true;

	}

	public static void plusMinus(List<Integer> arr) {
		int sumP = 0;
		int sumNeg = 0;
		int zeroCount = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > 0) {

				sumP++;
			} else if (arr.get(i) < 0) {
				sumNeg++;
			} else {
				zeroCount++;
			}
		}
		System.out.println(String.format("%.6f", (double) sumP / arr.size()));
		System.out.println(String.format("%.6f", (double) sumNeg / arr.size()));
		System.out.println(String.format("%.6f", (double) zeroCount / arr.size()));

	}

}

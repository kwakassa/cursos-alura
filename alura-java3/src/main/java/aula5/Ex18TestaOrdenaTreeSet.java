package aula5;

import java.util.Set;
import java.util.TreeSet;

public class Ex18TestaOrdenaTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> nums = new TreeSet<Integer>();
		for (int i = 1; i <= 1000; i++) {
			nums.add(i);
		}
		Set<Integer> descendingSet = nums.descendingSet();
		long i = 1;
		for (Integer integer : descendingSet) {
			System.out.println("Element " + i + ": " + integer);
			i++;
		}
	}
}

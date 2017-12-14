package aula5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex19TestaOrdenaTreeSet {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		for(int i=1;i<=1000;i++){
			nums.add(i);
		}
		Collections.reverse(nums);
		long i=1;
		for (Integer integer : nums) {
			System.out.println("Element " + i + ": " + integer);
			i++;
		}
	}
}

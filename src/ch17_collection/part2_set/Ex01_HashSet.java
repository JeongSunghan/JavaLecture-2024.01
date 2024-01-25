package ch17_collection.part2_set;

import java.util.HashSet;
import java.util.Set;

public class Ex01_HashSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		//저장
		set.add("Java"); set.add("collection"); set.add("set");
		System.out.println(set);
	}

}

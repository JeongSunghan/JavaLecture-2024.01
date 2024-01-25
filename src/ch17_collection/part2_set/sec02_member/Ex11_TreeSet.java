package ch17_collection.part2_set.sec02_member;

import java.util.Set;
import java.util.TreeSet;

public class Ex11_TreeSet {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		//집어넣은 순서와 관계없이 정렬 후 나열
		set.add(10); set.add(3); set.add(15); set.add(4); set.add(6);
		System.out.println(set);
		
		Set<String> strSet = new TreeSet<String>();
		strSet.add("G"); strSet.add("B"); strSet.add("D"); strSet.add("H"); strSet.add("F");
		System.out.println(strSet);
		
	}

}

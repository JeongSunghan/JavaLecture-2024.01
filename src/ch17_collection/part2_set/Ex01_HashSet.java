package ch17_collection.part2_set;

import java.util.HashSet;
import java.util.Set;

public class Ex01_HashSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		//저장
		set.add("Java"); set.add("collection"); set.add("set");
		set.add("set");				//중복 저장은 안됨
		System.out.println(set);
		
		//삭제
		set.remove("set");
		System.out.println(set);	
		set.clear();
		System.out.println(set.isEmpty());

		
		
		//정보 추출
		set.add("Java"); set.add("collection"); set.add("set");
		System.out.println(set.size());
		
		//모든 객체 꺼내기
		for(String element:set)
			System.out.println(element);
		
		Set<Integer> intSet = new HashSet<Integer>();
		intSet.add(1); intSet.add(3); intSet.add(6); intSet.add(9); intSet.add(12);
		System.out.println(intSet);
	}

}

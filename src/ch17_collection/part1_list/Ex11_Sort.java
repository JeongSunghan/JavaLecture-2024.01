package ch17_collection.part1_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex11_Sort {

	public static void main(String[] args) {
		List<Integer> scoreList = new ArrayList<Integer>();
		scoreList.add(85); scoreList.add(78); scoreList.add(92); scoreList.add(88);
		scoreList.sort(Comparator.naturalOrder());
		
		
		//오름차순 정렬
		scoreList.sort(Comparator.naturalOrder());
		System.out.println(scoreList);
		
		
		

	}

}

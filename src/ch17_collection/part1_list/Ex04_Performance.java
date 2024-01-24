package ch17_collection.part1_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex04_Performance {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		List<String> ll = new LinkedList<String>();
		
		//ArrayList 맨 앞에 10000회 삽입하는 경우 => 8.7ms
		long startTime = System.nanoTime();
		for (int i = 1; i <= 10000; i++)
			al.add(String.valueOf(i));
		long endTime = System.nanoTime();
			System.out.println("ArrayList 소요시간: " + (endTime - startTime + " ns")) ;
			
			
		//ArrayList 맨 앞에 10000회 삽입하는 경우 => 2.4ms
		startTime = System.nanoTime();
		for (int i = 1; i <= 10000; i++)
			ll.add(String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("LinkedList 소요시간: " + (endTime - startTime + " ns")) ;
	}
	
	
	//뒤에다가 넣을 때는 어레이리스트 앞에다가는 링크리스트 넣기
}

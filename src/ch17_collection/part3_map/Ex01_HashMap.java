package ch17_collection.part3_map;



import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Ex01_HashMap {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("사과", 1500); map.put("배", 2500); map.put("감", 1000);
		map.put("배", 3000);
		
		System.out.println(map);
		
		//추출
		System.out.println(map.get("사과"));//key 값으로 얻기
		
		//정보 추출
		System.out.println(map.containsKey("배" + ", " + map.containsKey(4000)));
		
		//Key의 셋 컬렉션 - 권장방법
		Set<String> keySet = map.keySet();
		for(String key: keySet)
			System.out.println(key + ": " + map.get(key));
		
		//Entry의 Set collection
		Set<Entry<String, Integer>> entrySet = map.entrySet();
			for (Entry<String, Integer> entry: entrySet)
				System.out.println(entry.getKey() + ": " + entry.getValue());
			
			System.out.println("====================Stram으로 처리");
			map.forEach((k, v)-> System.out.println(k + ": " + v));
			
		//삭제
		map.remove("감");
		System.out.println(map.size());
		map.forEach((k,v)-> System.out.println(k + ": " + v));
	}
}

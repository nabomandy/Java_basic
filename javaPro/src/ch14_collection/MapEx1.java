package ch14_collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] names = {"홍길동", "김삿갓", "이몽룡", "임꺽정", "김삿갓" };
		int[] nums = { 1234, 4567, 2350, 9870, 2345 };
		
		
		for (int i = 0 ; i < names.length; i++) {
			map.put(names[i], nums[i]);
		}
		
		System.out.println(map);
		
		System.out.println("홍길동 번호:" + map.get("홍길동"));
		System.out.println("이몽룡 번호:" + map.get("이몽룡"));
		System.out.println("김삿갓 번호:" + map.get("김삿갓")); //키는 세트처럼 중복개체를 걸러낸다. 따라서 중복되면 마지막 값이 출력되는 것이다.
		
		
		
		Set<String> keys = map.keySet(); //key names
		for(String key : keys)
			System.out.println(key + "=" + map.get(key));
		
		System.out.println("Iterator 이용하여 출력");
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String a = it.next();
			System.out.println(a+"="+map.get(a));
		}
		
		System.out.println("Iterator 이용하여 value 출력");
//		Map 객체에서 value 들만 조회하기
		Collection<Integer> values = map.values();
		for (Integer i : values) {
			System.out.println(i);
		}
		System.out.println();
		Iterator<Integer> itvalue = values.iterator();
		while (itvalue.hasNext()) {
			System.out.println(itvalue.next());
			
			
			
//		Key, Value의 쌓인 객체(Entry)로 조회
		System.out.println("Key, Value의 쌓인 객체로 조회");
		Set<Map.Entry<String, Integer>> entry = map.entrySet(); //-><Map.Entry<String, Integer>> 전체가 제네릭
		for (Map.Entry<String, Integer> m : entry) {
			System.out.println(m.getKey() + "의 번호:" + m.getValue());
			System.out.println(m);
		}
		}
	}
}


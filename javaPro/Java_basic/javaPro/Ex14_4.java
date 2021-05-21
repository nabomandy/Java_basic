package javaPro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Ex14_4 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(); //배열생성했고
		for(int i=0; i<10; i++) 				
			list.add(i);							//값을 추가
		
		//list의 모든 요소를 출력
//		list.forEach(System.out::print); 밑에거랑 다르다.
//		list.forEach(i -> System.out.print(i+", "));
//		System.out.println();
		
//		list.forEach(i -> System.out.print(i+", "));를 예전처럼 표현하면 아래
		System.out.println(list);
//		Iterator<Integer> it = list.iterator();
//		while(it.hasNext()) {
//			System.out.print(it.next()+", ");
//			System.out.println();
//		}
		
		// list에서 2 또는 3의 배수를 제거한다.
		list.removeIf(x -> x%2==0 || x%3==0); //-> ||는 둘 중 하나라도 true이면 끝내는 거
		System.out.println(list);
		 
		list.replaceAll(i->i*10); // list 각 요소에 10을 곱한다
		System.out.println(list);
		
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		// map의 모든 요소를 {k,v}의 형식으로 출력한다.
		map.forEach((k,v)-> System.out.print("{"+k+","+v+"},"));
//		=
//		Iterator it = map.entrySet().iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		System.out.println();
	}

}

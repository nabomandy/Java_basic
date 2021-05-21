package ch19_strea;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동전", "춘향전", "구운몽", "전우치전", "사씨남정기");
		System.out.println();
		IntStream st = list.stream().mapToInt(String::length);
//		Stream<String> strStream = list.stream();
//		Stream<Integer> st = strStream.mapToInt(String::length).boxed();
				
		
		st.forEach(len -> System.out.println(len));
		
		System.out.println();
		list.stream().mapToInt(s -> s.length()).forEach(len -> System.out.println(len));

	}

}

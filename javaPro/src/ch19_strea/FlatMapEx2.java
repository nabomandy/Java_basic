package ch19_strea;

import java.util.Arrays;
import java.util.List;

/*
 * flatMap : stream을 연결 한개의 stream을 만든다. stream을 리턴한다. 
 */
public class FlatMapEx2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50,60);
		
		list.stream()
			.flatMap(data -> {
				return Arrays.stream(new int[] {data, data+1, data+2}).boxed();
			})
//			.forEach(n -> System.out.println(n));
			.forEach(System.out::println);
				
			}
		

		
	}



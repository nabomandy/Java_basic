package ch19_strea;

import java.util.Arrays;
import java.util.List;

public class PeekEx1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("aaa", "bbbbbb", "cccc");
		System.out.println("결과출력 없음");
		list.stream()
		.mapToInt(a->a.length())
		.peek(a->System.out.println(a)); //결과 출력 없음
//		.peek(a->System.out.println(a)).count(); //count라는 최종실행결과가 있어야 찍힘 없으면 안찍힌다. 

//		System.out.println(count);
		
		System.out.println("결과 출력 하기");
		double totSum = list.stream()
				.mapToInt(a->a.length())
				.peek(a->System.out.println(a))
				.sum();
		System.out.println("글자수의 합:" + totSum);
	}
}

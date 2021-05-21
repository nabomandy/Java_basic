package ch19_strea;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingByEx1 {

	public static void main(String[] args) {
		List<Figure> list = Arrays.asList(
				new Rectangle(10, 3),
				new Circle(10),
				new Rectangle(2, 3),
				new Circle(5));
		
		Map<String, List<Figure>> map
		= list.stream()
			  .collect(Collectors.groupingBy(f->f.type)); //아래 내용 생략 이유는 피규어 디폴트라서
//		      .collect(Collectors.groupingBy(f->f.type, Collectors.toList());
		
		System.out.println("사각형 출력 :");
//		map.get("사각형").stream().forEach(f->System.out.println(f));
		map.get("사각형").stream().forEach(System.out::println);
		System.out.println("원 출력 :");
//		map.get("원").stream().forEach(f->System.out.println(f));
		map.get("원").stream().forEach(System.out::println);
	}
}

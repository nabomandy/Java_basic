package ch19_strea;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectEx1 {
	public static void main(String[] args) {
		List<Figure> list = Arrays.asList(new Rectangle(10, 3),
				new Circle(10), new Rectangle(2, 3));
		List<Figure> rectList = list.stream()
				.filter(s -> s.type.equals("사각형"))
				.collect(Collectors.toList());
		rectList.stream().forEach(System.out::println);
		System.out.println();
		
		Set<Figure> rectSet = 
				list.stream()
				.filter(s->s.type.equals("사각형"))
				.collect(Collectors.toSet());
		rectSet.stream().forEach(System.out::println);
	

	}

}

package ch19_strea;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapEx3 {

	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
				new String[] {"abc", "def", "jkl"},
				new String[] {"ABC", "GHI", "JKL"}
				);
		Stream<String> stream =
				strArrStrm
				.flatMap(s -> Arrays.stream(s));
//				.flatMap(Ar	rays::Stream);
		
//			stream.forEach(s -> System.out.println(s));
			stream.forEach(System.out::println);

		}
				

	}



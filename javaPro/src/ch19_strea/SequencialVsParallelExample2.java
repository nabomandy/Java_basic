package ch19_strea;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SequencialVsParallelExample2 {
	
	//요소 처리
	public static void work(int value) {
		try { Thread.sleep(100);
	} catch	(InterruptedException e) {} 
	}
	
	//순차 처리
	public static long testSequencial(List<Integer> list) {
		long start = System.nanoTime();
		list.stream().parallel().forEach((a)-> work(a)); //parallel()
		long end = System.nanoTime();
		long runTime = end - start;
		return runTime;
	}
	
	//병렬처리
	public static long testParallel(List<Integer> list) {
		long start = System.nanoTime();
		list.stream().parallel().forEach((a)-> work(a)); //.parallel()
		long end = System.nanoTime();
		long runTime = end - start;
		return runTime;
	}
	

	public static void main(String... args) {
		//소스 컬렉션.
		List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
		//순차 스트림 처리 시간 구하기
		long Sequencial = testSequencial(list);
		//병렬 스트림 처리 시간 구하기
		long timeParallel = testParallel(list);
		
//		DecimalFormat df = new DecimalFormat("###,###,###,###,###");
//		System.out.println("순차:병렬 ---> " + df.format(Sequencial)+":"
//				+df.format(timeParallel)); -> 이걸로 비교해서 보면 차이가 크게 남
		
		System.out.println("순차:병렬 ---> " + Sequencial + ":" + timeParallel);
		if(Sequencial < timeParallel ) {
			System.out.println("성능 테스트 결과: 순차 처리가 더 빠름");
		} else {
			System.out.println("성능 테스트 결과: 병렬 처리가 더 빠름");
			Collections.sort(list, c);
		}
	}
}

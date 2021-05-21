package ch14_collection;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/* TreeSet 예제 : 중복불가, 정렬
 * Lotto 번호 생성기 TreeSet을 이용하여 출력하기
 * 0 ~ 45까지의 랜덤한 4개의 수를 순서 적용하여 프린트 한다
 * ex) 3, 25, 34, 37
 */
public class Exam3 {

	public static void main(String[] args) {
//		Set set = new TreeSet();
//		for(int i = 0;  set.size() < 4 ; i++) {
//			int num = (int) ((Math.random() * 45) +1);
//			set.add(num);
//		}
//		
//		System.out.println(set);
//			
		System.out.println("Lotto 번호 ======");
		Set<Integer> ball = new TreeSet<>(); //8.0이후
		while(ball.size() < 6) {
			ball.add((int)(Math.random()*45) + 1);
		}
		System.out.println(ball);
		
		
	}

}

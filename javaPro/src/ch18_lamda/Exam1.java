package ch18_lamda;



/*
 * LambdaEx01을 이용하여 입력된 숫자까지의 합을 프린트하기. 람다식 사용
 */
//	1) 파라미터 한개(int num), 리턴 타입 없는 추상 메소드 한 개를 가진 인터페이스를 구현하세요

interface LambdaEx01 { void method(int num);}

public class Exam1 {
	public static void main(String[] args) {
//	2) 1번의 인터페이스를 이용하여 1부터 num 까지의 합을 구하는 람다식을 구현하세요.

		LambdaEx01 f = x -> {
			int sum = 0;
			for (int i = 1; i <= x; i++) {
				sum+=i;
			}
			System.out.println(sum);
			
		};
		f.method(10); //55
		f.method(100); //5050
	}
}

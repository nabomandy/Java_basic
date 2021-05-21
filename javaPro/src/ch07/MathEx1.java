package ch07;
/* 메서드 구성
 * [접근 제어자] 리턴타입 메서드이름(매개변수 목록) => 선언부
 * {								   => 구현부
 * 		문장들
 * }
 * 
 * 리턴타입 : 메서드 종료 후 전달되는 값의 자료형.
 * 			void인 경우는 리턴값이 없다.
 * 
 * 매개변수 : 메서드 호출시 전달되는 초기화 값.
 * 		   매개변수가 없는 경우 ()표현함.
 * return : return이 실행되면 메서드가 종료됨.
 * 		   리턴타입이 void가 아닌 경우는 반드시 return 리턴값; 구현해야 함.
 * 		   void인 경우는 return 생략 가능함. 메서드의 마지막 '}' 메서드가 종료됨. 
 *
 */
class Math1 {
	int add1(int a, int b)	// => 선언부
	{		return a + b;	} // => 구현부, body
	
	long add2(int a, int b) {
		return a + b;	}
	
	static double add3(int a, int b) {
		return a + b;	}}

public class MathEx1 {

	public static void main(String[] args) {
		Math1 m1 = new Math1();
		int i = m1.add1(10, 20);
		long l = m1.add2(10, 20);
		double d = Math1.add3(10, 20); 
		
		System.out.println(m1.add1(10, 20)); //결과는 int값. 한 이유는.
		// 파라미터에다가 메서드를 쓸 수 있다. 그러면 실행하고 리턴되는 값만 남는다.
		
		System.out.println(i);
		System.out.println(l);
		System.out.println(d);
	}

}

package ch11;
/*
 * finally 구문 : 정상 실행, 예외실행 모두 실행됨
 * 				 try, catch 구문에서 return문장을 만나도 finally는 실행됨.
 *
 */

public class ExceptionEx3 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
//			return; // 매서드 종료
		} catch(Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println("finally:" +5);
		}
		System.out.println(6);

	}

}

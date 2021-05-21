package ch11;
/*
 * 예외처리
 * try 블럭 : 예외가 발생할 가능성이 있는 문장들.
 * 			예외가 발생한 경우 제어 catch 블럭으로 이동.
 * catch블럭 : 예외가 발생하면 호출되는 블럭.
 * 			예외가 발생되면, 예외는 잡고, 정상적으로 실행을 함.
 * 			try 블럭과 함게 사용해야 함.
 */
public class ExceptionEx1 {
	public static void main(String[] args) {
		//System.out.println(1/0); //이걸 여기다 쓰면 ArithmeticException 예외 발생
		try {
			System.out.println(1/0); //ArithmeticException 예외 발생
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		} catch (ArithmeticException e) { //-> 캐치블럭을 사용하는 방식, ArithmeticException 이걸 써줘야 함. Exception이라고만 써도됨. 익셉션이 ae의 조상이라서. 이건 절차임.
		//catch (Exception e) 라고 써도 됨
//		  catch (NullPointerException e) { 라고 쓰면 걍 에러
			//e.printStackTrace();
			System.out.println("0으로 나누지 마세요");
		}
		System.out.println(5);
	}}

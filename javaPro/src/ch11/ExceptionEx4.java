package ch11;

import java.io.IOException;

/* 
 * throws 예외 처리
 * throws Exception을 처리한 메소드는 콜한 메소드에서 처리 하여야 함.
 * 단 RuntimaException은 처리하지 않아도 됨
 */
public class ExceptionEx4 {
	public static void main(String[] args) {
		
		try {
			first();
		}	catch (Exception e) {
			e.printStackTrace(); //-> 이거 지우면 에러 안남
		}

	}
	
	private static void first() throws Exception {
		
		second();
	}

	private static void second() throws Exception {
		System.out.println("second 메서드");
		//NuberFormatException 예외 발생
		System.out.println(Integer.parseInt("abc")); //->?
	}
}

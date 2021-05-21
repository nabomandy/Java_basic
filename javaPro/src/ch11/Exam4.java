package ch11;
/*
 * UnsupportFunctionException 클래스 구현하기
 * 1. 멤버변수 : private final int ERR_CODE;
 * 2. 멤버메스드 :
 * 		public int getErrCode() : ERR_CODE 값 반환
 * 		public String getMessage() : 오버라이딩 메서드.
 * 			부모클래스의 message 값과 ERR_CODE 값 반환.
 * 3. 예외처리를 안해도 되도록 구현. ->throws 시키지 않은 것의 의미
 * 4. 생성자는 구동클래스의 호출에 맞도록 구현
 */
class UnsupportFunctionException extends RuntimeException{ // RuntimeException은 계속해서 컴파일상에서 토스 안해도 됨. RuntimeException만 그래 특징이.	
	private final int ERR_CODE;
	UnsupportFunctionException(String msg, int ERR_CODE) {
		super(msg);
		this.ERR_CODE = ERR_CODE;
	}
	public int getErrCode() {
		return ERR_CODE;
	}
	@Override
	public String getMessage() {
		return super.getMessage() + ":" + ERR_CODE;
	}
}

public class Exam4 {
	public static void main(String[] args) {
		try {
			throw new UnsupportFunctionException
			("지원하지 않는 기능입니다." ,20050);
		} catch(UnsupportFunctionException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getErrCode());
		}
//		throw new UnsupportFuntionException("지원하지 않는 기능입니다." ,20050)
	}

}

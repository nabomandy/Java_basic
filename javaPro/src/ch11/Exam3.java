package ch11;
//2가지 에러 처리방법을 이용하여 컴파일 에러를 수정하세요/
class MyException1 extends Exception {
	MyException1(String msg) {
		super(msg);
	}
}
public class Exam3 {
	public static void main(String[] args) {
		method();
	}
	private static void method() {
		throw new MyException1("Exam3.method() 예외 강제 발생");
	}

}
//매소드 내에서 바꾸겠다면 try catch로 바꾸며면되고
// 보낼거야 하면 throws 하면 됨
//두가지 다 가능

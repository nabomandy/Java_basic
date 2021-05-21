package ch08;
/*
 * final 변경불가.
 * final method : 재정의 불가. 오버라이딩 불가 메서드.
 * 오버라이딩은 안되지만 자식클래스에서 사용은 가능하다.
 */
public class FinalMethod {
	final void finalMethod() {	//오버라이딩 불가 메서드
		System.out.println("finalMethod 오버라이딩 불가");
	}
	
	public static void main(String[] args) {
		FinalMethod f = new FinalMethod();
		f.finalMethod();
	}
	
	
}

class SubMethod extends FinalMethod {
	void finalMethod222() {
		System.out.println("finalMethod 오버라이딩 불가");
	}
}
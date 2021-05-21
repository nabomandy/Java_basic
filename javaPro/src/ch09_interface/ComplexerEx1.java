package ch09_interface;

// 인터페이스는 일종의 추상클래스
// 추상메서드와 상수만을 멤버로 가질 수 있다.

interface Printerable {
	int INK = 100;  //public final static 생략
	void print();  //public abstract 생략
}

interface Scannerable { 
	void scan() ;
}

interface Faxable {
	String FAX_NO = "010-12345";
	void send(String tel);
	void receive(String tel);
}

interface Complexerable extends Printerable, Scannerable, Faxable {}
//구현클래스
//같은 인터페이스간의 상속은 extends-> 다중상속이된다.
//클래스를 인터페이스로 상속받을 때는 implements
class Complexer implements Complexerable {
	int ink;
	Complexer() {
		this.ink = INK;
	}
	@Override
	public void print() {
		System.out.println("종이에 출력합니다. 남은 잉크량:" + --ink);		
	}
	@Override
	public void scan() {
		System.out.println("이미지를 스캔합니다.");		
	}
	@Override
	public void send(String tel) {
		System.out.println(FAX_NO + "에서 " + tel + "번호로 FAX를 전송합니다.");	
	}
	@Override
	public void receive(String tel) {
		System.out.println(tel + "에서 " + FAX_NO + "로 FAX를 받았습니다.");	
	}
}

public class ComplexerEx1 {
	public static void main(String[] args) {
		Complexer com = new Complexer();
		System.out.println("기본 잉크량:" + Printerable.INK);
		System.out.println("FAX 번호:" + Complexerable.FAX_NO);
		com.print();
		com.scan();
		com.receive("02-5678");
		com.send("02-5678");
	}
}

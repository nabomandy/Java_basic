package ch07;

/*
 * 멤버 메서드의 종류
 *  클래스(static) 메서드
 *  인스턴스 메서드
 */
//public class Math2 { 라고 쓰면 한 페이지에 public이 두개라서 에러
class Math2 {
	int a, b; // 인스턴스변수
	int x;

// 인스턴스 메서드 : 객체화가 되어야 메서드의 호출이 가능함. 참조변수명. 메서드명() 호출해야함	
	int add1() {
		for (int i=0; i<5; i++) {
			int x=7;
		}
		System.out.println(x);
		return a+b;
	}
	
//클래스 메서드 : 클래스 정보 로드될 때 메서드의 호출이 가능함. 클래스명. 메서드명() 호출할 수 있다.
	static int add2(int a, int b) {
		int x=5 ;
		System.out.println(x);
		return a+b;
	}
}
public class MathEx2 {
	//public class Math2 { 라고 쓰면 Math2 라는 이름이 맨위에 클래스 이름이랑 똑같아서 에러.
	public static void main(String[] args) { // 클래스 메서드
		Math2 m = new Math2();
		m.a = 10;
		m.b = 20;
		System.out.println(m.add1()); //30
		System.out.println(m.add2(100, 200));	//300
		System.out.println(Math2.add2(100, 200));	//300v  37번처럼 쓰는게 맞고, 36번처럼도 쓸 수 있다는 의미.
	}

		
	}

// 한 페이제에 퍼블릭은 하나만 있어야 하고
// class 이름이 같으면 안되고
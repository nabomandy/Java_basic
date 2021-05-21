package ch07;
//를 지워보면 에러가 나는데, 왜 에러가 나는지를 파악하는 게 문제. static과 아닌 것의 차이.
public class MemberCallEx1 {
	static int cv1 = 10;
	static int cv2 = cv1; //클래스 멤버간 호출
	int iv1 = 100;
	int iv2 = iv1;		//인스턴스 멤버간 호출
	int iv3 = cv1;		//인스턴스멤버에서 클래스멤버 호출
//  static int cv3 = iv1; //클래스멤버에서 인스턴스 멤버 호출 => 객체화 필요
	static int cv3 = new MemberCallEx1().iv1; //클래스 멤버에서 인스턴스 멤버 호출 => 객체화 필요
	
	
	public static void main(String[] args) {
//		cv2 = iv1; //클래스멤버인 main메서드에서 iv1 인스턴스멤버 접근 불가
		cv2 = new MemberCallEx1().iv1;
//		iv1 = cv2;
		new MemberCallEx1().iv1 = cv2;
//		method(); //error
		new MemberCallEx1().method1();
		method2(); } //2
	
	void method1() {
		System.out.println(cv1 + cv2);
		System.out.println(iv1 + iv2);	}
	static void method2() {
		System.out.println(cv1 + cv2);
//		System.out.println(iv1 + iv2);
		MemberCallEx1 m = new MemberCallEx1();
		System.out.println(m.iv1 + m.iv2); }
	}



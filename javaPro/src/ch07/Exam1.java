package ch07;
/*
 * 가로(width), 세로(height)의 변수를 가지고 ㅣㅆ는
 * 직사각형(Rectangle) 클래스 만들기
 * 모든 멤버의 접근제한자는 생략한다
 * 모든 멤버는 인스턴스 멤버이다
 * 멤버 메서드로는 넓이는 print하는 area(),
 * 둘레를 print하는 length()를 가진다.
 */

/*
 * Exam1 : 구동클래스. main 메서드를 멤버로 가지고 있는 클래스.
 * 		   보통 public 클래스임.
 * 파일의 이름은 반드시 public 클래스의 이름과 동일해야 함.
 * 하나의 파일에 두개의 public 클래스는 불가능함.
 */

public class Exam1 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 10;
		r1.height = 5;
		System.out.print("넓이:");
		r1.area();
		System.out.print("둘레:");
		r1.length();
		// 가로 30, 세로 20인 직사각형의 객체를 생성하고 넓이, 둘레를 출력하기
		Rectangle r2 = new Rectangle();
		r2.width = 30;
		r2.height = 20;
		System.out.print("넓이:");
		r2.area();
		System.out.print("둘레:");
		r2.length();		
	}

}

class Rectangle {
	int width;
	int height;
	public Rectangle() {  //public 을 사용한 이유 -> 다른 패키지에서도 쟤를 사용할 수 있게 하겠다.
} 
	Rectangle(int width, int height){
		this.width=width;
		this.height=height;
	}

	
	void area() {
		System.out.println((width * height));
	
//	String area() {
//	//	System.out.println(width * height);
//		return "aaaa";
//		
	}
	

	void length() {
		System.out.println((width + height) * 2);
	}
}
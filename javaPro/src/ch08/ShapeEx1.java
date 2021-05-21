package ch08;
/*
 * 추상클래스
 * 추상메서드를 가질 수 있는 클래스. abstract 예약어로 구현됨.
 * 객체화 불가 => 객체화는 반드시 상속을 통해서 자손클래스의 객체화로 객체화가 가능함.
 * 이때 자손클래스에서는 추상메서드를 반드시 오버라이딩 해야함.
 * 그외는 일반클래스와 동일. (생성자, 멤버변수, 멤버메소드)
 */
public class ShapeEx1 {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2]; //shape 을 뉴 연산자로 만드는 건 불가. 이거는 배열을 만든 것. 들어가는 주소 타입이 shape 인거라고.?
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(5,5);
		for (Shape s : shapes) {
			System.out.println(s);
		}
/*
 * shapes[0].area(); shapes[1].area():syso(shapes[0]);
 */		
	}
}
abstract class Shape {
	String type;
	Shape(String type) {
		this.type = type;
	}
	abstract double area(); // 추상메서드
	abstract double length(); // 추상메서드
}
class Circle extends Shape {
	int r;
	Circle(int r) {
		super("원");
		this.r = r;
	}
	@Override
	public String toString() {
		return " Circle [r=" + r + ", type=" + type + "]" + ", 넓이:"
	+area() + ", 둘레:" + length(); }
	@Override
	double area() {
		return Math.PI * r * r; }
	@Override
	double length() {
		return Math.PI * r * 2;
	}}

class Rectangle extends Shape {
	int width, height;
	Rectangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;}
		
		@Override
		double area() {
			return width * height;			
		}
		@Override
		double length() {
			return 2 * (width * height);
		}
		@Override
		public String toString() {
			return "Rectangle [width= " + width + ", height=" + height 
					+ ", type=" + type + "]" + " 넓이:" + area() + ", 둘레:"
					+ length();
	}
}	


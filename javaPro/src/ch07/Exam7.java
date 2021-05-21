package ch07;
/*
 * 원(Circle)클래스 구현하기
 * 1. 멤버변수
 * 		반지름(r), x좌표(x), y좌표(y), 원의번호(no)
 * 		원의번호 생성 변수: static count
 * 2. 생성자 : new Circle(r,x,y); new Circle(x,y); new Circle(r);
 * 3. 멤버메서드
 * 		(1) double area() : 원의 넓이 리턴. Math.PI 상수 사용 : Math.PI*r*r  %.3f
 * 		(2) double length() : 원의 둘레 리턴. Math.PI 상수 아용 : Math.PI*2*r
 * 		(3) void move(int a, int b) : x,y 좌표를 x+a, y+b로 이동.
 * 		(4) void scale(double m) : 반지름을 m배 확대/출소. r=r*m
 * 		(5) String toString() :
 * 			1번원 : 반지름:10, 좌표:(10,10), 넓이:314.xxx, 둘레:xxx.xxx
 * 			...
 */

class Circle {
	double r;
	int x,y,no;
	static int count;
	double area() {		return Math.PI *(r*r); }
	double length() {		return 2*Math.PI*r;	}
	void move(int a, int b) {	x += a;		y += b; }
	void scale(double m) {		r=r*m;	}
	public String toString() {
		return
			no + "번원 : 반지름 :"+r+","+"좌표 : ("+x+","+y+"), 넓이 :" 
			+area() + ", 둘레:"+ length();
		/*
		 * return String.format("%d번원=>qkswlfma:%.0f, 좌표(%d,%d), 넓이:%.3f," 
		 * "둘레:%.3f", no,r,x,y,area(),length());
		 * -> String.format을 사용한 예시
		 */
	}
	Circle(int r, int x, int y) {
		this.r = r;		this.x = x;		this.y = y;		no = ++count;	}
	Circle(int x, int y){		this(1,x,y);	}
	Circle(int r){ 		this(r,0,0);	}}
		

public class Exam7 {
	public static void main(String[] args) {
		Circle[] carr = new Circle[3];
		carr[0] = new Circle(10, 10, 10); //반지름 10, (10,10)좌표
		carr[1] = new Circle(20,20);		//반지름 1, (20,20) 좌표
		carr[2] = new Circle(100);		//반지름 : 100, (0,0) 좌표	
		for(Circle c : carr) {
			System.out.println(c);
			c.move(10,10);
			System.out.println(c);
			c.scale(3);
			System.out.println(c);
		}
	}
}
//
//class circle {
//	int r, x, y;
//	public static int count;
//	circle(int r, int x, int y){
//		
//	}
//	double area() {
//		return Math.PI*r*r;
//	}
//	double length() {
//		return Math.PI*2*r;
//	}
//	void move(int a, int b) {
//		return x+a 
//	}
//}



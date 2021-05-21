package ch07;
/*
 * Rectangle3 클래스 구현하기
 *  멤버변수 : width, height, serialNo, sno(번호를 생성하기 위한 static 변수)
 *  생성자 : 가로와 세로를 입력받고, 가로 세로 값을 초기화 함.
 *  멤버 메서드 :
 *  	int area() : 넓이 값 리턴
 *  	int length() : 둘레 값 리턴
 *  	boolean isSquare() : 정사각형 여부 리턴
 *  	void info() :
 *  		"serialNo번사각형 : (10,10) 넓이 : 100, 둘레 : 40, 정사각형" 문자열을 출력하기
 */
//toString은 참조형변수를 찍을 때

class Rectangle3 {
	int width;
	int height;
	int serialNo;
	static int sno;
	Rectangle3(int w, int h) {
		width=w;	
		height=h;
		serialNo=++sno;
	}
	int area() {		return width * height;	}
	int length() {			return (width+height)*2;	}
	boolean isSquare() {		return width==height;	}
	void info() {
		System.out.println
		(serialNo+"번사각형 : ("+width+","+height+") 넓이:"+area()+", "
				+ "둘레:"+length()+(isSquare()?" 정사각형":" 직사각형")) ;
	}
	
	
	
}
public class Exam6 {
	public static void main(String[] args) {
		Rectangle3[] recarr= new Rectangle3[3];
		recarr[0] = new Rectangle3(10,10);
		recarr[1] = new Rectangle3(20,10);
		recarr[2] = new Rectangle3(25,25);
		for(Rectangle3 r : recarr) { //-> 개선된 for문이다. 공부해라 기억이 안난다.
			r.info();
	
//		public String toString() {
//			return info + ":" + "(" + ")" +"넓이 :" + area + "둘레 :" + length
//					+ isSquare
//		}
		}
	}

//class Rectangle3
//	isSquare = !isSquare;
// 	int area = 0
// 	int length = 0
// 	for(int i=1;<>)
//	


}

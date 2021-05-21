package ch12_API;

import java.awt.Point;

/*
 * Object의 clone()은 protected이기 때문에 clone() 메소드를 꼭 override 하여야 함
 * class 내부에서 사용 하여야 한다.
 * clone()은 반드시 예외 처리를 해주어야 한다.
 * clone을 실행하려면 implements Cloneable을 하여야 한다.
 * 주소만 넣는게 아니라 주소에 있는 값까지 복제를 해주는 게 클론
 */


class point implements Cloneable {
	int x;
	int y;
	
	point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x=" + x + ", y=" + y;
	}
	
	
	@Override	//protected이기 때문에 clone()메소드를 꼭 override하여야 한다.
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	} }


class CloneEx1 {

	public static void main(String[] args) {
		Point original = new Point(3, 5);
		Point copy = (Point) original.clone(); //복제(clone)해서 새로운 객체를 생성
		System.out.println(original);
		System.out.println(copy);

	}

}

package ch08;
//디폴트 생성자만 생략이 가능하다

class Parent {
	int x = 10;
	Parent(int x) {		this.x = x;
	}
	
	Parent() { x=400;	
		
		}
}

class Child2 extends Parent {
	int x = 20;
	Child2() { 	} //default constructor 생략가능 -> 저렇게 썼다는 건 default 값을 쓰겠다는 거.
	/*
	 * Child2() { super(100); }
	 */
	
	void method() {
		int x = 30;
		// x:1. 지역변수 => 2. 현재 클래스의 멤버 중 x => 부모클래스의 객체의 멤버 중 x
		System.out.println(x); //30
		//1. 현재 클래스의 멤버 중 x => 부모클래스의 객체의 멤버 중 x
		System.out.println(this.x); //20
		//부모클래스의 객체의 멤버 중 x
		System.out.println(super.x);
	}	
} //100

public class SuperEx1 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}

}

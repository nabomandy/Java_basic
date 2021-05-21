package ch08;
/*
 * instanceof 예제
 */
class Parent4 {int x=10;}
class Child4 extends Parent4 {
	int x=20;
	void method() { System.out.println("Child method");}}

public class InstanceOfex1 {
	public static void main(String[] args) {
		Parent4 p = new Parent4(); //p의 주소에 갔는데 차일드가 있냐고 물어보는거->false
		if(p instanceof Child4) {
			System.out.println("p 참조변수 객체는 Child3 객체다");
			Child4 c = (Child4)p;
			System.out.println(c.x);
			c.method();		}
		if(p instanceof Parent4) { //true
			System.out.println("p 참조변수 객체는 Parent3 객체다");
		}
		/* 모든 클래스는 Object  클래스를 상속 받는다.
		 * => 모든 객체는 Object 객체를 포함한다.
		 * => 모든 객체는 Object 타입의 참조변수로 참조가 가능하다.
		 */
		if(p instanceof Object) { //true
			System.out.println("p 참조변수 객체는 Object 객체다");
			Object o = p; //모든 클래스에는 object가 있음
			System.out.println(p.x);
			//System.out.println(o.x); // x는 Object클래스의 멤버가 아니다.
		}	}}

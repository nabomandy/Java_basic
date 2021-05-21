package ch07;
/*
 * 매개변수 예제.
 * 기본형 매개변수 (read only)
 * 참조형 매개변수 (read & write)
 */
class Value {	int val;}

public class ParameterEx1 {
	public static void main(String[] args) {
		Value v = new Value();
		v.val = 100;
		change1(v.val);
		System.out.println("2:change1() 이후 :" + v.val);
		change2(v);
		System.out.println("4:change2() 이후 :" + v.val);
		
	}
	static void change1(int val) {
		val += 100;
		System.out.println("1:change1() :" + val);
	}
	static void change2(Value v) {
		v.val += 100;
		System.out.println("3:change2() :" + v.val);
	}

}

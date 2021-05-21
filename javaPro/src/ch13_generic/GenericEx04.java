package ch13_generic;

/* 제네릭 Method구현 : class 이용하지 않고 메소드만을 제네릭으로 구현한다
 * 실행 사용 시 제네릭 생략 가능함
 */
class Pool04<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) { 
		this.t = t;
	}
}

class Util04 {
	public static <T> Pool04<T> staticMethod(T t) {
		Pool04<T> box = new Pool04<T>();
		box.set(t);
		return box;
	}
	
	public <T> Pool04<T> instanceMethod1(T t) {
		Pool04<T> box = new Pool04<T>();
		box.set(t);
		return box;
	}
	
	public <T> String instanceMethod2(T t) {
		return t.toString();
	}
}

class MyCar {
	public String toString() {
		return "myCar";
	}
}

public class GenericEx04 {
	public static void main(String[] args) {
		Pool04<Integer> box1 = Util04.<Integer>staticMethod(100); 	//제네릭 생략가능, 100자리에 "1" 이나 100.0 같은 다른 타입은 안됨
		int intValue = box1.get();
		System.out.println(intValue);
		Util04 u = new Util04();
		Pool04<String> box2 = u.<String>instanceMethod1("홍길동");	//생략가능
		String strValue = box2.get();
		System.out.println(strValue);
		System.out.println(u.<String>instanceMethod2("김자바"));
		System.out.println(u.<MyCar>instanceMethod2(new MyCar()));

	}

}

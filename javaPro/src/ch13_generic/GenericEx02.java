package ch13_generic;

/*
 * 제네릭을 이용
 * 타입을 정하지 않고 class를 구현하는 방법이다.
 * class의 멤버, 메소드 파라메터, 리턴타입, 인터페이스의 타입을 실행시에 적용할 수 있다.
 * 실행 사용 시 제네릭 생략 가능함
 */
class Pool02<T> {
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t =t;
	}
}

public class GenericEx02 {
	public static void main(String[] args) {
		Pool02<String> box1 = new Pool02<String>();
		box1.set("hello");
		String str = box1.get();
		System.out.println(str);
		
		Pool02 box2 = new Pool02(); //Generic 생략
		box2.set(6);
		int value = (Integer) box2.get();
				System.out.println(value);
	}
}

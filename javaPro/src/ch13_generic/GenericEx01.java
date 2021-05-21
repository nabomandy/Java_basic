package ch13_generic;

/*
 * 타입을 정하지 않은 변수를 pool class의 멤버로 구현한다.
 */
class MyClass01 {
	@Override
	public String toString() {
		return "MyClass01";
	}
}

class Pool01 {
	private Object object;
	
	public void set(Object object) {
		this.object = object;
	}
	
	public Object get() {
		return object;
	}
}

public class GenericEx01 { //퍼플릭 클래스 이름은 저 위에 이름하고 일치해야 한다.
	public static void main(String[] args) {
		Pool01 gen = new Pool01();
		gen.set("그랜져"); //String type
		String name = (String) gen.get();
		System.out.println(name);
		MyClass01 my = new MyClass01();
		gen.set(my); //MyClass type
		MyClass01 g = (MyClass01) gen.get();
		System.out.println(g);
		gen.set(1); //Integer
		Integer i = (Integer) gen.get();
		System.out.println(i);
	}
}


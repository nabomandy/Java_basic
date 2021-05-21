package ch13_generic;

/*
 * 범위가 정해진 객체의 자손(Child) class 만을
 * 제네릭 타입으로 입력할 수 있도록 정의한다.
 * <T extends Numners> Number의 자손만을 입력할 수 있다.
 * (Wrapper 중 숫자만 가능)
 * <T super Number>는 class 정의 시 사용할 수 없고 실행시 사용가능하다.
 */

class Pool05<T extends Number> {
	T v;
	Pool05(T n) {
		v = n;
	}
	void set(T n) {
		v = n;
	}
	T get() {
		return v;
	}}
	
class Util05 {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		System.out.println(t1.getClass().getName());
		return Double.compare(v1, v2);
	}
}

public class GenericEx05 {
	public static void main(String[] args) {
//		String str = Util.compare("a", "b"); // 제네릭 메소드 compare
		int result1 = Util05.compare(10, 20);
		System.out.println(result1);
		int result2 = Util05.compare(4.5, 3);
		System.out.println(result2);
		Pool05<Integer> p1 = new Pool05<Integer>(20);
		Pool05<Double> p2 = new Pool05<Double>(20.0);
//		Pool05<String> p3 = new Pool05<String>("hello"); //제네릭 클래스
//		Pool05<Character> p4 = new Pool05<Character>('a');
		Pool05<Byte> p5 = new Pool05<Byte>((byte) 1);
		int value = p1.get();
		System.out.println(value);
		System.out.println(p2.get());
	}	}


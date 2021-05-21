package ch13_generic;

//여러개의 정해지지 않은 object를 입력할 수 있는 class 구현하기
//이 소스는 제네릭이 없는 소스
class NoGeneric { //순수하게 자바 클래스임
	Object[] v;
	
	void set(Object[] n) { //set는 외부에서 데이터를 넣어서 쓰겠다는 경우가 많기 떄문에, void로 많이쓰는 거.
		v = n;
	}
	
	Object[] get() {
		return v;
	}
	
	void print() {
		for (Object o : v)
			System.out.print(o + ",");
		System.out.println();
	}
}

public class GenericEx06 {
	public static void main(String[] args) {
		NoGeneric nogen = new NoGeneric();
		String[] ss = { "   월매   ", "   춘향   ", "   향단   " };
		nogen.set(ss);
		nogen.print();
		Object[] objs = nogen.get();
		for (Object o : objs) {
			String s = (String) o;
			System.out.println("["+s.trim()+"]");
		}
		
		Integer[] ii = { 1, 2, 3 };
		nogen.set(ii);
		objs = nogen.get();
		nogen.print();
		for(Object o : objs) {
			Integer s = (Integer) o;
			System.out.println(s);
		}
	}
}

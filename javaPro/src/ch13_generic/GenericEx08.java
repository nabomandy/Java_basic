package ch13_generic;

//제네릭을 이용한 MyArrayList 구현하기 ArrayList 흉내내기
class MyArrayList<T> {
	Object[] v = new Object[3];
	int index = 0;
	public void add(T t) {
		if (index == v.length) {
			System.out.println("length 추가 "+v.length);
			Object[] temp = new Object[v.length +2]; 
			System.arraycopy(v, 0, temp, 0, v.length);
			v = temp;
		}
		v[index++] = t;
	}
	public T get(int i) {
		return (T) v[i];
	}
	
	public void list() {
		for(Object s : v) {
			if (s == null) break;
			System.out.print((T) s + ",");
		}
		System.out.println();
	}
}

public class GenericEx08 {
	public static void main(String[] args) {
		MyArrayList<String> t1 = new MyArrayList<String>();
		t1.add("월매");
		t1.add("춘향");
		t1.add("향단");
		System.out.println(t1.get(2)); 
		t1.list();
		System.out.println("===========================");
		MyArrayList<Integer> t2 = new MyArrayList<Integer>();
		t2.add(1); //집어넣고 나서 인덱스 1
		t2.add(2); //집어넣고 나서 인덱스 2
		t2.add(3); //집어넣고 나서 인덱스 3
		t2.add(4);
		t2.add(5);
		t2.add(6);
		t2.add(7);
		System.out.println(t2.get(6));
		t2.list();
	}
}

package ch13_generic;

//제너릭을 이용한 MyArrayList 구현하기 ArrayList 흉내내기

public class GenericEx08_1 {
	public static void main(String[] args) {
		MyArrayList<Student> t1 = new MyArrayLists<Student>();
		t1.add(new Student(18, "김자바"));
		t1.add(new Student(25, "박자바"));
		t1.add(new Student(12, "나몰라"));
		t1.list();
		

	}

}


class Student {
	int age;
	String name;
	
	
	
}
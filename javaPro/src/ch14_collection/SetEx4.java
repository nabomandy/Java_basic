package ch14_collection;

import java.util.Comparator;
import java.util.TreeSet;

/* 정렬 관련 인터페이스
 * Comparable 인터페이스 : 추상메서드 compareTo(Object)
 * 						클래스의 기본 정렬 방식 지정
 * Comparator 인터페이스 : 추상메서드 compare(Object o1, Object o2)
 * 						기본정렬 방식대로 정렬하지 않고 사용자가 임의로 정렬 방식을 지정
 */

class Phone implements Comparable<Phone> {
	String name;
	int number;
	public Phone(String name, int number) {
		this.name = name;
		this.number = number;
	}
	public String toString() {
		return "(" + name + "," + number + ")";
	}
	@Override 
	public int compareTo(Phone p) {
		return	 name.compareTo(p.name);
	}
}

public class SetEx4 {
	public static void main(String[] args) {
		System.out.println("이름순으로 출력");
		TreeSet<Phone> set = new TreeSet<>();
		//TreeSet<Phone> set = new TreeSet<Phone>();원래는 이게 맞으나 phone을 안써도 에러가 안남. 아마 1.8부터?
		set.add(new Phone("홍길동", 1234));
		set.add(new Phone("김삿갓", 3456));
		set.add(new Phone("이몽룡", 5678));
		System.out.println(set);
		System.out.println("전화번호순으로 출력");
//		set = new TreeSet<>(new NumberAsc() ); -> ㅣㅇ렇게 클래스를 하나 만들어서 사용하는 것도 가능하다.
		set = new TreeSet<>(new Comparator<Phone>() {
			@Override									//-> 익명클래스를 사용한 방식
			public int compare(Phone p1, Phone p2) {
				return p1.number - p2.number;
			}});
		set.add(new Phone("홍길동", 1234));
		set.add(new Phone("김삿갓", 3456));
		set.add(new Phone("이몽룡", 5678));
		System.out.println(set); 
		System.out.println("이름의 역순으로 출력");
		set = new TreeSet<>(Comparator.reverseOrder());
		set.add(new Phone("홍길동", 1234));
		set.add(new Phone("김삿갓", 3456));
		set.add(new Phone("이몽룡", 5678));
		System.out.println(set);
		System.out.println("전화번호의 역순으로 출력");
    	set = new TreeSet<>(new Comparator<Phone>() {
		//-> ㅣㅇ렇게 클래스를 하나 만들어서 사용하는 것도 가능하다.
			@Override							//	-> 익명클래스를 사용한 방식, 이 방식이 더 많이 쓰이는 방식
			public int compare(Phone p1, Phone p2) {
				return p2.number - p1.number;
			}});
		set.add(new Phone("홍길동", 1234));
		set.add(new Phone("김삿갓", 3456));
		set.add(new Phone("이몽룡", 5678));
		System.out.println(set);
		}
	}

//class NumberAsc implements Comparator<Phone> {
//	@Override
//	public int compare(Phone p1, Phone p2) {
//		return p1.number - p2.number; 
//	}
//}
//class NumberDesc implements Comparator<Phone> {
//	@Override
//	public int compare(Phone p1, Phone p2) {
//		return p2.number - p1.number;
//	}
//}
//

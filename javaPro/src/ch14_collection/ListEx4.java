package ch14_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * => Sort() : 사용자정의 클래스는 반드시 Comparator 인터페이스를 구현한 클래스만 가능함.
 */
public class ListEx4 {
	public static void main(String[] args) {
		List<Person> li = new ArrayList<Person>();
		li.add(new Person("홍길동", 10));
		li.add(new Person("홍길동", 10));
		li.add(new Person("홍길동", 30));
		li.add(new Person("이정민", 10));
		li.add(new Person("김윤민", 16));
		Person p1 = new Person("김삿갓", 20);
		li.add(p1);
		System.out.println(li);
		
		Collections.sort(li, new Comparator<Person>() {
			
			@Override
			public int compare(Person o1, Person o2) {
				return (o1.name.compareTo(o2.name));
			}
		});
		
		System.out.println(li);
		
		}
	
	static <T> void sort(List<T> li, Comparator<T> c) {
		for (int i = 0; i < li.size()-1-i; i++) {
			for (int j = 0; j <li.size()-1-i; j++) {
			T p1 = li.get(j);
			T p2 = li.get(j+1);
			if (c.compare(p1, p2) > 0) {
				li.set(j, p2);
				li.set(j+1, p1);
			}
		}
	}
}}
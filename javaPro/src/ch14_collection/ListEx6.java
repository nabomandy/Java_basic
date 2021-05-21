package ch14_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListEx6 {
	public static void main(String[] args) {
		List<Person> li = new ArrayList<Person>();
		li.add(new Person("홍길동", 10));
		li.add(new Person("홍길동", 10));
		li.add(new Person("홍길동", 10));
		li.add(new Person("이정민", 10));
		li.add(new Person("김윤민", 10));
		Person p1 = new Person("김삿갓", 20);
		li.add(p1);
		System.out.println(li);
		Comparator<Person> cp = (a,b) -> a.name.compareTo(b.name);
		Comparator<Person> cp2 = (a,b) -> b.age-a.age;
		Collections.sort(li, cp2);
		
		
		Collections.sort(li, new Comparator<Person>() {
			
			@Override
			public int compare(Person o1, Person o2) {
				return (o1.name.compareTo(o2.name));
			}
		});

	}

}

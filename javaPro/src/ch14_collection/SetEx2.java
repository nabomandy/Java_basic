package ch14_collection;

import java.util.HashSet;
import java.util.Set;

/*
 * 객체의 중복을 논리적 판단하는 기준(동등객체)
 * 	1. equals(Object) : 결과가 true
 *  2. hashCode() : 결과가 동일
 *  두개의 메서드가 Object의 멤버 메서드임
 *  => equals 메서드를 오버라이딩
 *  => hashCode() 메서드도 오버라이딩
 *  => toString() 메서드 오버라이딩
 */

public class SetEx2 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("홍길동", 10));
		set.add(new Person("홍길동", 10));
		System.out.println(set);
		Person p1 = new Person("김삿갓", 20);
		Person p2 = p1;
		set.add(p1);
		set.add(p2);
		System.out.println();

	}

	
	
}

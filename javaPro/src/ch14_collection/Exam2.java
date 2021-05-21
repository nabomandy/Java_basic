package ch14_collection;

import java.util.HashSet;
import java.util.Set;

/*
 * Student 클래스 구하기
 * 1. 멤버변수 : 학번(studno), 이름(name), 전공(major)
 * 2. 멤버메서드 : toString()오버라이딩
 * 3. 학번과 이름이 같으면 같은 학생으로 인식하도록 오버라이딩 하기
 * 4. 생성자 ( 학번(studno), 이름(name), 전공(major))
 */
public class Exam2 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		set.add(new Student("1234","홍길동","경영"));
		set.add(new Student("2345","홍길순","경영"));
		set.add(new Student("2345","홍길순","컴공")); //추가불가
		set.add(new Student("1234","홍길동","통계")); //추가불가
		set.add(new Student("4567","홍길동","경영"));
		System.out.println("등록 학생 수:" + set.size()); //3
		System.out.println(set);
	}
}

class Student {
	String studno;
	String name;
	String major;
	public Student(String studno, String name, String major) {
		this.studno = studno;
		this.name = name;
		this.major = major;
	}
	@Override
	public int hashCode() { 
		//-> 동등하면 같은학생으로 인식하도록 구현
		return studno.hashCode()+name.hashCode();
	}
	
	@Override
	//-> 동등하면 같은학생으로 인식하도록 구현
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return studno.equals(s.studno)&&name.equals(s.name);
		}	
		else { return false;	}}

	@Override
	public String toString() {
		return 	"("+studno+","+name+","+major+")";
	}
	
}
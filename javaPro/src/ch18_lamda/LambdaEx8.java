package ch18_lamda;

import java.util.function.Function;


/* 
 * Function 계열 함수 인터페이스 : applyXXX 추상메서드를 멤버로 가진다.
 * 매개변수도 있고, 리턴값도 존재.
 * 주로 매개값을 리터낪으로 매핑(타입 변환)할 경우 사용
 * Function<Parameter, Return> : 매개변수 : Parameter, 리턴타입 : Return
 */

class Student {
	private String name;
	private int eng;
	private int math;
	private String major;
	Student() {}
	public Student(String name, int eng, int math, String major) {
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}
//	getter
	public String getName() { 
		return name;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public String getMajor() {
		return major;
	}
}

public class LambdaEx8 {
	private static Student[] list = {
			new Student("홍길동",90,80,"경영"), //->
			new Student("김삿갓",95,70,"컴공")
			};
	
public static void main(String[] args) {
	System.out.print("학생의 이름:");
	printString(t->t.getName());
	System.out.print("전공 이름:");
	printString(t->t.getMajor());
	
	System.out.println("======================");
	Function<Student, String> f2 = t->t.getName();

	printString(f2);
	printString(new Function<Student, String>() {
		@Override
		public String apply(Student t) {
			return t.getName();
		}});
}


	private static void printString(Function<Student, String> f) {
		for (Student s : list) {
			System.out.print(f.apply(s) + ",");
		}
		System.out.println(); }}
	


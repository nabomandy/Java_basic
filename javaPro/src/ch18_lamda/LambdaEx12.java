package ch18_lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Predicate 인터페이스 :
 * 매개변수 존재, 리턴값은 boolean인 함수 test 메서드를 가지고 잇음.
 * 매개값 조사해 true 또는 false를 리턴할 때 사용
 */
public class LambdaEx12 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 55, 60, "컴공"),
			new Student("이몽룡", 95, 90, "경영"),
			new Student("김삿갓", 75, 80, "심리"),
			new Student("임꺽정", 65, 70, "전자"),
			new Student("성춘향", 65, 0, "컴공"));

	public static void main(String[] args) {
		System.out.println("영어 점수가 60점 이상인 학생의 영어 평균 :"
				+ avg1(s-> s.getEng() >= 60)); //-> s는 Student, 다른 문자를 써도됨. s-> s.getEng() >= 60)이부분인 test임
		
		System.out.println("수학 점수가 60점 이상인 학생의 수학 평균 :"
				+ avg2(t->t.getMath()>=60));
	}
	
	private static double avg2(Predicate<Student> pr) {
		int count = 0, sum = 0;
		for (Student s : list) {
			if (pr.test(s)) { //t.getEng()>=60 인 경우 true
				count++;sum += s.getMath(); }
			}
			return (double) sum / count;}
		
//		Predicate<Student> pr = (s) -> { return s.getEng() >= 60;}
		/*
		 * boolean test(Student s) { return s.getEng() >= 60; }
		 */
	
	
	private static double avg1(Predicate<Student> pr) {
		int count = 0, sum = 0;
		for (Student s : list) {
			if (pr.test(s)) { // t.getEng()>=60 인경우 true
				count++;
				sum += s.getEng();		} }
		return (double) sum / count;	} }

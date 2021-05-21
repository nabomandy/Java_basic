package ch18_lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Predicate 인터페이스 :
 * 매개변수 존재, 리턴값은 boolean 인 함수 test 메서드를 가지고 있음.
 * 매개값 조사해 true 또는 false를 리턴할 때 사용
 */
public class LambdaEx10 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 55, 60, "컴공"),
			new Student("이몽룡", 95, 90, "국어"),
			new Student("김삿갓", 75, 80, "심리"),
			new Student("임꺽정", 65, 70, "전자"),
			new Student("홍길동", 65, 0, "컴공")
			);
	
	public static void main(String[] args) {
		System.out.println("컴공과 학생의 영어 평균 :"
				+ avgEng(t ->t.getMajor().equals("컴공")));
		System.out.print("컴공과 학생 이름 :");
		nameList(t->t.getMajor().equals("컴공"));
		System.out.println("컴공이 아닌 학생의 영어 평균 :"
				+ avgEng(t->!t.getMajor().equals("컴공")));
		System.out.print("컴공이 아닌 학생 이름:");
		nameList(t->!t.getMajor().equals("컴공"));
	}
	


	private static void nameList(Predicate<Student> pr) {
		for (Student s : list) {
			if (pr.test(s)) { System.out.print(s.getName() + ",");
		} }
		System.out.println();
	}
	
	private static double avgEng(Predicate<Student> pr) {
		int count = 0,
		sum = 0;
		for (Student s : list) {
			if (pr.test(s)) {
				count++;
				sum += s.getEng();
			}
		}
		return (double) sum / count;
	}

}
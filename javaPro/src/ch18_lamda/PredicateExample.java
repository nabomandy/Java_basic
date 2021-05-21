package ch18_lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/* Predicate
 * 매개값 조사해 true 또는 false를 리턴할 때 사용
 */
public class PredicateExample {
	static class Student {
		private String name;
		private String sex;
		private int score;
		
		public Student(String name, String sex, int score) {
			this.name = name;
			this.sex = sex;
			this.score = score;
		}
		
		public String getSex() {
			return sex;
		}
		public int getScore() {
			return score;
		}
	}
	
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", "남자", 90),
			new Student("김순희", "여자", 90),
			new Student("김자바", "남자", 95),
			new Student("박한나", "여자", 92) );
	
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for(Student student : list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		
		return (double) sum / count;
	}
		
	public static void main(String[] args) {
		double maleAvg = avg( t -> t.getSex().equals("남자"));
		System.out.println("남자 평균 점수: " + maleAvg);
		
		double femaleAvg = avg( t -> t.getSex().equals("여자"));
		System.out.println("여자 평균 점수: " + femaleAvg);
	}
}

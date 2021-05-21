package ch19_strea;

import java.util.Arrays;
import java.util.List;

public class MapEx2 {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30)
		);
		
		studentList.stream()
//			.mapToInt(Student :: getScore)
			.mapToInt(s -> s.getScore())
			.forEach(score -> System.out.println(score));
	}
}

class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}


//	@Override
//	public String toString() {
//		return super.toString();
//	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
}
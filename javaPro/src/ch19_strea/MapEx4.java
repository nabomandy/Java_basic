package ch19_strea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//public class KICStudentEx1_1 {
//	static Set<KICStudent> col = new HashSet();
//	
//	public static void main(String[] args) throws FileNotFoundException {
//		Scanner sc = new Scanner(new File("src/ch14_collection/KICStudent.txt"));
//		//파일을 읽어서 collection에 저장 합니다.
//		while(sc.hasNext()) {col.add(new KICStudent(sc.next())); }
//		System.out.println("총학생수:" + col.size());
//		int grade = 1; //1학년 학생의 총점 높은 순으로 5명 프린트.
//		printGrade(grade);	}
//	
//	public static void printGrade(int grade) {
//		List<KICStudent> gradeli = new ArrayList();		
//		
//		for (KICStudent stu : col) {
//			if(stu.grade==grade) gradeli.add(stu); 		 }
//		
//		 Collections.sort(gradeli);
//		 	System.out.println(grade+"학년:    인원:" + gradeli.size());
//		 	System.out.println("학년 \t학번 \t이름 \t국어 \t영어 \t수학 \t총점");
//		 	System.out.println("===================================================");
//		 	
//		 	for (int rank = 0 ; rank < 5 ; rank++) {
//		 		System.out.println(gradeli.get(rank));
//		 		}	}}
class KICStudent implements  Comparable<KICStudent>{
	public int grade;
	public int sno;
	public String name;
	public int kor;
	public int eng;
	public int math;
	public int total;
	public KICStudent(String line) {
		String[] str = line.split(",");
		this.grade = Integer.parseInt(str[0]);
		this.sno = Integer.parseInt(str[1]);
		this.name = str[2];
		this.kor = Integer.parseInt(str[3]);
		this.eng = Integer.parseInt(str[4]);
		this.math = Integer.parseInt(str[5]);
		this.total = kor+eng+math;	}
	
	@Override
	public int compareTo(KICStudent tmp) {
	return tmp.total-total; //-->이 부분도 틀렸다 왜 인지 확인하자 오버라이딩 부분은 전반적으로 외워서 한 게 크다. 공부해라.
}
	@Override
	public int hashCode() { 
		return sno+name.hashCode();
	}
	@Override		
	public boolean equals(Object obj) {
		if(obj instanceof KICStudent) {
			KICStudent s = (KICStudent)obj;
			return sno==s.sno && name.equals(s.name);  //-->ㅊ sno==s.sno 이 부분을 내가 틀렸는데. 참조를 써야되는데 기본을 써서 그렇다고 한다. 체크하자.
		}	
		else { return false;	}}
	@Override
	public String toString() {
		return grade + "\t" + sno + "\t" + name + "\t" + kor + "\t" +eng
				+ "\t" + math + "\t" + total;	}}


//같은 패키지안에 있으면, 위에 클래스 정보가다 다른 데 있어도 가능하다 -> 밑에거만 써서 만들어도 실현가능하다.
public class MapEx4 {
	public static void main(String[] args) throws IOException{
		BufferedReader br
		= new BufferedReader(new FileReader("src/ch14_collection/KICStudent.txt"));
		// 월별 판매 수량을 Map 객체로 생성하기
		
		System.out.println("학년 \t학번 \t이름 \t국어 \t영어 \t수학 \t총점");
		System.out.println("====================================");
		br.lines()
				.map(s -> new KICStudent(s))
				.filter(s -> s.grade==2)
				.filter(s -> s.kor < 50)
//				.sorted()//sorted를 쓰려면 comparable을 상속받아야 함
//				.sorted(new Comparator<KICStudent>() {
//					@Override
//					public int compare(KICStudent o1, KICStudent o2) {
//						return o1.kor - o2.kor;
//					}
//				})
				
//				.sorted((o1, o2) -> o1.kor - o2.kor) // Comparator로 한거
				.sorted((o1, o2) -> o1.name.compareTo(o2.name)) // name순으로 어센딩
				.limit(5)
				.forEach(s -> System.out.println(s));
		
		
//		long count = br.lines()	
//				.map(s -> new KICStudent(s))
//				.distinct() -> 중복값을 제거하는.
//				.count();
//		
//		int tgrade = 2;
//		System.out.println("총    " + count + "명");
//		System.out.println(tgrade + "학년    ");
//		BufferedReader br2
//		= new BufferedReader(new FileReader("src/ch14_collection/KICStudent.txt"));
//
//		System.out.println("학년 \t학번 \t이름 \t국어 \t영어 \t수학 \t총점");
//		System.out.println("====================================");
//		br2.lines()
//				.map(s -> new KICStudent(s))
//				.filter(s -> s.grade==tgrade)
//				.filter(s -> s.kor < 50)
//				.sorted()//sorted를 쓰려면 comparable을 상속받아야 함
//				.limit(5)
//				.forEach(s -> System.out.println(s));

	}
}


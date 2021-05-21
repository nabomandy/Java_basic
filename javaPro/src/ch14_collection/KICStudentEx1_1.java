package ch14_collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class KICStudentEx1_1 {
	static Set<KICStudent> col = new HashSet();
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("src/ch14_collection/KICStudent.txt"));
		//파일을 읽어서 collection에 저장 합니다.
		while(sc.hasNext()) {col.add(new KICStudent(sc.next())); }
		System.out.println("총학생수:" + col.size());
		int grade = 1; //1학년 학생의 총점 높은 순으로 5명 프린트.
		printGrade(grade);	}
	
	public static void printGrade(int grade) {
		List<KICStudent> gradeli = new ArrayList();		
		
		for (KICStudent stu : col) {
			if(stu.grade==grade) gradeli.add(stu); 		 }
		
		 Collections.sort(gradeli);
		 	System.out.println(grade+"학년:    인원:" + gradeli.size());
		 	System.out.println("학년 \t학번 \t이름 \t국어 \t영어 \t수학 \t총점");
		 	System.out.println("===================================================");
		 	
		 	for (int rank = 0 ; rank < 5 ; rank++) {
		 		System.out.println(gradeli.get(rank));
		 		}	}}
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

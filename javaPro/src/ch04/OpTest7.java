package ch04;

import java.util.Scanner;
/*
 * 삼항 연산자를 이용하기
 * 점수를 입력받아서 90이상이면 "A학점" 80이상이면 "B학점" 70DLTKDDLAUS "C학점"
 * 				60이상이면 "D학점" 그 외는 "F학점" 출력하기
 */

public class OpTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();

		
		//System.out.println
		// ((num>=90) ? "A학점" : (num>=80) ? "B학점" : (num>=70) ? "C학점" : (num>=60) ? "D학점" : "F학점")))));
		
		System.out.println
		(score + "점수는 " + ((score>=90) ? "A" :
			(score>=80) ? "B" :
				(score>=70) ? "C" :
					(score>=60) ? "D" : "F"));
				
		
	}

}

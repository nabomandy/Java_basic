package ch05;


/*
 * if (조건식1) {
 * 	문장 1.... : => 조건식1의 결과가 참인 경우 실행 되는 문장
 * } else{
 * 문장 2... : => 조건식1의 결과가 거짓인 경우 실행 되는 문장
 * }
 * 
 * if((조건식1) {
 * 	문장 1.... : => 조건식1의 결과가 참인 경우 실행되는 문장
 * } else if(조건식2) {
 * 	문장 2 ... => 조건식 1의 결과가 거짓이고 조건식2가 참인 경우 실행되는 문장
 * } else if(조건식3) {
 * 	문장 3 => 조건식 1, 조건식 2의 결과가 거짓이고 조건식 3의 결과가 참인 경우 실행되는 문장
 * }...
 * }else {
 * 	문장 => 모든 if 구문의 결과가 거짓인 경우 실행되는 문장
 * }
 * 
 * 실행되는 문장이 한문장인 경우 {} 생략 가능
 */

import java.util.Scanner;

public class ifEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt(); //80
		if(score >= 60) System.out.println("합격을 축하합니다.");
		else	System.out.println("다음에 오세요.");
		// 90이상이면 "A학점" 80이상이면 "B학점" 70이상이면 "C학점" 
		//	60이상이면 "D학점" 그 외는 "F학점" 출력하기
		
		if(score>=90) {System.out.println("A학점 입니다.");
		}else if(score >= 80) {System.out.println("B학점 입니다.");
		}else if(score >= 70) {System.out.println("C학점 입니다.");
		}else if(score >= 60) {System.out.println("D학점 입니다.");
		}else {System.out.println("F학점 입니다.");		
		}

	}
}
	

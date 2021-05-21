package ch05;

import java.util.Scanner;

/* 입력된 포인트에 가능한 모든상품을 프린트 하세요
 * 0 ~ 199 : 상품이 없습니다.
 * 200 ~ 399 : 새우깡
 * 400 ~ 599 : 핸드폰
 * 600 ~ 799 : 컴퓨터
 * 800 ~ 999 : 자동차
 * 
 * 850: 자동차,컴퓨터,핸드폰,새우깡
 * 730: 컴퓨터, 핸드폰,새우깡
 * 160: 상품이 없습니다.
 * 
 */

public class Exam15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("포인트를 입력하세요(1 ~ 1000) exit(9999)");
		int point = 0;
		while(true) {
			point = scan.nextInt();
			if(point==9999) { System.out.println("exit"); break;}
			switch(point/200) {
			case 0 :System.out.println("상품이 없습니다 ");
			break;
			case 4 : System.out.print("자동차,");
			case 3 : System.out.print("컴퓨터,");
			case 2 : System.out.print("핸드폰,");
			case 1 : System.out.println("새우깡");
			
			}
					
		}

	}

}

package ch04;

import java.util.Scanner;
/* 
 * 12345 초가 몇시간 몇분 몇초인지 출력하기
 * 결과
 * 3시 25분 45초
 */

public class OpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num = 0;
			
			System.out.println("계산할 초를 입력하세요");
			Scanner scan = new Scanner(System.in);
			num = scan.nextInt();
			
			System.out.print(num / 3600 + "시 ");
			System.out.print((num % 3600)/60 + "분 ");
			System.out.println(num % 60 +"초 ");
			
	}

}

package ch05;

import java.util.Scanner;

/*
 * 입력받은 숫자가 좌우대칭수인ㅋ지 판단하기
 * 숫자를 입력하세요
 * 121
 * 좌우대칭수
 * 123
 * 좌우대칭수아님
 */

public class DayByMonthTest {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		String str = scan.next();
		int index = str.length()-1;
		
		boolean chk = true;
		for (int i = 0 ; i < index/2 ; i++) {
		//	System.out.println(str.charAt(i)+ ":" + str.charAt(index-1));
		
		
		if(str.charAt(i)!=str.charAt(index-1)) {
			chk=false;
		}
		}
		
		if(chk) {
			System.out.println("좌우대칭수 ");
		}else {
			System.out.println("좌우대칭수아님");
		
		
			}
				

	}

}

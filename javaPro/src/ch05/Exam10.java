package ch05;

import java.util.Scanner;

/*
 * 화면에 삼각형 높이를 입력받고, 높이에 맞는 *로 삼각형 출력하기
 * [결과]
 * 삼각형의 높이를 입력하세요
 * 3
 * *
 * **
 * ***
 * ***
 * **
 * *
 * 
 * 삼각형의 높이를 입력하세요
 * 
 * 5
 * *		: 1
 * **		: 2
 * ***		: 3
 * ****		: 4
 * *****	: 5
 * *****
 * ****
 * **
 * *
 */


public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int i=0;
		
		for (i=1 ; i <=len ; i++) {
			
			for (int j =1 ; j<=i ; j++) {
				
				System.out.println("*");
			}
			System.out.println();
		}
		
		for (i=0; i < len ; i++) {
			for (int j =1; j <=len-i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}


	}

}

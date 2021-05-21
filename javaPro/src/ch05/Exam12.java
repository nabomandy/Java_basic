package ch05;

import java.util.Scanner;

/*
 * 화면에 삼각형 높이를 입력받고, 높이에 맞는 *로 삼각형 출력하기
 * 3
 *   *
 *  ***
 * *****
 * 
 * 
 */

public class Exam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
	
		int bottom = len * 2 - 1;
		int m = bottom / 2;
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < bottom; j++) {
				if(j >= m - i && j <= m + i)
					System.out.print("*");
				else
					System.out.print(" ");
				}
			System.out.println();
		}
		
		
		
	}
				
		

	}

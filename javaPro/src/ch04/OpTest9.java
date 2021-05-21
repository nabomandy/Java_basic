package ch04;

import java.util.Scanner;
/*원의 반지름을 입력받아 면적과 둘레를 구하시오
 * 반지름 : 5
 * 반지름 :5
 * 
 * [힌트]-워주율은 3.141592
 * 
 * [결과] 면적 = 78.5398 	둘레 = 31.41592
 */


public class OpTest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("반지름을 입력하세요");
		Scanner scan = new Scanner(System.in);
		double pi = 3.141592;
		int r = scan.nextInt();
		System.out.println("면적:" + (r*r*pi));
		System.out.println("둘레:" + (r*2*pi));
		
		
	}

}

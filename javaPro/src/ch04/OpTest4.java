package ch04;

import java.util.Scanner;

/*
 * 숫자를 입력 받아서 양수인 경우는 양수로, 음수인 음수로, 0인 경우는 0 출력하기 :
 * 삼항연산자를 이용하세요.
 */




public class OpTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println((num>0) ? "양수" : (num==0) ? "0" : "음수");
		System.out.println((num>0) ? "양수" : (num<0) ? "음수" : "0");
	}

}

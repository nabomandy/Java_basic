package ch05;

import java.util.Scanner;
/*
 * 조건문 if를 이용하여
 * 숫자를 입력받아 양수인 경우 "양수", 음수인 경우 "음수", 0인 경우는 "0" 출력하기
 */

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. ");
		int num = scan.nextInt();
		if(num>0) {System.out.println("양수");
		}else if (num<0) {System.out.println("음수");
		}else if (num==0) {System.out.println("0");
		}

	}

}

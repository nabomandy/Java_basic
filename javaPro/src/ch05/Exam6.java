package ch05;

import java.util.Scanner;

/*
 * 숫자로 이루어진 문자열을 입력받아 각 자리수 합을 구하기
 * String str =scan.next(): 	//123
 * str.length() : 3. 문자열 길
 * str.charAt(0) => '1' --> int 49
 * str.charAt(1) => '2'
 * str.charAt(2) => '3'
 * str.charAt(3) => 사용안됨
 * for i < str.length() 구문 이용
 */

public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자열을 입력하세요");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		int i=0;
		int sum =0;
		while(i<str.length()) {
			sum+=(str.charAt(i)-'0');
			i++;	}
		System.out.println("자리수 합 :" +sum);
		
		i=0; sum =0;
		for(i=0;i<str.length();i++) {
			//sum+=(str.charAt(i)-48);
			sum+=(str.charAt(i) - '0');
		}
		System.out.println("자리수 합 :"+sum);
			
		}
		
		
	}



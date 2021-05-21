package ch05;

import java.util.Scanner;

/*
 * 화면에서 자연수를 입력받아 각각의 자리수의 합을 구하기.
 * [결과]
 * 자연수를 입력하세요
 * 123
 * 자리수 합 : 6
 * 자연수를 입력하세요
 * 1357
 * 자리수 합 :16
 * [알고리즘]
 * num=0
 * i = num%10
 * sum +=i;
 * num /=10
 */


public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자연수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int sum = 0; //3+2+1
		int value = num; //123
		while(value != 0) {
			sum += value%10;
			value /= 10; //12 ->1
		}
		System.out.println("자리수 합 :" + sum);
		sum=0;
		
		value = num;
		
		for ( ; value!=0 ;value /= 10) {
			sum += value%10;
		}
				
		System.out.println("자리수 합 :" + sum);
		
		

	}

}

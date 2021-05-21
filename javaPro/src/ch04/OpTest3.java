package ch04;

import java.util.Scanner;

/*
 * 화면에서 금액을 입력받아 500,100,50,10,1 원 동전으로 바꾸기
 * 필요한 동전의 갯수를 출력하기
 * [결과]
 * 금액을 입력하세요
 * 5641
 * 500원 : 11개
 * 100원 : 1개
 * 50원 : 0개
 * 10원 : 4개
 * 1원 : 1개
 */

public class OpTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin;
		System.out.println("금액을 입력하세요");
		Scanner scan = new Scanner(System.in);
		coin = scan.nextInt(); //5641
		
		System.out.println(coin/500 + "개"); //-> 내가 해본거
		
		System.out.println("500원" + coin/500+ "원");
		System.out.println("100원" + coin%400/100 + "원");
		System.out.println("50원" + coin%100/50 + "원");
		System.out.println("10원" + coin%50/10 + "원");
		System.out.println("1원" + coin%10 + "원");
		
		
		
		
		
	}

}

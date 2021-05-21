package ch05;

import java.util.Scanner;

/*
 * 숫자 맞추기 게임
 * 컴퓨터가 1부터 100사이의 임의의 값을 저장하고 있고,
 * 사용자는 반복적으로 숫자를 입력해서 저장된 숫자를 맞추기.
 * 숫자를 맞추면 프로그램 종료하기.
 * 		
 */
		
public class LoopEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 컴퓨터의 임의의 수 저장
		/*Math.random() : 난수. 임의의 수 리턴
		 * 		0 <= Math.random() < 1.0
		 * 		0 <= Math.random() * 100 < 100.0
		 * 		0 <= (int)Math.random() * 100) < 100
		 * 		1 <- (int)Math.random() * 100 + 1 <=100
		 */
		//ans : 1부터 100사이의 임의의 수 저장하는 변수
		
		int ans = (int)(Math.random() * 100) +1 ;
	//	System.out.println(ans);
		Scanner scan = new Scanner(System.in);
		int input;
		int cnt=0;
		do {
			System.out.println("1 ~ 100 사이의 숫자를 입력하세요");
			input = scan.nextInt();
			if(ans > input) {
				System.out.println("더 큰 수 입니다.");
			} else if (ans < input) {
				System.out.println("더 작은 수 입니다.");
			} else {
				System.out.println("정답입니다..");
			}
			cnt++;
			} while(ans != input);
				System.out.println("횟수 : " + cnt);		
			}
	}

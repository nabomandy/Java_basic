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

public class Exam13 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		
		int result = 0;
		int temp = num;
		
		//12321
		
		while(temp !=0 ) {      // 0이 아니니까 성립
			result *=10;       //  -> 0*10 =0
			result += temp%10; //   12321%10=1 --> 1
			temp /= 10;        //12321/10=1232 -->1232
		}
		
		//1: r:0 -> r:1 t:1232
		//2: r:10-> r:12. t:123
		//3: r:120 -> r:123, t:12
		//4: r:1230 -> r:1232 , t:1
		//5: r:12320 --> 1232, t:1
		//5: r:12320 --> 12321, t:0 
		//end
		
		if(num ==result) {
			System.out.println("좌우대칭수 ");
		}else {
			System.out.println("좌우대칭수아님");
		
		
			}
				

	}

}

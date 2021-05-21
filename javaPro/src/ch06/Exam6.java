package ch06;

import java.util.Scanner;

/*16진수로 변환할 10진수를 입력하세요
 * 10:A, 11:B, ... 
 */
public class Exam6 {
		
	public static void main(String[] args) {
		char[] data =
			{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		System.out.println("16진수로 변환할 10진수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		char[] binary = new char[32]; //실제 int가 32비트여서 32를 쓴다. int가 4바이트니까.
	//  int           = new int	
		int divnum = num, index = 0;
		
		while (divnum !=0) {
			binary[index++] = data[divnum % 16];
			divnum /= 16;                 // 8
					// 8
		}
		System.out.println(index);
		System.out.print(num + "의 16진수 :");
		
		for(int i=index -1; i>=0; i--) {
			System.out.print(binary[i] + " ");
		}
		
		
		
	}

}

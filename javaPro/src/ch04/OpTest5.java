package ch04;

import java.util.Scanner;

/*
 * 한개의 문자를 입력 받아서 소문자인 경우는 대문자로 변경하여 출력하기 :
 * 소문자가 아닌 경우는 "소문자 아님" 출력하기
 * Scanner scan = new Scanner(system.in);
 * Sting str = scan.next();
 * char ch = str.charAt(0)
 * ch 범위 : 'a'<= ch <= 'z'
 * 대문자 = 소문자-32; -> 97-32를 하면 대문자A가 된다는 의미라고 한다.
 * [결과]
 * 한개의 문자를 입력하세요
 * a
 * A
 * 
 * 한개의 문자를 입력하세요
 * 1
 * 소문자아님
 * 
 * int와 char의 관계를 잘 알아야 함.
 */




public class OpTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("한개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String str = scan.next(); // 문자열로 입력받기. "A"
		char ch = str.charAt(0); // 문자열 중 첫번째 문자 'A'
		
		String result = (ch>='a' && ch <='z') ? (char)(ch-32) + "" : "소문자아님";
		System.out.println(result);
		System.out.println
			((ch>='a' && ch<= 'z') ? (char)(ch-32) : "소문자아님");
		
		
	}

}

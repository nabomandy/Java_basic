package ch05;

import java.util.Scanner;

/*
 * 키보드에서 한개의 문자를 입력받아서 대문자, 소문자, 숫자, 기타문자를 출려하기
 * [결과]
 * 한개의 문자를 입력하세요
 * A
 * 대문자 ('A' <= ch <= 'Z')
 * 한개의 문자를 입력하세요
 * c
 * 소문자 ('a' <= ch <= 'z')
 * 한개의 문자를 입력하세요
 * 3
 * 숫자 ('0' <= 초 <= '9')
 * 한개의 문자를 입력하세요
 * -
 * 기타문자 : 그 외.
 * 
 */


public class Exam2 {

	public static void main(String[] args) {
		System.out.println("한개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		 if(ch>='A' && ch<= 'Z') {System.out.println("대문자");
		}else if(ch>='a' && ch<= 'z') {System.out.println("소문자");
		}else if(ch>='0' && ch<= '9') {System.out.println("숫자");
		}else {System.out.println("그 외.");
		}
		
		
		
		
		
		
		
		
	}

}

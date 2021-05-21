package ch06;
/*
 * command 라인에서 파라미터 받기
 * javac ArrayEx6.java
 * c :\aaa\> java ArrayEx6 홍길동 김삿갓
 * 
 * 
 * 
 *  실행방법
 *  
 *  우클릭
 */


public class ArrayEx6 {

	public static void main(String[] args) {
		System.out.println(args.length);
		if(args.length == 0)	{
			System.out.println("커맨드라인에 파라미터를 입력하세요");
			System.out.println("java chap6.ArrayEx6 홍길동 김삿갓"); 
			return;
		}
		for(int i=0;i<args.length;i++) {
			System.out.println("args[" + i + "]=" + args[i]);
		}
		
	}

}

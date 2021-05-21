package ch05;

/* for
 * 		for(초이값:조건식:증감식) {   ... }
 * 		주로 시작과 종료가 지정된 경우. 순차적 처리,
 * while
 * 		while(조건식) {  ... }
 * 		비순차적이지 않을 때.
 * 		exit 문자가 입력될 떄까지, 9문자가 입력될 때까지
 * do while
 * 		do { ...  } while(조건식);
 * 		비순차적이지 않을때.
 * 		조건에 상관없이 한번은 문장을 실행 할 때.	
 */

public class LoopEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.print(5);
		System.out.println("for 구문으로 1 ~ 5까지 출력하기");
		for (int i = 1; i <= 5; i++ ) {
			System.out.print(i);
		System.out.println();
		System.out.println("while 구문으로 1 ~ 5까지 출력하기");		
		i = 1;
		while (i <= 5) {
			System.out.print(i);
			i++;
		System.out.println();
		System.out.println("do while 구문으로 1~5까지 출력하기");
		i= 1;
		do {
			System.out.print(i); //12345
			i++; //6
		} while (i <= 5);
		System.out.println();
		
		}
			
			
			
			
		}
			
			
		}
		
		
		
		
	}



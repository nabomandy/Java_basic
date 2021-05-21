package ch05;

/*1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610 ,987
 * 피보나치 수열에서 값이 1000이전의 수까지 프린트 하세요
 */

public class Exam16 {

	public static void main(String[] args) {

	int first = 1;
	int second = 1;
	int element = 1; //-> 숫자만 들어가면 되는거 0이어도 된다
	System.out.print(first+",");
		
	while(element<1000) {
		System.out.print(second+",");
		element=first+second;
		first = second;
		second = element;
		
		
	}
	System.out.println();
		
	}

}

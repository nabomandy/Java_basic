package ch05;

/*
 * 중첩반복문 : 반복문 내부에 반복문이 존재.
 * 			구구단 가로 출력하기 : 신준호
 * 
 * 
 * 2*2=4 3*2=6 ... 9*2=18
 * 2*3=6 3*3=9
 */


public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i =2; i <= 9; i++) {
			System.out.print(i + "단\t" );
		}
		System.out.println();
		for (int i = 2; i <= 9; i++) {
			for (int j =2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + (j*i) + "\t");
			}
			System.out.println();
		}
}
}
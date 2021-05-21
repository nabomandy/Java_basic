package ch04;
/*
 * 산술 연산
 *  / : 나누기 연산자
 *  	정수 = 정수 / 정수
 *  % : 나머지 여산자
 *  	나머지연산의 결과값의 부호 피젯수의 부호와 같다.
 */
public class OpEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10/8); //1
		System.out.println(10/-8); //-1
		System.out.println(-10/8); //-1 
		System.out.println(-10/-8); //1
		
		System.out.println(10%8); //2 앞에 나눠지는 수에 따라 부호가 정해진다
		System.out.println(10%-8); //2
		System.out.println(-10%8); //-2
		System.out.println(-10%-8); //-2
		
		
		
	}

}

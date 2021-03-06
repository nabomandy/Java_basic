package ch04;
/*
 * 비트연산자 : &(and), |(or), ^(XOR), ~(not) : 정수값,
 */
public class OpEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("6 & 3 = "+(6 & 3));
		/*
		 *  6 : 0110 -> 이진수
		 *  3 : 0011
		 *  --------
		 *  &	0010 : 2 둘다 1이어야지 1이 되는 거.
		 */
		System.out.println("6 | 3 = "+(6 | 3));
		/*
		 *  6 : 0110
		 *  3 : 0011
		 *  --------
		 *  | : 0111 : 7 -> 둘중에 하나라도 1이면 1이 되는 거.
		 */
		System.out.println("6 ^ 3 = "+(6 ^ 3));
		/*
		 * 6 : 0110
		 * 3 : 0011
		 * --------
		 * ^ : 0101 : 5 -> 둘이 같으면 0 다르면 1. 딥러닝 할때 XOR 많이 씀
		 */
		System.out.println("~10 =" + ~10);//--11
		/*
		 * 10 : 00001010 ->실제로는 32개 비트 0000000000000----1010 이부분은 내일 다시 물어보자
		 * -------------
		 * ~ : 11110101 : ?
		 * 
		 * 
		 */
	}

}

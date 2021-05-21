package ch04;

public class OpEx4 {
/*
 * 논리부정 연산자 : !
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(true);
		System.out.println("!true="+!true);
		System.out.println("false="+!false);
		int x=100;
		System.out.println("(x < 200="+ (x < 200));
		System.out.println("!(x < 200" + !(x < 200));
		System.out.println("!( 5 % 2 ==0)=" + ! (5 % 2 ==0)); // %는 나머지의 의미 !는 not의 의미
		System.out.println("(5 % 2 !=0)=" + ( 5 % 2 !=0));
		
		
		
	}

}

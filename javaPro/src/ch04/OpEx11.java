package ch04;

public class OpEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 10000000 * 1000000;
		long b = 1000000 * 1000000L;
		
		System.out.println("a=" + a); //int type overflow
		System.out.println("b=" + b); //long type 값이 유지 된다.
	}

}

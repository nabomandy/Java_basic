package Doit;

public class OperationEx5 {

	public static void main(String[] args) {

		
		int num1 = 5 ;
		int num2 = 10;
		
		int result = num1 & num2;
		System.out.println(result);
		
		int num3 = 5;
		System.out.println(num3 << 1); //한번 밀때마다 2의 n제곱만큼 값이 커진다.
		System.out.println(num3);
		
		System.out.println(num3 <<= 1);
		System.out.println(num3);
		
		
	}

}

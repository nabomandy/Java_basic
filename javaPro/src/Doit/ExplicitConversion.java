package Doit;

public class ExplicitConversion {

	public static void main(String[] args) {

		
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);  //-1바이트만 표현되서 이상하게 나오는 거
		
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum);
		float fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum;
		int num2 = (int)(dNum + fNum);
		
		System.out.println(num1);
		System.out.println(num2);

	}

}

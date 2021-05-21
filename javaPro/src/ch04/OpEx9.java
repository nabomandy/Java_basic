package ch04;
/*
 * 대입 연산자 :
 * 인트이하인 애가 연산자를 만나면 인트가 된다
 */
public class OpEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;
		System.out.println(num);
		num += 10; //num = num + 10;
		System.out.println(num);
		num /= 10; //num = num / 10;
		System.out.println(num);
		num *= 2+3; //num = num * (2+3);
		System.out.println(num);
		
		byte b =1;
		b *= 2; 
		b= (byte) (b*2);  //int 이하의타입이 연산자를 만나면 int가 됨. 따라서 캐스팅을 꼭 해야 에러가 안난다.
		System.out.println(b); //4
		b *= 2;
		System.out.println(b); //8
		b *= 2;
		System.out.println(b); //16

	}

}

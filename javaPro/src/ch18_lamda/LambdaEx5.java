package ch18_lamda;

/*
 * 람다식의 객체는 내부객체로 표현된다.
 * local 변수를 local inner class 내에서 사용시에는 final 변수여야 한다.
 */
interface LambdaInteface5 {
	void method();
}

class Outer {
	public int iv = 10;
	
	void method() {
		int iv = 40;
		LambdaInteface5 f5 = () -> {
			
//			iv = 50; //상수화 필요
			System.out.println("Outer.this.iv=" + Outer.this.iv);
			System.out.println("this.iv=" + this.iv);
//			Outer 클래스의 iv 멤버
			System.out.println("iv=" + iv);
		};
		f5.method();
	}
}

public class LambdaEx5 {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();

	}

}

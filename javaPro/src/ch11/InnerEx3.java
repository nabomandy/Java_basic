package ch11;

/*
 * 내부클래스 객체에서 사용되는 this
 */
class Outer3 {
	int iv= 10;
	int iv2 = 20;
	
	class InstanceInner {
		int iv = 100;
		
		void method1() {
			int iv = 300;
			
			System.out.println("iv=" + iv);		//10
			System.out.println("this.iv=" + this.iv);	//100
//			Outer3.this.iv : Outer3 클래스의 멤버 변수 iv 값
			this.iv = 50; //변경가능
			System.out.println("Outer3.this.iv=" + Outer3.this.iv); //10
		}
	}
}
public class InnerEx3 {
	public static void main(String[] args) {
		Outer3 out = new Outer3();
		Outer3.InstanceInner ii = out.new InstanceInner();
		Outer3.InstanceInner ii2 = new Outer3().new InstanceInner(); // 위에 거랑 같은 말임 ii2를 안써서 밑줄 그어져 있는거.
		ii.method1();
	}

}

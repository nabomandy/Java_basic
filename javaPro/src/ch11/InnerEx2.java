package ch11;

class Outer2 {
	private static int outercv = 20;
	static StaticInner cv = new StaticInner();
	static InstanceInner cv2 = new Outer2().new InstanceInner();
	static class StaticInner {
		int siv = new Outer2().outeriv;
		static int scv = outercv;}
	static StaticInner iv2 = new StaticInner(); //instance이너는 안되지 왜?
	private int outeriv = 10;
	class InstanceInner {
		int iiv = outeriv;
		int iiv2 = outercv;
	}

	void method(int pv) {  //워래는 final int pv 라고 쓰는 게 맞다. 생략이 된거.
		//!!!!!지역내부 클래스에서 아용되는 메서드의 지역변수는 상수화(final) 되어야 한다.
		int i = 0;
		// pv++;	->이걸 쓰면 상수가 아니네라고 생각해서 에러가 난다.
		// i++
		outeriv++;
		class LocalInner { //지역내부클래스
			int liv = outeriv;
			int liv2 = outercv;
			void method() {
				//지역내부클래스에서 내부클래스가 속한 메서드의 지역변수 변겨 안됨
				//i = 100;
//				pv++;
				System.out.println("i=" + i);
				System.out.println("pv=" + pv);
				System.out.println(liv + "," + liv2);
				System.out.println(outeriv + "," + outercv); //외부클래스의 private 멤버 접근 가능
			}
		}
		LocalInner li = new LocalInner();
		li.method();	}}

public class InnerEx2 {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.method(1);
		System.out.println("======================");
		Outer2.InstanceInner i2 = out.new InstanceInner();
		System.out.println(i2.iiv);
		System.out.println(i2.iiv2);
		Outer2.StaticInner i3 = new Outer2.StaticInner();
		System.out.println(i3.siv);
		System.out.println(Outer2.StaticInner.scv);

	}

}


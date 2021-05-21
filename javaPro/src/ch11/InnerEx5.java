package ch11;

/* InnerEx4 복사본, I랑 abs 는 삭제함. 같은 패키지에 있어서 중복됨.
 * 무명의 내부 클래스
 */
public class InnerEx5 {
	public static void main(String[] args) {
		int iv = 9999;
				
		I i = new ISub() ;
		i.test();
		// iv 멤버는 I 인터페이스의 멤버가 아니므로 접근ㅂ불가
//		// System.out.println(i.iv;); //error
		
		//iv++;
		// 무명의 내부 클래스는 지역내부클래스임.
		// 지역변수는 상수화가 필요함.
		Abs a = new AbsSub() ; //->{} 를 재정의했기떄문에 ;를 쓴거. 큰 생성자라고 생각하면 된다.=
		a.test();
	}}


class ISub implements I{
	int iv = 100;
	@Override
	public void test() {
		System.out.println("iv=" + iv);
		System.out.println("this.iv=" + this.iv);
		System.out.println("I 내부 클래스의 test 메서드");
	}
}

class AbsSub extends Abs {
	@Override
	void test() {
		System.out.println("iv=" + iv); //지역변수 iv 출력 ->이사 간데는 iv가 없어서 에러
		System.out.println("Abs 내부 클래스의 test메서드");
	}
}
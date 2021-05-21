package ch08;
/*
 * 추상클래스간의 상속도 가능함.
 * 추상클래스가 자손 클랫인 경우 부모의 추상메서드를 재정의 하지 않아도 됨.
 * 단 추상 클래스를 상속받은 일반 클래스는 모든 추상 메서드를 구현해야함.
 */
abstract class Abs1 {
	int a = 10;
	protected abstract int getA(); }

abstract class Abs2 extends Abs1 {
	int b = 20;
	protected abstract int getB();}

class Normal extends Abs2 {
	@Override
	protected int getB() {
		return b;
	}
	@Override
	public int getA() {
		return a;
	//getA 하고 컨트롤 스페이스바 하면 override 생성 나옴
	//오버라이드 안쓰고 Normal에 마우스 갖다대고 생성하기
		
		
	}
}


public class AbstractEx1 {
	public static void main(String[] args) {
		Abs1 a1 = new Normal();
		System.out.println(a1.getA()); //10
		//System.out.println(a1.getB()); erroe.getB()멤버는Ans1이 멤버가 아니ㅣㅁ
		Abs2 a2 = (Abs2) a1;
		System.out.println(a2.getA()); //10
		System.out.println(a2.getB()); //20
		Normal n = (Normal) a2;
		System.out.println(n.getA()); //10
		System.out.println(n.getB()); //20
//		a2 = new Abs2(); //error. 추상클래스는 객체화 불가.

	}
}

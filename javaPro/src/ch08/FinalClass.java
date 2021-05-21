package ch08;

//final 제어자 : 변경 불가의 의미.
//final 클래스 : 상속 불가 클래스.
//			   다른 클래스의 부모클래스 불가.
//			   String 클래스가 final 클래스임.
//             상속을 줄수는 없고 받을 수 만 있다.
public final class FinalClass { //final class 여서 상속이 안된다. 그래서 9번에 에러가난다.
//public class FinalClass { //-> 이렇게 되면 에러가 안난다.
//public final class FinalClass extends Aaa { 상속을 받을 수는 있다
class SubClass extends FinalClass{
	}

}

//class Aaa {}
package ch09_interface;

/*
 * 1. Animal 클래스 => 추상클래스
 *    멤버변수 : 이름(name)
 *    생성자 : name을 입력받아 멤버 변수 초기화
 *    멤버메서드 : 
 *    	 void eat(); => 추상메서드
 *  
 * 2. interface Flyable
 * 	  멤버 메서드 : void fly(); -> 디폴트도 아니고 스태틱도 아님 -> 추상메서드
 * 3. Dove 클래스 : Animal 클래스, Flyable의 자손 클래스
 * 	  멤버 없음
 * 4. Monkey클래스 : Animal 클래스의 자손클래스
 * 	  멤버 없음
 * 	
 */

abstract class Animal { 
	String name;
	
	Animal(String name) {
		this.name = name;
	}
	
	abstract void eat();
}

interface Flyable {
	void fly();
}

class Dove extends Animal implements Flyable {
	Dove() { super("비둘기");
	}
	
	@Override
	public void fly() {
		System.out.println(name + "은 날아 다니는 새입니다.");
	}
	@Override
	void eat() {
		System.out.println(name + "는 작은 벌레를 잡아 먹는다.");
	}
}

class Monkey extends Animal {
	Monkey() {
		super("원숭이");
	}
	void eat() {
		System.out.println(name + "는 나무에서 열매를 따 먹는다.");
	}
}

public class Exam1 {
	public static void main(String[] args) {
		Animal a = new Dove();
		a. eat();
		if (a instanceof Flyable) { //true
			Flyable f = (Flyable) a;
			f.fly();
		}
		a = new Monkey();
		a.eat();
		if (a instanceof Flyable ) {// false
			((Flyable) a).fly();
		}

	}

}

//
//abstract class Animal {
//	String name;
//}
//
//class interface extends Animal {
//	
//}

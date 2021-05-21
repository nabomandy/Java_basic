package ch08;

/*
 * 1. Animal 클래스 => 추상클래스
 *    멤버변수 : 동물의 종류(type), 다리수(leg)
 *    생성자 : 동물의 종류랑 다리수 입력받기.
 *    멤버메서드 :
 *    	void eat(); => 추상 메서드
 *      void sound(); => 추상메서드
 *      
 * 2. Dog클래스 : Animal 클래스의 자손클래스
 * 	  생성자의 매개변수 없음.
 * 	  멤버메서드 : 
 * 		void eat() : "주인이 주는대로 먹는다" 출력
 * 		void sound(); "멍멍";
 * 3. Lion클래스 : Animal 클래스 자손클래스
 * 	  생성자의 매개변수 없음.
 *    멤버메서드 :
 *    	void eat() : "초식 동물을 잡아 먹는다" 출력
 *    	void sound(); "어흥";
 *    
 */


//abstract c	lass Animal {
//	int type;
//	int leg;
//	abstract void eat();
//	abstract void sound();	
//}
//
//class Dog extends Animal {
//	Dog(int type) {
//		
//	}
//	
//}
//
//class Lion extends Animal {
//	
//}
abstract class Animal {
	String type;
	int leg;
	Animal(String type, int leg) {
		this.type = type;
		this.leg = leg; }
	abstract void eat();
	abstract void sound();
//	abstract void legs();
	}

class Dog extends Animal {
	Dog() {
		super("Dog", 4);
	}
	
	void eat() {    //-> 오버라이딩한 eat
		System.out.println("주인이 주는대로 먹는다.");
	}
	void sound() {  //-> 오버라이딩한 sound
		System.out.println("멍멍");
	}
//	@Override
//	void legs() {
//		System.out.println(leg);
//	}
}

class Lion extends Animal {
	Lion() {
		super("Lion", 4);
	}
	void eat() {
		System.out.println("초식동물을 잡아먹는다");
	}
//	@Override
	void sound() {
		System.out.println("어흥");
	}}
	

public class Exam4 {
	public static void main(String[] args) {
		Animal[] animal = new Animal[2]; //-> 애니멀 어레이로 만들어서 밑에 포문으로 돌리고 싶어서 이렇게 했다. 다르게도 가능은 하겠지.
		animal[0] = new Dog();   //-> 다형성
		animal[1] = new Lion();  //-> 다형성
		for (Animal a : animal) {
			System.out.println(a.type + "=>");
			a.sound();
			a.eat();
		}
	}
}

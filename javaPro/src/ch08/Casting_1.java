package ch08;

//부모 == 자식 -> 오토 캐스팅
//자식 == 부모 -> p가 어떻게 만들어졌느냐에 따라 에러가 날수도 안날수도


class Casting_1 {

	public static void main(String[] args) {
		Parent p = new Parent(); /// new FireEngine 이면 에러 안난다.
		Parent p2 = null;
		Child c = null;
		p.drive();
		c = (Child)p;		//8번째 줄. 컴파일은 ok. 실행 시 에러가 발생.
		//FireEngine을 볼 수가 없다.
		c.drive();
		p2 = c;
		p2.drive();
	}
}

class Parent {
	String color;
	int door;
	void drive() { //운전하는 기능
		System.out.println("drive, Brrrr~");
	}
	void stop() {	//멈추는 기능
		System.out.println("stop!!!");
	}
}

class Child extends Parent { // 소방차
	void water() { //물을 뿌리는 기능
		System.out.println("water!!!");
	}
}



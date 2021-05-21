package ch08;
/*
 * super() 생성자 : 부모클래스의 생성자 호출시 사용함
 */
class Super {
	int x;
	Super(int x) {
		this.x = x;
	}
}
class Child extends Super {
	int y;
	public Child() {
		super(10); //-> 이게 없으면 안되는 이유는 맨 위 클래스에서 디폴트값을 안줬기 때문이다.
	}
}

public class SuperEx {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.x);
	}

}

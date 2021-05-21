package ch07;

/*
 * 생성자도 오버로딩이 가능하다.
 */
class Car {
	String color; 
	int number;
	
	Car(String c, int n) {
		color = c; number = n;
	}
	//Car(String c, int n) {
	//color = c; number = n; -> 이렇게하면 자기 자신에게 넣는거라서 블럭내니까 결과가 null, 0 이렇게 나온다.
	
	//Car(String c, int n) {
		//this.color = c; this.number = n; -> 이렇게는 사용 가능 this 사용
	//파라미터에 잇는 로컬변수 이름과 클래스 영역의 변수가 같은 떄 this 를 사용?
	
	Car(String c) {
		color = c; number = 1;
	}
	
	Car(int n) { color="white";	number = n;
	}
	Car(Car c) { color = c.color; number = c.number;
	}
	
	public String toString() {
		return color + "," + number; 
	}
	
}

public class ConstructorEx2 {

	public static void main(String[] args) {
		Car c1 = new Car("blue", 1234);
		Car c2 = new Car("red");
		Car c3 = new Car(1234);
		Car c4 = new Car(c3);
		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);
		System.out.println("c3:" + c3);
		System.out.println("c4:" + c4);

	}

}

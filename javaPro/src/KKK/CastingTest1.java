package KKK;

public class CastingTest1 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new  FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car =fe;  //car=(Car)fe;
//		car.water();
		fe2 = (FireEngine)car; // 자손타입 <- 조상타입
		fe2.water();
	}
}

class Car {
	String color;
	int door;
	
	void drive() {//운전기능
		System.out.println("drive, Brrrr");
	}
	void stop() { //멈추는 기능
		System.out.println("stop!!!");
	}
}
class FireEngine extends Car { //소방차
	void water() { //물 뿌리는 기능
		System.out.println("water!!!");
	}
}

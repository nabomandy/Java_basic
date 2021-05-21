package ch08;
/*
 * 다형성 예제
 */
public class BikeEx2 {
	public static void main(String[] args) {
		AutoBike auto1 = new AutoBike(2);
		AutoBike auto2;
		Bike bike;
		auto1.power();
		System.out.println(auto1.drive());
		System.out.println("바퀴 + auto1.wheel" + "개가 굴러간다.");
		System.out.println(auto1.stop());

		bike = auto1;
		
		//bike.power();
		//bike.power;
		System.out.println("==============");
		System.out.println(bike.drive());
		auto2 = (AutoBike)bike;  //-> 캐스팅한것. 참조형 타입의 캐스팅. 참조형 타입은 상속간에만 가능하다.
		auto2.power();
		System.out.println(auto2.drive());
		System.out.println(auto2.stop());
	}

}

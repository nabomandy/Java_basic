package ch08;
/*
 * 다형성 예제
 * Buyer가 전자제품 구매하기
 * 
 * Product 클래스
 * 	멤버변수 : int 가격(price), int 포인트(point)  
 *  생성자(int price) : 가격을 입력받고, 가격의 10%를 포인트로 저장.
 * TV 클래스 (parent class : Product_
 * 	생성자(int price) : 가격을 price : 100설정하기
 *  toString() 메서드에서 Tv를 리턴.
 * Computer 클래스(parent class : Product)
 *  생성자(int) : 가격을 200 설정하기
 *  toString() 메서드에서 Computer를 리턴.
 * SmartPhone2 클래스		(parent class : Product)
 *  생성자(int) : 가격을 150 설정하기
 *  toString() 메서드에서 SmartPhone를 리턴.
 */

class Product {
	int price, point;
	
	Product(int price) { //생성자의 목적은 멤버변수의 값을 초기화시키는데 많이 있다.
		this.price = price;
		this.point = price / 10;
	}
}

class Tv extends Product {
	Tv(int price) {
		super(price); 
	}
	//super(price)
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer(int price) {
		super(price);
	}
	
	public String toString() {
		return "Computer";
	}
}

class SmartPhone2 extends Product {
	SmartPhone2(int price) {
		super(price));
	}
	
	public String toString() {
		return "SmartPhone";
	}
}
public class Exam2 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv= new Tv(100); //10
		Computer com = new Computer(200); //200
		SmartPhone2 sp = new SmartPhone2(300); //300
		b.buy(tv);  //파라미터는 Product p. Product p = tv ->tv에 가면 프로덕트가 있다. 오토캐스팅 된 것. tv라는 클래스르 프로덕트로 받은 거고 이걸 다형성이라
		b.buy(com);
		b.buy(sp);
		System.out.println("구매후 잔액:" + b.money);
		System.out.println("구매후 적립포인트:" +b.point);
		System.out.println("======구매 제품 정보 ======");
		b.summary();

	}

}

/*Buyer 클래스 :
 * 멤버변수 : int money = 500, point, cnt
 * 			product[3] cart = new Product[3];
 * 멤버메서드 : buy(Product p) : p 상품의 가격만큼 money 차감.
 * 							  p 상품의 포인트 만큼 point 증가.
 *							  화면에 구입한 제품 출력.
 *							  cart에 제품 추가.
 *			 summary() :
 *				1. 각 구매한 물품의 가격과 포인트 출력
 *				2. 전체 구매 물품 가격 출력
 *				3. 전체 구매 물품 목록 출력
 *
 */
 class Buyer {
	 int money = 500;
	 int point;
	 Product cart[]	= new Product[3];
	 int cnt;
	 void buy(Product p) {
		 money -= p.price;
		 point += p.point;
		 System.out.println(p + "구입함");
		 cart[cnt++] = p;
	 }
	 void summary() {
		 int sum = 0;
		 String productList = "";
		 for (Product p : cart) {
			 if (p==null)
				 break;
			 System.out.println(p + "상품 : 가격=" + p.price + ",포인트=" + p.point	);
			 productList += p + ",";
			 sum += p.price;
		 }
		 System.out.println("총물품구매액:" + sum);
		 System.out.println("총물품목록:" + productList);
	 }
 }

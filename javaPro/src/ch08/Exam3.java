package ch08;
/*
 * 모든 식품(Food)은 가격(price)과 포인트(point)를 멤버로 가진다.
 * 식품의 객체 생성시 가격을 입력 받아야 하고, 가격의 10%를 포인트로 저장한다.
 * 
 * 식료품의 종류는 과일(Fruit), 음료(Drink), 과자(Snack)로 나눠진다.
 * 
 * 과일 클래스는 당도(brix)를, 음료는 용량(ml), 과자는 무게(gram)을 멤버로 가진다.
 * 과일의 종류로는 사과(Apple), 복숭아(Peach),
 * 음료의 종류로는 콜라(Coke)와 사이다(Sidar)
 * 과자의 종류로는 비스킷(Biscuit)과 쿠키(Cookie)가 있다.
 * 사과, 복숭아, 콜라, 사이다, 비스킷, 쿠키 클래스에 toString()메서드를 구현하고
 * 각각의 이름을 리턴한다.
 * 
 * 사과와 복숭아 생성시 가격과 당도를,
 * 콜라, 사이다 생성시 가격고 ㅏ용량을
 * 비스킷과 쿠키 생성시 가격과 무게를 입력받아 객체를 생성한다.
 * Food, Fruit, Drink, Snack, Apple, Peach, Coke, Sidar, Biscuit, Cookie 클래스
 * 10개를 구현하기
 * 
 */
//class all {
//	int food, price, point;
//	
//	all(int food) {
//		this.food = fruit, dring, snack;
//	}
//	
//	all(int price) {
//		this.price = price;
//		this.point = price / 10;
//	}
//}

class Food {
	int price, point;
	Food(int price) { this.price = price;	this.point = price / 10;}}

class Fruit extends Food { double brix;
	Fruit(int price, double brix) {	super(price);	this.brix = brix;} }

class Drink extends Food { int ml;
	Drink(int price, int ml) { super(price);	this.ml=ml;}}

class Snack extends Food { int gram;
	Snack(int price, int gram) {	super(price);	this.gram = gram;}}

class Apple extends Fruit { Apple(int price, double brix) {	super(price, brix); }

	public String toString() { return "사과";}}

class Peach extends Fruit {Peach(int price, double brix) {	super(price, brix);}
	public String toString() {	return "복숭아";}}

class Coke extends Drink { Coke(int price, int ml) { 	super(price, ml);	}
	public String toString()	{ return "콜라";	}}

class Sidar extends Drink { Sidar(int price, int ml) {	super(price, ml); }
	public String toString() {	return "사이다";	}}

class Biscuit extends Snack { Biscuit(int price, int gram) {	super(price, gram);}
	public String toString() {	return "비스킷";}}

class Cookie extends Snack {	Cookie(int price, int gram) {	super(price, gram); }
	public String toString() { return "쿠키";}}


public class Exam3 {
	public static void main(String[] args) {
		Apple apple = new Apple(1000, 10.5); // 가격,당도(brix)
		System.out.println("사과 가격:" + apple.price);
		System.out.println("사과 당도:" + apple.brix);
		Peach peach = new Peach(1000, 13.5); //가격, 당도(brix)
		Coke coke = new Coke(500, 500); //가격, 용량(ml)
		Sidar sidar = new Sidar(1500, 1000); //가격, 용량(ml)
		Biscuit bis = new Biscuit(10000, 500); // 가격, 무게(gram)
		Cookie cookie = new Cookie(500, 5000); // 가격, 무게(gram)
		Buyer2 b = new Buyer2();
		b.buy(apple);	
		b.buy(peach);	
		b.buy(coke);
		b.buy(sidar);
		b.buy(bis);
		b.buy(cookie);
		System.out.println("고객 잔액:" + b.money);
		System.out.println("고객 포인트:" + b.point);
		b.summary();
	}
}

/*
 * Buyer2 클래스 구현하기
 * 	변수 : 고객은 돈(money)과 포인트(point)와 장바구닌(cart:20개)를 멤버로 가진다.
 * 		  총 식료품 구매 건수(cnt)를 가진다.
 * 
 * 메서드 : void buy(Food) :
 * 			물건 구매시 보유금액에서 물품 가격만큼 차감.
 * 			물품의 포인트 만큼 포인트 증가.
 * 			소유 금액보다 물품값이 큰경우 "잔액부족"메세지 출력하고 메서드 종료.
 * 			풀품의 물품명과 가격을 화면에 출력.
 * 			해당 물품은 장바구니에 추가.
 * 		  void summary() :
 * 			장바구니를 조회하여 구매한 물품의 목록과 총 가격과 현재
 * 
 * 			과일 : 갯수, 구매금액, 구매목록,
 * 			음료 : 갯수, 구매금액, 구매목록,
 * 			과자 : 갯수, 구매금액, 구매목록
 * 
 * 			출력하기
 */


class Buyer2 {
	int money= 10000;
	int point;
	int cnt;
	Food[] cart = new Food[20];
	void buy(Food f) {
		if(money < f.price) {
			System.out.println(f + "구매시 잔액부족");
			return; 		} //return을 하게되면 밑에는 계산을 안한다. 
		money -= f.price;
		point += f.point;
		System.out.println(f + " : 가격=" + f.price + "구입");
		cart[cnt++] = f; 	}
	void summary() {
		int total = 0, ftotal = 0, dtotal = 0, stotal = 0;
		int fcnt = 0, dcnt = 0, scnt = 0;
		String flist = "", dlist = "", slist = "";
		for(Food f : cart) {
			if (f == null)		break;
			total += f.price;
			if (f instanceof Fruit) {
				fcnt++; ftotal += f.price;flist += f + ","; }
			if (f instanceof Drink) {
				dcnt++; dtotal += f.price; dlist += f + ",";	}
			if (f instanceof Snack) {
				scnt++; stotal += f.price; slist += f + ",";	}
		}
		System.out.println("총구매 금액 :" + total + ",총 구매건수" +cnt);
		System.out.println("과일구매 금액 :" + ftotal + ",과일구매 건수" + fcnt);
		System.out.println("과일 구매 목록:" + flist);
		System.out.println("음료구매 금액 :" + dtotal + ",음료구매건수" + dcnt);
		System.out.println("음료구매 목록:" + dlist);
		System.out.println("과자구매 금액 :" + stotal + ",과자구매건수" + scnt);
		System.out.println("과자 구매 목록:" + slist);
	}
}


package ch08;
/*
 * SutdaCard 20장으로 이루어진 SutdaDeck클래스 구현하기
 * SutdaDeck 클래스
 * 1. 멤버변수
 * 		SutdaCard 20장을 저장할 배열.
 * 2. 생성자
 * 		SutdaCard 20장을 생성하여 배열에 저장하기
 * 3. 메서드
 * 	(1) void shuffle() : 카드를 섞기.
 * 	(2) SutdaCard pick(int index_ : index에 해당하는 카드 한장을 반환
 *  (3) SutdaCard pick() : 임의의 카드 한장을 반환
 *  
 *  SutdaCard 클래스
 *  1. 멤버변수 : int number, boolean isKwang
 *  2. 생성자 : this 생성자 이용하기
 *  	-() : number=1. isKwang=true 인 객체생성
 *  	-(int, boolean) : 멤버변수에 값을 저장하기
 *  3. 메서드
 *  	void info : number+isKwang?"K" : "" 정보 출력하기
 */

class SutdaCard {
	int number;
	boolean isKwang;
	
	SutdaCard(int number, boolean isKwang) {
		this.number = number;
		this.isKwang = isKwang;	}
	SutdaCard() {
		this.number = 1;
		this.isKwang = true;
		//this(1,true)
	}
	void info() {
		System.out.println(this);	}
	public String toString() {
		return number + ((isKwang) ? "K" : "");}}


//SutdaDeck ha s SutdaCard 관계.
class SutdaDeck {
	SutdaCard[] cards = new SutdaCard[20];
	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			cards[i] = new SutdaCard((i % 10) + 1, 
					(i == 0 || i == 2 || i == 7 ) ? true : false);}}
	
	public String toString() {
		String result = "";
		for (SutdaCard c : cards) { result += c.toString() + ",";}
		return result;		}
	
	void shuffle() {
		for (int i = 0; i <= 1000; i++) {
			int f = (int)(Math.random() * 20);
			int t = (int)(Math.random() * 20);
			SutdaCard tmp = cards[f];cards[f] = cards[t]; cards[t]=tmp; }	}
	
	SutdaCard pick(int index) {	
		return cards[index]; }
	
	SutdaCard pick() {
		int i = (int)(Math.random() * 20);
		return cards[i];
	}
	}


public class Exam1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		// 1k, 2, 3k, 4, 5, 6, 7, 8k, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
		System.out.println(deck);
		deck.shuffle();
		System.out.println(deck);
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		
//		Deck d = new Deck();
//		Card c = d.pick(0);
//		d.shuffle();
//		c = d.pick(0);
	}

}

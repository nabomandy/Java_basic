package ch07;
/*
 * 처음 class 선언시에 한번 static{}이 실행됨
 * new Block()시에는 매번 instance {}이 실행됨
 */
class Block {
	Block() { System.out.println("3) 생성자"); }
	static int cv=5;	int iv = 10;
	static { System.out.println("1) static block :" +cv);}
	{System.out.println("2) instance block:" + iv);}
}	
public class InitEx2 {

	public static void main(String[] args) {
		Block b1 = new Block();
		System.out.println("=================");
		Block b2 = new Block();
		Block b3 = new Block();
		Block b4 = new Block();
		Block b5 = new Block();	
				
	}

}

package ch07;

/* 1. 모든 클래스는 Object를 가지고 있습니다.
 * 2. 참조변수를 프린트 시에는 toString() 메소드를 프린트합니다.
 *  
 */


public class JavaObject {
	public static void main(String[] args) {

		Aaa	a1= new Aaa();
		Object o = new Object();
		System.out.println(o);
		System.out.println(a1);
	}

}


class Aaa{
	int num=303030;
	
	
	
	public String toString() { 
	return num+"입니다.";
}
}
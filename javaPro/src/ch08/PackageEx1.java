package ch08;

import java.util.Date;
//import java.util.Date;

import jan10.Pack2;
//import jan10.Pack2;


/* 
 * package : 클래스들의 모임.
 * 		클래스이름은 패키지명을 포함한다.
 * 		package 설정은 파일의 처음에 한번만 설정이 가능하다.
 * 		=> 하나의 파일에 있는 모든 클래스는 같은 패키지에 속한 클래스다.
 * 
 * import : 패키지명을 생략할 수 있도록 미리 사용될 클래스의 패키지를 선언하는 문장.
 * 
 * 클래스의 패키지명을 생략할 수 있는 경우
 * 	1. 같은 패키지에 속한 클래스는 패키지명을 생략 가능함.
 * 	2. java.lang 패키지에 속한 클래스들은 패키지명을 생략 가능함.
 * 	3. import 구문으로 설정된 클래스는 패키지명 생략 가능.
 */
class Pack1 {
	void method( ) {
		System.out.println("Pack1.method() 호출됨");
	}
}
public class PackageEx1 {
	public static void main(String[] args) {
		Pack1 p1 = new Pack1();
		p1.method();
		Pack2 p2 = new Pack2();
		p2.method();
		Date d = new Date(); // -> import 위에를 써서 저렇게 date만 써도 기능을 함.
//		java.util.Date d = new java.util.Date(); //-> import 위에를 안쓰면 이렇게 써야함 매번.

	}

}

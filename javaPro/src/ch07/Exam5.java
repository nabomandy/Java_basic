package ch07;
/*
 * main 메서드에서 Animal 클래스의 객체생성이 되도록 생성자를 구현하기
 * 결과 : 원숭이:26
 * name, age : instance 변수임.
 */

//class Animal {
//	int name, age;
//	public void inform() {
//		System.out.println(this.name + ":" + this.age);
//	}
//}
//문제 봤을 때 syso(a) 보고는
//toString을 써야할 것 같았음 근데 못함..
//this를 왜 썼는지, 그게 뭔지 생활코딩 영상 한번 더 봐야 할 듯. 확실히 대답을 못하곘다.

public class Exam5 {

	public static void main(String[] args) {
		Animal a = new Animal("원숭이",26);
		System.out.println(a);
		//System.out.println(a.toString()); 
	}

}

class Animal {
	String name;
	int age;
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return this.name + ":" + this.age;
	}
}


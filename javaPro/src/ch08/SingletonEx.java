package ch08;
class SingleObject {
	private static SingleObject obj = new SingleObject();	//100  //private-> 같은 클래스 내에서만 접근이 가능
	private SingleObject() {}	//생성자     //싱글톤은 바로 불러올수 없으니까. setvalue라는 참조형 주소로 불러서 값을 낸거다 이말이다.
	private int value=100;
	//obj.value;
	public static SingleObject getObject() {
		//SingleObject.getObject()
		return obj; } //100
	public int getValue()	{	return value;}
	public void setValue(int value)	{		//obj.value=5;
		this.value = value;	}}

public class SingletonEx {
	static public void main(String[] args) {
//		SingleObject so = new SingleObject(); // 생성자접근 불가. 객체생성불가
		SingleObject so1 = SingleObject.getObject();
		SingleObject so2 = SingleObject.getObject();
		System.out.println(so1+ "," + so2);
		//so1.value=5;-> 이걸 하면 에러가 난다. value는 private 이기 때문에.
		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println(o1 + "," + o2);
		System.out.println(so1.getValue());
		System.out.println(so2.getValue());
		so1.setValue(500); // 그래서 value는 못보니 set으로만 할 수 있다.
		System.out.println(so1.getValue());//500
		System.out.println(so2.getValue());//500
		
		if(so1 == so2)
			System.out.println
			("so1참조변수의 객체와 so2 참조변수의 객체는 같은 객체임.");
		if(o1 == o2)
			System.out.println
			("Object 01 참조변수의 객체와 o2 참조변수의 객체는 같은 객체임.");
		else System.out.println("다른 객체 입니다.");
	}
}

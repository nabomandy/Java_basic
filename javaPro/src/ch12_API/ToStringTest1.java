package ch12_API;


//ch12_API.Animal@798154996

public class ToStringTest1 {
	public static void main(String[] args) {
		Animal a1 = new Animal("호랑이", 20);
		System.out.println(a1);
	}
}

class Animal {
	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}

	
	/*
	 * @Override public String toSting() { // return this.getClass().getName()
	 * + "@" + System.idntityHashCode(this); return "Animal [name=" + name + 
	 * ", age=" + age + "]" ; }
	 */
	
	
	
	
	
	
}

package ch14_collection;

/*
 * 1) 논리적 순위 정의
 * Comparable<T> : sort 시 순위사용
 * public int comparTo(
 * 
 * 2) 논리적 동등 정의 : Set add()시 동등 확인,
 * Object
 * public boolean equals(
 * public int hashCode() P
 */
class Person implements Comparable<Person> {
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "=" + age;
	}

	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		return name.equals(p.name) && age == p.age;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

	@Override
	public int compareTo(Person o) {
		return age - o.age;
	}
	

}

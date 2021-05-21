package ch12_API;
//오버라이딩 여부에 따라 달라지는 게 포인트

/*
 * String : (jdk 제공객체)은 equals(), hashCode()를 오버라이딩 함
 * value : (개발자가 만든객체)는 hashCode()만 오버라이딩함 
 */

class HashCodeEx1 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1 == "abc"); //false
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println("======================");
		Value var1 = new Value("abc");
		Value var2 = new Value("abc");
		System.out.println(var1.equals(var2)); //false
		System.out.println(var1.hashCode()); //
		System.out.println(var2.hashCode());
		System.out.println(System.identityHashCode(var1));
		System.out.println(System.identityHashCode(var2));
	}
}

class Value {
	String value;
	Value(String value) {
		this.value = value;
	}
	
	@Override 
	public boolean equals(Object obj) {
		if (obj instanceof Value) {
			Value v = (Value) obj;
		return	
			value == v.value;
		}
		else
			return false;
	}
	
	@Override
	public int hashCode()
	{return value.hashCode();}

}
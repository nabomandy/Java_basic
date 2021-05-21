package ch12_API;


/*
 * String 값에 따라 주소가 ㅓㄹ정됨
 * str의 주소가 값의 입력에 따라 바뀐다
 */
public class StringEx4_1 {
	public static void main(String[] args) {
		String str = "ABC";
		String str1 = "ABC";
		System.out.println("main :" + str);
//		str = change(str); //주소 재설정
		change(str); //주소 설정하지 않음
		System.out.println("change 이후 main :" + str); //100
		str = change(str); //주소 설정 다시함!
		System.out.println("주소 설정 다시함 change 이후 main=재설정 안함:" + str); //200
		
		str = "12345678";
		System.out.println(str.substring(3)); //주소 설정 하지 않음
		System.out.println("str.substring(3) 이후 :" + str);
		
		str = str.substring(3); //주소 설정 다시함
		
		System.out.println("str=str.substring(3) 이후 :" + str);
	}
	
	static String change(String str) {
		str += "456";
		System.out.println("change() s :" + str);
		return str;
	
	}
}

//기본하고 참조는 다르다. 바뀌고 안바뀌고의 차이를 알아야 한다.
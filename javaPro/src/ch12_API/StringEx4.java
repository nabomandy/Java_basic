package ch12_API;


/*
 * String 값에 따라 주소가 ㅓㄹ정됨
 * str의 주소가 값의 입력에 따라 바뀐다
 */
public class StringEx4 {
	public static void main(String[] args) {
		String str = "ABC";
		String str1 = "ABC";
		System.out.println("main :" + str);
		str = change(str); //주소 재설정
		//change(str); //주소 설정하지 않음
		System.out.println("change 이후 main :" + str);
		change(str); //주소 설정하지 않음
		System.out.println("change 이후 main=재설정 안함:" + str);
		str = "12345678";
		System.out.println(str.substring(3));
		str = str.substring(3);
		System.out.println(str);
	}
	
	static String change(String str) {
		str += "456";
		System.out.println("change() s :" + str);
		return str;
	}

}

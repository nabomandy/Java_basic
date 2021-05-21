package ch12_API;
/*
 * count 메서드 구현하기.
 * int count("문자열 소스", "찾는 문자열") : 문자열소스에서 찾는 문자열의 갯수를 리턴
 */
public class Exam1 {
	//a="12345",b="6"
	static int count(String a, String b) {
		int idx=0, cnt=0;
		while(true) {
			idx = a.indexOf(b, idx); //0   //indexof-> 어떤문자를 어디서부터 찾겠다는 뜻
//			System.out.println(idx);
			if(idx == -1 ) break;      //=-1 은 값을 찾을 수 없다는 뜻
 			idx++;
			cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB","12")); //2
		System.out.println(count("12345AB12AB345AB", "AB")); //3
		System.out.println(count("12345", "6")); //0   //6은 없다는 뜻이다.
	}
}

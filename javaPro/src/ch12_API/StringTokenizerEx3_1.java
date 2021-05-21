package ch12_API;

import java.util.StringTokenizer;

class StringTokenizerEx3_1 {
	public static void main(String[] args) {
		String source = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
		StringTokenizer st = new StringTokenizer(source, "|");
		
		System.out.println("번호  이름   국어    영어    수학  "
				+ " 합계");
		System.out.println("=================================");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			
			StringTokenizer st2 = new StringTokenizer(token, ",");
			while(st2.hasMoreTokens()) {
				System.out.print(st2.nextToken() + "   ");
			}
			System.out.println("sum");
		}
		System.out.println("=================================");
	} //main의 끝

}

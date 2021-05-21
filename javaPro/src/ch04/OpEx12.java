package ch04;

public class OpEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char c1 = 'a';	
			char c2 = (char) (c1+1);		// 라인 5 : 컴파일 에러발생 !!! (char)이 없으면 에러발생
			char c3 = 'a'+1;				// 라인 6 컴파일 에러없음
			
			System.out.println(c2);
	}

}

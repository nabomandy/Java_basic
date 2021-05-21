package ch07;
/*
 * 클래스 배열의 연습
 */
public class PhoneEx2 {
	

	public static void main(String[] args) {
		Phone[] parr = new Phone[3];
		for(int i=0;i<parr.length;i++) {
			Phone p = new Phone();
			parr[i] = p;
			parr[i].no = i + "1234";
			//no : 0: 01234, 1:11234, 2: 21234
		}
		for(int i=0;i<parr.length;i++) {
			System.out.printf("parr[%d].no=%s\n",i,parr[i].no);
			parr[i].send((i==0) ? parr[parr.length-1].no:parr[i-1].no);
			
		}
	}

}

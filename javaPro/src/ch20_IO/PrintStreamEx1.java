package ch20_IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * 보조스트림 예제 : PrintStream
 * 			- OutputStream의 하위 클래스
 * 			- print(), println(), printf() 메서드 추가
 * 			  모든 자료형을 출력
 * 			- System.out(표준 출력객체), System.err(표준 오류객체)의 자료형임.
 */
public class PrintStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos,true);
		//true : autoflush 기능 추가
		ps.print("홍길동11");
		ps.println(1234+"");
		ps.println(true);
		ps.println(65);
		ps.write(65);
//		ps.flush();

		
		ps = new PrintStream("print2.txt");
		ps.println("홍길동22");
		ps.println(12342);
		ps.println(6522);
		ps.println(65);
		ps.flush();
	}

}

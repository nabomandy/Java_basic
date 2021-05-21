package ch20_IO;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/* 
 * File 클래스의 주요 메서드
 * boolean f1.mkdir() : 폴더 생성.
 * boolean f2.createNewFile() : 파일 생성
 * boolean f2.renameTo(f3) : f2 파일을 f3로 변경
 * long f3.lastModified() : 1970년부터 밀리초를 리턴.
 * boolean f3.delete : 파일 삭지. 
 */
public class FileEx2 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("c:/temp1"); // temp1 폴더 지정. 현재 없는 폴더이다.
		System.out.printf("%s 폴더 생성: %b\n",
				f1.getAbsolutePath(),f1.mkdir());
		
		File f2 = new File("c:/temp1/test.txt"); //존재하지 않는 파일
		System.out.printf("%s 파일 생성 : %b\n",
				f2.getAbsolutePath(),f2.createNewFile());
		System.out.printf("파일 이름:%s, 파일크기:%,d byte\n",
				f2.getName(),f2.length());
		
		File f3 = new File("c:/temp1/test2.txt"); //존재하지 않는 파일
		System.out.printf("%s->%s 이름변경:%b\n",
				f2.getName(),f3.getName(),f2.renameTo(f3));
		System.out.printf
			("%s 파일 최종수정시간 : %s\n",
					f3.getName(),new Date(f3.lastModified()));
//		System.out.printf("%s 파일 삭제:%b\n",f3.getName(),f3.delete());
	}
}

package ch20_IO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx1 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("sample.dat");
			DataInputStream dis = new DataInputStream(fis);
			
//			System.out.println(dis.readBoolean()); -> 저장순서와 읽는순서가 일치하지 않으면, 읽지 못한다
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
			
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	} //main

}

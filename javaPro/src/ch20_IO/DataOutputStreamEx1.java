package ch20_IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx1 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("sample.dat");
			dos = new DataOutputStream(fos);
//			dos.writeInt(10); //4바이트
			dos.writeFloat(20.0f); //4바이트
			dos.writeBoolean(true); //1바이트 ->합계 9바이트가 저장된 거
			
			dos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	} //main
}

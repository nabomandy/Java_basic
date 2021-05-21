package ch12_API;

import java.text.MessageFormat;

public class MessageFormatEx2 {

	public static void main(String[] args) {
		String tableName = "CUST_INFO";
		String msg = "INSERT INTO " + tableName + " VALUES (''{0}'',''{1}'',{2},''{3}'');";
//		메세지에서는 ' 이 예약어처럼 사용됨 같이 찍으려면 '' 와 같이 두개 찍어야 됨.
		Object[][] arguments = {
				{"이자바", "02-123-1234", "27", "07-09"},
				{"김프로", "032-333-1234", "33",	"10-07"},
		};
		
		for(int i=0; i< arguments.length;i++) {
			String result = MessageFormat.format(msg, arguments[i]);
			System.out.println(result);
		}
	} //main
}

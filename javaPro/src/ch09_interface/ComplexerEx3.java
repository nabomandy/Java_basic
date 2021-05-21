package ch09_interface;
//scan
public class ComplexerEx3 {

	public static void main(String[] args) {
		Complexer com = new Complexer();
		Complexerable ca = com;
		ca.print();
		ca.scan();
		ca.send("010=1234");
		ca.receive("010-1234");
		Printerable p = com;  //프린터블 안에 프린트만 있고 나머지는 없어서
		p.print();
//		p.scan();					//error
//		p.send("010-1234");			//error
//		p.receive("010-1234");		//error
		Scannerable s = com;   // 스캔 추상메서드만 있고 나머지는 없어서 이런한 이유로 아래도 에러.
//		s.print();					//error
		s.scan();
//		s.send("010-1234");			//error
//		s.receive("010-1234");		//error
		Faxable f = com;
//		f.print();					//error
//		f.scan();					//error
		f.send("010-1234");
		f.receive("010-1234");
	}
}

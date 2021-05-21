package ch07;

public class LoginTest {
	public static void main(String[] args) {
		LoginSystem login = new LoginSystem();
		LoginResult result = login.doLogin("hong", "1234");
		result.printResult();
		//false : 아이디를 확인하세요.
		
		result = login.doLogin("admin", "12345");
		result.printResult(); //false : 비밀번호를 확인하세요.
		
		result = login.doLogin("admin", "1234");
		result.printResult(); //true : admin님 반갑습니다.
	}}

class LoginResult {
	boolean result; String message;
	
	public void printResult() {
		System.out.println(this.result + " : " + this.message);
	}
}

class LoginSystem {
	public LoginResult doLogin(String id, String pass) {
		LoginResult result = new LoginResult();
		if(id=="admin" && pass=="1234") {
			result.result = true;
		}else if(id!="admin") {
			result.message = "아이디를 확인하세요.";
		}else {		result.message="비밀번호를 확인하세요.";
	}	return result;
}
}
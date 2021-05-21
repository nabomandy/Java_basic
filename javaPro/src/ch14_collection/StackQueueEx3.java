package ch14_collection;

import java.util.Stack;

public class StackQueueEx3 {
	public static Stack<String> back = new Stack<String>();
	public static Stack<String> forward = new Stack<String>();
	
	public static void main(String[] args) {
		goURL("1.네이트");
		goURL("2.야후");
		goURL("3.네이버");
		goURL("4.다음");
		printStatus();
		goBack();
		System.out.println("= 뒤로가기 버튼을 누른 후 =");
		printStatus();
		goBack();
		System.out.println("= '뒤로' 버튼을 누른 후 =");
		printStatus();
		goForward();
		System.out.println("= '앞으로' 버튼을 누른 후 =");
		printStatus();
		goURL("sist.com");
		System.out.println("= 새로운 주소로 이동 후 =");
		printStatus();
	}
	
	public static void printStatus() { //608
		System.out.println("back:" + back);
		System.out.println("forward:" + forward);
		System.out.println("현재화면은 '" + back.peek() + "' 입니다.");
		System.out.println(); 
	}
	
	public static void goURL(String url) {
		back.push(url);
		if (!forward.empty())
			forward.clear();
	}
	
	public static void goBack() {
		if (!back.empty())
			forward.push(back.pop());
	}
	
	public static void goForward() {
		if(!forward.empty())
			back.push(forward.pop());
	}
}

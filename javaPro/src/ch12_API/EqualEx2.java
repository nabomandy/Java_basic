package ch12_API;

class Equal2 {
	int value;
	Equal2(int value) {
		this.value = value;
	}
	//eq하고 스페이스하면 밑에처럼 해준다.
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Equal2) {
		Equal2 v = (Equal2)obj;
		return value == v.value;
	} else
		return false;
}
}

public class EqualEx2 {
	public static void main(String[] args) {
		Equal2 e1 = new Equal2(10);
		Equal2 e2 = new Equal2(10);
		if(e1 == e2)
			System.out.println("e1 객체와 e2 객체는 같은 객체임");
		else
			System.out.println("e1 객체와 e2 객체는 다른 객체임");
		if(e1.equals(e2))
			System.out.println("e1 객체의 내용과 e2 객체의 내용은 같다");
		else
			System.out.println("e1 객체의 내용과 e2 객체의 내용은 다르다");
		
	}
}

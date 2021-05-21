package ch18_lamda;
/*
 * 람다식 예제 : jdk8.0 이후 버전에서 사용 가능.
 * 람다식에서 사용할 수 있는 인터페이스는 반드시 FunctionInterface여야함.
 * @FunctionInterface : 인터페이스에는 추상메서드가 한 개이다.
 * 매개변수가 없고, 리턴값도 없는 경우
 * 매개변수 없음 : () -> {.... }
 * 람다식 내부에 실행되는 구문이 한개인 경우 { } 생략 가능
 */

@FunctionalInterface
interface LambdaInterface1 {
	void method() ;
	}

public class LambadaEx1 {
	public static void main(String[] args) {
//		1. 익명 클래스
		LambdaInterface1 fi = new LambdaInterface1() {
			@Override
			public void method() {
				System.out.println("기존 방식으로 코딩");
			}
		};
		
//		2. 구현 클래스
		LambdaInterface1 fi2 = new LamdaClass() ;
		
//		3. 람다를 이용한 클래스 정의
		LambdaInterface1 fi3 = () -> {
			String str = "method call1";
			System.out.println(str);}; //->리턴값이 없다는 의미
		
		fi2.method();
		fi3.method();
		execute(fi2);
		System.out.println("=======================");
//		람다를 이용한 클래스 정의	
		fi3 = () -> {System.out.println("method call2");};
		fi3.method();
		fi3 = () -> {System.out.println("method call3");};
		fi3.method();
		fi3 = () -> System.out.println("method call4");
		fi3.method();
		
		//4.메소드에 람다 정의
		execute(() -> System.out.println("method call5")); }
		
		
		static void execute(LambdaInterface1 f) {
			f.method();		}	}

class LamdaClass implements LambdaInterface1 {
	@Override
	public void method() {
		System.out.println("Lamda Class 입니다");
	}
}



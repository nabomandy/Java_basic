package ch18_lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

/* Operator 인터페이스 예제 : apply 계역 추상 메서드 소유
 *  매개변수 있고, 리턴값도 존재. =>
 *   단 매개변수의 자료형과 리턴값의 자료형이 같다.
 *  Function 인터페이스의 하위 인터페이스임.
 *  result = op.applyAsInt(result, next); ->reduce	
 */

public class LambdaEx9 {
	private static Student[] list = {
			new Student("홍길동",90,80,"경영"),
			new Student("김삿갓",95,70,"컴공"),
			new Student("이몽룡",100,70,"수학")};

	public static void main(String[] args) {
		List li = Arrays.asList(list);
		System.out.println("최대 수학값:");
		int max = maxOrminMath((a,b)-> {if(a>=b) return a;
		else return b;
		});
		
		System.out.println(max);
		System.out.println("최소 수학값:");
		System.out.println(maxOrminMath((a,b)->(a<=b)?a:b));
		System.out.println("최대 평균값:");
		System.out.println(maxOrminAvg((a,b)->(a>=b)?a:b));
		System.out.println("최소 평균값:");
		System.out.println(maxOrminAvg((a,b)->(a>=b)?a:b));
	}
	
	/* IntBinaryOperator op = (a,b) -> (a>=b)?a:b)
	 * int applyAsInt(a,b) {return (a>=b)?a:b; }
	 */

	
	private static int maxOrminMath(IntBinaryOperator op) {
		int result = list[0].getMath();
	/*
	 * result value : max
	 * 80	80
	 * 80	70
	 * 90	80
	 */
		
	/*
	 * result value : min
	 * 80	80
	 * 80	70
	 * 70	70	
	 */
	
	//reduce 80 70 70	
		for(Student s : list) {
			result = op.applyAsInt(result, s.getMath());
		}
		return result;
	}
		
	private static double maxOrminAvg(DoubleBinaryOperator op) {
		double result = (list[0].getMath()+list[0].getEng())/2;
		for(Student s : list) {
			result = op.applyAsDouble(result, (s.getMath()+s.getEng())/2);
		} return result;
	}

}

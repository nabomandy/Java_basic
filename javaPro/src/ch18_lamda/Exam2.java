package ch18_lamda;


interface LambdEx02  { int method(int x, int y);}
/*
 * 1) int method(int x, int y);을 가진 function interface LambdEx02를 만드세요
 */

public class Exam2 {
	static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	public static void main(String[] args) {
		System.out.println("(5,2)두 수의 합:" + sum((a,b)-> a+b,5,2));  
		System.out.println("(5,2)두 수의 곱" + sum((a,b)-> a*b, 5, 2)); 
		System.out.println("arr 배열 중 가장 큰 수:" + maxAndMin((a,b)->((a>b)?a:b))); 
		System.out.println("arr 배열 중 가장 작은 수:" + maxAndMin((a,b)->((a<b)?a:b)));
		LambdEx02 f = new LambdEx02() { 
			@Override
			public int method(int x, int y) {
				return((x>y)? x : y);
			}	};
			System.out.println("arr 배열 중 가장 큰 수:" + maxAndMin(f));
			}
	static int sum(LambdEx02 f, int x, int y) {
		return f.method(x,y);
	}
	static int maxAndMin(LambdEx02 f) {
		int result = arr[0];
		for(int i:arr) {
		result = f.method(result,i);
		}
		return result;
	}
}
	

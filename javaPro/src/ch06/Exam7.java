package ch06;
/*
 * Command 라인에서 숫자를 입력받아 숫자의 약수를 출력하기
 * java Exam7 10
 * int num = Integer.parseInt(args[0]
 * 10의 약수 : 1,2,5,10,
 */
public class Exam7 {

	public static void main(String[] args) {
		//Integer.parseInt(String) : 숫자로 된 문자열 => int형 숫자로 변환 함수
		int num=Integer.parseInt(args[0]);
		System.out.println(num+ "의 약수 :");
		for(int i=1;i<=num;i++) { //약수를 구하는 for문 반복해서 해볼것.
			if(num%i==0)
				System.out.println(i+",");
		}
		
	//	System.out.println(args.length);
	//	if(args.length == 0) {
	//		for(int i=0;i<args.length;i++) {
	//			System.out.println("args[" + i +"]=" + args[i]);
	//		}
		}
	}

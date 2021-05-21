package ch05;
/*
 * 1. 1부터 100까지 2의 배수이거나 3의 배수의 합 구하기
 * 	2 3 4 6 8 9 10 12 14 15
 *  합계 :
 *  
 *  2. 1부터 100까지 2의 배수도 아니고3의 배수도 아닌 수의 합 구하기
 *   1 5 7 11 13 17
 *   합계 :
 */

public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a= 0;
	int sum = 0;
	
	for(a=1; a<=100; a++) {
		if(a%2==0 || a%3==0) {
			System.out.print(a + " ");
			sum += a;
		}
	}
    System.out.println();
    System.out.println("2와 3의 배수의 합 :" + sum);
    
    sum=0;
    		
    		for(a=1; a<=100; a++) {
    			//if(a%2!=0 && a%3!=0 {
    			//System.out.println(a + " ");
    			// sum += a;
    		//}
    		if(a%2==0 || a%3==0) {
    			continue;
    		} else {
    			System.out.print(a + " ");
    		}
    		sum += a;
    		}
    		System.out.println();
    		System.out.println("2와 3의 배수가 아닌 수의 합 : " + sum);
    			
    		

	}

}

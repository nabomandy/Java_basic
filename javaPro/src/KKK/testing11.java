package KKK;
import java.util.Scanner;

public class testing11 {

		
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 row수를 입력하세요");
		int row = scan.nextInt();
		System.out.println("배열의 col수를 입력하세요");
		int col = scan.nextInt();
		
		int[][] arr = new int[row][col];
		int num = 1;


		Object[][] array;
		for(row=0;row<5;row++){
			for(col=0;col<5;col++) { ; 
				array[row][col]=i++;
			}
		}

		for(row=0;row<5;row++){
			for(col=0;col<5;col++){
				System.out.printf("%3d",array[row][col]); //글자수를 3개로 배열을 출력
			}
			System.out.println();

		}
		
	}
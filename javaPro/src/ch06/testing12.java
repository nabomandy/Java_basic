package ch06;

import java.util.Scanner;

public class testing12 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 row수를 입력하세요");
		int row = scan.nextInt();
		System.out.println("배열의 col수를 입력하세요");
		int col = scan.nextInt();
	
		int[][] arr = new int[row][col];
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0) {
				for (int j = 0; j < arr.length; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		else {
			for (int j = 4; j >=0 ; j--) {
				arr[i][j] = num;
				num++;	}	
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+ " ");		
		}
			System.out.println();
		}
	}
		}
			
				
		
		
		
		
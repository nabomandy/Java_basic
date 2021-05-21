package KKK;

import java.util.Scanner;

public class testing33 {

	public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("배열의 row수를 입력하세요");
        int row = scan.nextInt();
        System.out.println("배열의 col수를 입력하세요");
        int col = scan.nextInt();
        
         int i, j, minus;
             int arr[][] = new int[row][col];
             minus = row*col;
             for (i = 0; i <arr.length; i++){
                 for (j = 0; j <arr.length; j++){
                     arr[i][j] = minus;                    
                     minus = minus--;
                     System.out.print(arr[i][j] + "\t");
                 }
                 System.out.println();
             }
         }
  }
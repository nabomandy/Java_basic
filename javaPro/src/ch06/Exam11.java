package ch06;
/*
 * 2차원 배열의 행의 과 열의 합 구하기
 * [결과]
 * 0행의 합 : 30
 * 1행의 합 : 120
 * 2행의 합 : 300
 * 0열의 합 : 100
 * 1열의 합 : 130
 * 2열의 합 : 130
 * 3열의 합 : 90
 * 
 */
public class Exam11 {


	public static void main(String[] args) {
		int arr[][] = 
			{ {1}, 
			  {10,20}, 
			  {30,40,50}, 
			  {60,70,80,90}, 
			  {60,70,80,90,100}  	}; //[5]
		
		int row[] = new int[5]; //-> 이걸 왜 하는거지
		int col[] = new int[5];

		for (int i =0; i < arr.length; i++) {
			//syso(i+"row의 합");
			
			for(int j=0;j<arr[i].length; j++) {
				row[i] += arr[i][j];
				col[j] += arr[i][j];
		//		System.out.print(arr[i][j]+ " ");
			}
			System.out.println(i + "row(행)의 합"+row[i]);
			
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i + "col(행)의 합"+col[i]);
		}
		
}
}
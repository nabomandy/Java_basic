package ch06;
/*
 * 가변 배열 예제
 * [9][9]=1
 * [8][8]=2, [9][8]=3
 * [7][7]=4, [8][7]=5, [9][7]=6
 * [6][6]=7, [7][6]=8, [8][6]=9, [9][6]=10
 */
public class ArrayEx11 {

	public static void main(String[] args) {
		int[][] arr = new int[10][];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new int [i+1]; }
		int data = 0;
		
		for (int j=arr.length-1;j>=0;j--) {
			for(int i=j;i<arr.length;i++) {
				arr[i][j]= ++data;
				System.out.println("[" + i + "][" + j + "]=" + arr[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}

}

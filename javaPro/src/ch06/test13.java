package ch06;

public class test13 {

	public static void main(String[] args) {

		
		
		int array[][] = new int[5][5];

		int row, col;

		int i=1;
	
		for(row=0;row<5;row++){
			for(col=0;col<5;col++){
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

}

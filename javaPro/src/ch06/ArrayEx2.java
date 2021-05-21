package ch06;

public class ArrayEx2 {

	public static void main(String[] args) {
		//배열의 선언 + 생성 + 초기화
		
		int arr[] = {10,20,30,40,50};
		//int[] temp = arr;
		
		for(int a : arr) {
			System.out.println(a + ","); }
		System.out.println();
		
		for(int i=0; i<arr.length;i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);	}
		System.out.println();
		//생성 + 초기화
		arr = new int[] {100,200,300};
		for(int a : arr)    {
			System.out.print(a + ",");
		}	
		System.out.println( ); 
		
		//arr=temp;
		//for(int a : arr) {
		// System.out.print(a + ","); }
		}	
	
}

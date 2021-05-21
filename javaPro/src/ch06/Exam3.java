package ch06;
/*
 * 1부터 9까지 숫자 중 중복되지 않는 3자리 숫자를 임의로 생성하는 프로그램 작성하기
 */
public class Exam3 {

	public static void main(String[] args) {
		int[] arr = new int[9];
		int[] nums = new int[3];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<10000; i++) { // 10000번한 이유는 그냥 많이 섞이라고 잘 섞이게.
			int f = (int) (Math.random() * 9); //3
			int t = (int)(Math.random() * 9); //8 배열
			//arr[f], arr[t] 바꾸기.
			int tmp = arr[f];
			arr[f]=arr[t];
			arr[t]=tmp;
					
		}
		for(int i=0; i<nums.length;i++) {
			nums[i]=arr[i]; 
		//	System.out.println(nums[i] + ","); -> 밑에 단 생략하고 이렇게 해도 됨.
		}
		for(int n : nums)
			System.out.println(n + ",");
}		
}	


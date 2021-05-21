package Doit;

public class ForExample {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		for(num =1, sum = 0; num <= 10; num++) {
		//while(num <= 10) 	
			sum += num;
			//sum += nim;
			//num++;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}

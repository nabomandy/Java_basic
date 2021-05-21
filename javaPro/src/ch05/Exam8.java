package ch05;

// (1) + (1+2) + (1+2+3)_ ... (1+2+3+...+10) ==220 출력하기


public class Exam8 {

	public static void main(String[] args) {
		int sum=0;
		
	
		
		
		
		for(int i=1;i<=10;i++) {
			System.out.println("(");
			
			for(int j=1;j<=i;j++) {
				sum+=j;
				//System.out.print(j+"+");
				System.out.print(j+((i!=j)? "+" : ""));
			}
			//System.out.println(")" + "+"));
			System.out.println(")" + ((i==10) ? "=" : "+"));
		}
		System.out.println(sum);
	
		

		
		
		
	}

}

package ch06;

public class testing3 {

	public static void numbering(int limit) {  //int limit은 매개변수=parameter
		// int limit=5;
		int i = 0;
		while (i < limit) {
			System.out.println(i);
			i++;
		}
				
	}
	
	
	public static void main(String[] args) {
		numbering(5); //5는 매개변수 값 = 인자, argument
		
		
	}

}

package Doit;

public class guguWhile {

	public static void main(String[] args) {

		int dan = 2;
		int times = 1;
		
		while(dan<=9) {	
			times = 1;
			if(times > dan) 
			break;
			while( times<=9) {
			System.out.println(dan + "X" + times + "=" + dan*times );
			times++;
			}
			dan++;
			System.out.println();
			
		}
		
		
	}}



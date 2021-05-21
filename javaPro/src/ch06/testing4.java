package ch06;

public class testing4 {

	public static void numbering(int init, int limit) {
		int i = init;
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		numbering(3, 5);
	}

}

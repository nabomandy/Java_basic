package ch05;
/*
 * 반복문을 이용하여 1부터 10까지의 합 구하기
 */
public class LoopEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 0;
		System.out.println("for 구문을 이용하기");
		for (i = 1; i <=10; i++) 
		{
		sum += i;
		}
		System.out.println("1 ~ 10까지의 합" + sum);
		System.out.println("whoile 구문을 이용하기");
		sum = 0;
		i = 1;
		while (i <= 10)
		{
		sum += i;
		i++;
		}
		System.out.println("1~10 까지의 합:" + sum);
		System.out.println("do while 구문을 이용하기");
		sum = 0;
				i = 1;
		do
		{
			sum += i;
			i++;
		}
		while (i <= 10);
		System.out.println("1~10 까지의 합:" + sum);
		}
		
	}



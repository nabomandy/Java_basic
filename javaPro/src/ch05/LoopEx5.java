package ch05;
/* 그 외 제어문
 * break : 반목문이나 switch 구문을 빠짐
 * continue : 반복문의 처음으로 제어를 이동
 */
public class LoopEx5 {

	public static void main(String[] args) {
		for(int i=2;i<=9;i++ )
		{
		System.out.println("\n"+i+"단"); // /n이라고 하면 n단이라고 나온다. 왜인지 확인해볼것
		for(int j=2;j<=9;j++) {
			if(j==5) continue;
		//	if(j=5) break;
			
			System.out.println(i+ "*" + j + "=" + (i*j));
		}
		}
		
		
		
	}

}

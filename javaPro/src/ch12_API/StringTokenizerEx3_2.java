package ch12_API;

import java.util.StringTokenizer;

class StringTokenizerEx3_2 {
	public static void main(String[] args) {
		String source = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
		StringTokenizer st = new StringTokenizer(source, "|");
		int ktot = 0, etot=0, mtot=0;
		int k=0, e=0, m=0;
		System.out.println("번호\t 이름\t 국어\t  영어\t  수학\t  합계 \t");
		System.out.println("=============================================");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			
			StringTokenizer st2 = new StringTokenizer(token, ",");
			
			System.out.print(st2.nextToken()+"\t");
			System.out.print(st2.nextToken()+"\t");
			k=Integer.parseInt(st2.nextToken());
			e=Integer.parseInt(st2.nextToken());
			m=Integer.parseInt(st2.nextToken());
			
			ktot+=k;
			etot+=e;
			mtot+=m;
			System.out.print(k+"\t"+e+"\t"+m+"\t"+(k+e+m));
			
			System.out.println();
		}
		System.out.println("=============================================");
		System.out.print("합계 \t \t" +ktot + "\t" + etot + "\t" +mtot + "\t" +(ktot+etot+mtot));
	} //main의 끝

}

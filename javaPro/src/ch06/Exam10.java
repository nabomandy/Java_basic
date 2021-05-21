package ch06;
/*
 * 5명 학생의 국어, 영어, 수학 점수를 학생별로 총점, 평균을 출력하고
 * 과목별 총점과 평균 출력하기
 * [결과]
 * 
 *		   국어  영어  수학  총점  평균
 * 1번학생 : 100	80	90	270   =90.00
 * 2번학생
 * 3번학생
 * 4번학생
 * 5번학생
 * 6번학생
 * 과목총점
 * 과목평균
 * 
 */
public class Exam10 {

	public static void main(String[] args) {
		int score[][] = {
				{100,80,90},{80,95,100},{60,65,70},{85,70,75},{90,90,80}
		};
		
		int total[] = new int[3];
		System.out.println("\t국어\t영어\t수학\t총점\t평균");
		
		for(int i=0; i<score.length;i++) {
			System.out.print(i+1+"번학생 :");
			int sum = 0;
			for(int j=0; j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
				sum += score[i][j]; //학생별 합계
				total[j]+=score[i][j];  //과목별 합계
			}
			System.out.printf("%d \t %.2f \n",sum,(double)sum/score[i].length);
		}
		
			System.out.print("과목총점:\t");
			for(int i=0; i<total.length; i++) {
				System.out.print(total[i]+"\t");
			}
			
			System.out.println();
			System.out.print("과목평균:\t");
			for(int i=0; i<total.length;i++) {
				System.out.printf("%.2f\t",(double)total[i] / score.length);
			}
		}

	}

package ch12_API;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*파일에서 데이터 읽기
 * 데이터의 형식에 따라 nextXXXX를 결정 하여야 한다 	
 */
class ScannerEx2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("score.txt"));
		int cnt = 0;
		double totalSum = 0;
		while(scan.hasNextLine()) { 
			String line = scan.nextLine(); //  \n 한줄 읽기
			Scanner scan2 = new Scanner(line).useDelimiter(",");
			double sum = 0;
			int i = 0;
			String name = scan2.next();
			System.out.println(name + ":");
			while(scan2.hasNextDouble()) {
				double score = scan2.nextDouble();
				sum += score;
				System.out.println(score + ",");
				i++;
			}
			System.out.println(" sum=" + sum + ", avg=" + ((int)(sum/i *100))/100.0);
			totalSum += sum;
			cnt++;
		}
		System.out.println("count:" + cnt + " totalSum:" +totalSum);
	}

}


//v파싱?
package ch12_API;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegularEx3 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("Test.txt"));
		String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		int cnt = 0;
		double totalSum = 0;
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(line)	;
		int i =0;
		while(m.find()) {
			System.out.println(++i + ": " + m.group() + " -> "
		+ m.group(1) + ", " + m.group(2) + ", " + m.group(3) + ":      "	);
		}
		System.out.println();
		}

	} //main의 끝

}

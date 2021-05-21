package ch19_strea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileToStreamEx1 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/ch14_collection/KICStudent.txt");
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		stream.limit(5).forEach(s->System.out.println(s));
		stream.close();
		System.out.println("=================================");
		
		//BufferdReader의 lines() 메소드 이용
		File file = path.toFile();
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		br.lines().limit(5).forEach(s->System.out.println(s) );
		stream.close();

	}

}

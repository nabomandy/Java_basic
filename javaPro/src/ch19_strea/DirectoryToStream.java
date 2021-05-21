package ch19_strea;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class DirectoryToStream {
	public static void main(String[] args) throws IOException {
		System.out.println("list() 메서드를 이용하여 스트림 생성하기");
		Path path = Paths.get("src");
		Stream<Path> sr1 = Files.list(path);
		sr1.forEach( p-> System.out.println(p.getFileName()) );
		System.out.println("=================================");
		System.out.println("find() 메서드를 이용하여 스트림 생성하기");
//		Stream<Path> sr2 = Files.find(path, 100, ( p, BasicFileAttributes) -> {
		Stream<Path> sr2 = Files.find(path, 100, ( p, b) -> {
			
			File file = p.toFile();
			return !file.isDirectory() &&
					file.getName().contains("Data");
		});
		
		sr2.forEach( p -> System.out.println(p.getFileName()) );
	}

}

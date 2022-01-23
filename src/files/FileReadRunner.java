package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadRunner {

	public static void main(String[] args) throws IOException {
		Path pathFileToRead = Paths.get("./resources/data.txt");

		// This puts all content in the List
		// not good with large files
		// List<String> lines = Files.readAllLines(pathFileToRead);
		// System.out.println(lines);

		// Processes the file line by line
		Files.lines(pathFileToRead).filter(str -> str.contains("214")).forEach(System.out::println);
	}

}

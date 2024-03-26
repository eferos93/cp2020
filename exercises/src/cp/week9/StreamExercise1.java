package cp.week9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StreamExercise1
{
	public static void main(String[] args) throws IOException {
		System.out.println(Paths.get("").toAbsolutePath().toString());
		Files.lines(Path.of("file.txt"))
			.filter(line -> line.endsWith("."))
			.forEach(line -> System.out.println(line));

	}
	/*
	- Create a file with many (>100) lines of text.
	  For example, you can use this website: loremipsum.io
	- Use Files.lines to get a stream of the lines contained within the file.
	- Use Stream::filter and Stream::forEach to print on screen each line that ends with a dot.
	*/
}

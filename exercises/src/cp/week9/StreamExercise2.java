package cp.week9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class StreamExercise2
{
	public static void main(String[] args) throws IOException {
		Files.lines(Path.of("file.txt"))
			.filter(line -> line.startsWith("C"))
			.collect(Collectors.toList());
	}
	/*
	- Create a stream of lines for the file created in StreamExercise1.
	- Use Stream::filter and Stream::collector (the one with three parameters)
	  to create an ArrayList of all lines that start with a "C".
	- Suggestion: look at https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#collect-java.util.function.Supplier-java.util.function.BiConsumer-java.util.function.BiConsumer-
	*/
}

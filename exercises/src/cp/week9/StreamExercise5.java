package cp.week9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class StreamExercise5
{

	public static void main(String[] args) throws IOException {
		Files.lines(Path.of("file.txt"))
			.map(line -> {
				Map<String, Integer> lineFrequencyTable = new HashMap<String, Integer>();
				line.lines().forEach(word -> lineFrequencyTable.put(word, lineFrequencyTable.getOrDefault(word, 0) + 1));
				return lineFrequencyTable;
			}).reduce(new HashMap<String, Integer>(), (prevHash, newHash) -> prevHash.);
	}
	/* ! (Exercises marked with ! are more difficult.)
	
	- Create a stream of lines for the file created in StreamExercise1.
	- Use Stream::map to map each line to a HashMap<String, Integer> that
	  stores how many times each character appears in the line.
	  For example, for the line "abbc" you would produce a map with entries:
	    a -> 1
	    b -> 2
	    c -> 1
	- Use Stream::reduce(T identity, BinaryOperator<T> accumulator)
	  to produce a single HashMap<String, Integer> that stores
	  the results for the entire file.
	*/
}

//checked exception
import java.io.FileReader;
import java.io.IOException;

public class Example{
	public static void readFile() throws IOException {
		FileReader reader = new FileReader("file.txt");
	}
}

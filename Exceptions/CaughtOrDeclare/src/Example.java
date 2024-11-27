import java.io.FileReader;
import java.io.IOException;

public class Example {
    public void readFile() {
        FileReader reader = new FileReader("file.txt"); // IOException not handled or declared
    }
}

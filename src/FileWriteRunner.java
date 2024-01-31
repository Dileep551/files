import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

    public static void main(String[] args) throws IOException {

        Path pathFileToWrite = Paths.get("./resources/data1.txt");

        List<String> valuesToWrite = List.of("Apple", "Banana", "Orange", "123");

        Files.write(pathFileToWrite, valuesToWrite);




    }
}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {

    public static void main(String[] args) throws IOException {

        Path pathFileToRead = Paths.get("./resources/data.txt");

//        List<String> listValue = Files.readAllLines(pathFileToRead);
//
//        System.out.println(listValue);

        Files.lines(pathFileToRead).forEach(System.out::println);




    }
}

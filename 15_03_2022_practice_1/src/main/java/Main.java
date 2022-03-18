import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {

        for (int i=0; i<1; i++) {
            File filePath = new File("15_03_2022_practice_1/src/main/dir_" + i);
            filePath.mkdir();
            File file = new File("15_03_2022_practice_1/src/main/dir_" + i+"/"+i+"0.txt");
            file.createNewFile();
            File file2 = new File("15_03_2022_practice_1/src/main/dir_" + i+"/"+i+"1.txt");
            file2.createNewFile();
            File file3 = new File("15_03_2022_practice_1/src/main/dir_" + i+"/"+i+"2.txt");
            file3.createNewFile();

            

            for (File files : Objects.requireNonNull(filePath.listFiles()));
            System.out.println(Arrays.toString(filePath.listFiles()));
        }
        }
    }

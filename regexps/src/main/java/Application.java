import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        TextValidator[] validators = {new Numberval(), new Phoneval(), new Emailval(), new Colorval(),
        new QuotedTextval(), new Datetime()};
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.equals("exit"))
                break;

            boolean found = false;
            for (TextValidator validator : validators) {
                if (validator.validate(line)) {
                    System.out.println("it`s a " + validator.name());
                    found = true;
                    break;
                }
            }
            if (!found)
                System.out.println("i dont know...");
        }
    }
}

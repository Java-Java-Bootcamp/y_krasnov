import java.util.regex.Pattern;

public class Phoneval implements TextValidator {
    //    +7(123)456-12-24, 81244561224
    private final static Pattern pattern = Pattern.compile("\\+?[0-9]\\(?[0-9]{3}\\)?[0-9]{3}-?[0-9]{2}-?[0-9]{2}");

    @Override
    public boolean validate(String text) {
        return pattern.matcher(text).matches();
    }

    @Override
    public String name() {
        return "phone";
    }
}

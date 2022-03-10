import java.util.regex.Pattern;

public class Numberval implements TextValidator {
    //    число с десятичным разделителем 1.23, 123, -74, -74.123e44
    private final static Pattern pattern = Pattern.compile("-?[0-9]*\\.?[0-9]*[\\w][0-9]*");

    @Override
    public boolean validate(String text) {
        return pattern.matcher(text).matches();
    }

    @Override
    public String name() {
        return "number";
    }
}

import java.util.regex.Pattern;

public class QuotedTextval implements TextValidator {
    //    * текст в кавычках "123  привет", "шоколадка \"Марс\""
    private final static Pattern pattern = Pattern.compile("\".*\", \".*\\\\\".*\\\\\"\"");

    @Override
    public boolean validate(String text) {
        return pattern.matcher(text).matches();
    }

    @Override
    public String name() {
        return "text with quotes";
    }
}

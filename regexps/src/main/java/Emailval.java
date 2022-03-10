import java.util.regex.Pattern;

public class Emailval implements TextValidator {
    //    abc421@gmail.com
    private final static Pattern pattern = Pattern.compile("([a-zA-Z]*[0-9]*)(@)([a-zA-Z]+)(\\.[a-zA-Z]+)");

    @Override
    public boolean validate(String text) {
        return pattern.matcher(text).matches();
    }

    @Override
    public String name() {
        return "email";
    }
}

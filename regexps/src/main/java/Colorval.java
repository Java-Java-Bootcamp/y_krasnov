import java.util.regex.Pattern;

public class Colorval implements TextValidator {
    //    цвет html #AABB12, #777
    private final static Pattern pattern = Pattern.compile("#([a-zA-Z]*[0-9]*)|#([0-9]*[a-zA-Z]*)");

    @Override
    public boolean validate(String text) {
        return pattern.matcher(text).matches();
    }

    @Override
    public String name() {
        return "color";
    }
}

import java.util.regex.Pattern;

public class Datetime implements TextValidator {
    //    * дата и время 12.3.2022 17:45:33 12.3.22 17:45 -
    //    тут нужна доп. проверка на корректность даты и времени
    //    (29.02.2021 - некорректная дата) - см LocalDateTime
    private final static Pattern pattern = Pattern.compile("\\d{1,2}\\.\\d{1,2}\\.\\d{2,4} +" +
            "\\d{1,2}:\\d{1,2}(:\\d{1,2})?");

    @Override
    public boolean validate(String text) {
        return pattern.matcher(text).matches();
    }

    @Override
    public String name() {
        return "Datetime";
    }
}

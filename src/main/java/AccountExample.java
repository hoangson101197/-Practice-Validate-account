import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
//    Do not contain special characters
//    Must be longer than 6 characters
//    Do not contain capital letters
//    Allow underscore (_)
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public AccountExample() {

    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);

        return matcher.matches();
    }
}

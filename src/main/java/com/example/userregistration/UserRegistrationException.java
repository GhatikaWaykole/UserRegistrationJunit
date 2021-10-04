package com.example.userregistration;
/* purpose Exception use junit
 * Validation name,login,data with the customized exception
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class UserRegistrationException extends Exception {
    Pattern pattern;
    Matcher matcher;
    /* create firstName method to check the name and when null throws the exception
     * @param name return boolean value
     */
    public boolean firstName(String name) throws UserRegisrationCreateException {
        try {
            String regx = "^[A-Z]{1}[a-z]{2,}";
            pattern = Pattern.compile(regx);
            matcher = pattern.matcher(name);
            return matcher.matches();
        } catch (NullPointerException e) {
            throw new UserRegisrationCreateException("Enter proper name");
        }
    }
}

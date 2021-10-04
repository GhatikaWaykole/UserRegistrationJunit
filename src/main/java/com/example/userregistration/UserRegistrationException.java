package com.example.userregistration;
/* purpose Exception use junit
 * Validation name,login,data with the customized exception
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        /* createlastname method to check the name and throw null pointer exception
         * @param name return boolean
         */
    public boolean lastName(String name) throws UserRegisrationCreateException{
        try {
            String regex = "^[A-Z]{1}[a-z]{2,}";
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(name);
            return matcher.matches();
        } catch (NullPointerException e){
            throw new UserRegisrationCreateException("Enter proper name value");
        }
    }
    /* create method to check data and throw null pointer exception
     * @param name return boolean value
     */
    public boolean name(String name) throws UserRegisrationCreateException{
        try{
            String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z][2,3]){0,1}$";
            pattern = Pattern.compile(regex);
            matcher  = pattern.matcher(name);
            return matcher.matches();
        } catch (NullPointerException e) {
            throw new UserRegisrationCreateException("Enter proper value");
        }
    }
    /* create method numberCheck and throw null pointer exception
     * @param number return boolean
     */
    public boolean numberCheck(String number) throws UserRegisrationCreateException {
        try{
            String regex = "^[0-9]{2}\\s[0-9]{10}";
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(number);
            return matcher.matches();
        } catch (NullPointerException e) {
            throw new UserRegisrationCreateException("Number should be proper");
        }
    }
    }

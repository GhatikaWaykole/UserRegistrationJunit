package com.example.userregistration;
/* purpose Exception use junit
 * Validation name,login,data with the customized exception
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationException{
    Pattern pattern;
    Matcher matcher;
    /* create firstName method to check the name and when null throws the exception
     * @param name return boolean value
     */
    public boolean firstName(String name) throws UserRegisrationCreateException {
        if(name == null) {
            throw new UserRegisrationCreateException("Enter the proper not null value");
           // throw new UserRegisrationCreateException("Enter proper name");
        }
        String regx = "^[A-Z]{1}[a-z]{2,}";
        pattern = Pattern.compile(regx);
        matcher = pattern.matcher(name);
        return matcher.matches();
        }
        /* createlastname method to check the name and throw null pointer exception
         * @param name return boolean
         */
    public boolean lastName(String name) throws UserRegisrationCreateException{
        if(name == null){
            throw new UserRegisrationCreateException("Enter the proper not null value");
        }
        String regex = "^[A-Z]{1}[a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
        }
    /* create method to check data and throw null pointer exception
     * @param name return boolean value
     */
    public boolean name(String name) throws UserRegisrationCreateException{
        if(name == null){
            throw new UserRegisrationCreateException("Enter the proper not null value");
        }
        String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z][2,3]){0,1}$";
        pattern = Pattern.compile(regex);
        matcher  = pattern.matcher(name);
        return matcher.matches();
    }
    /* create method numberCheck and throw null pointer exception
     * @param number return boolean
     */
    public boolean numberCheck(String number) throws UserRegisrationCreateException {
        if(number == null){
            throw new UserRegisrationCreateException("Enter the proper not null validation number value");
        }
        String regex = "^[0-9]{2}\\s[0-9]{10}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(number);
        return matcher.matches();
    }
    /* createloginmethod and throw null exception
     * @param login return boolean
     */
    public boolean loginValidation(String name) throws UserRegisrationCreateException {
        if(name == null){
            throw new UserRegisrationCreateException("Enter the proper login value");
        }
        String regex = "^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%!]).{8,}$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }
    }

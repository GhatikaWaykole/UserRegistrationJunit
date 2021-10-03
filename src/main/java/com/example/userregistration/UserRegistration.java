package com.example.userregistration;
/* purpose write a junit program to validation of user registration program
 * Validatin use the regex program
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Pattern pattern;
    Matcher matcher;
    /* method firstName to validate the first name of the user
     * @param name return boolean value
     */
    public boolean firstName(String name){
        String regex = "^[A-Z]{1}[a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }
    /* methodlastName to validation of the name value
     * @param name return boolean value
     */
    public boolean lastName(String name){
        String regex = "^[A-Z]{1}[a-z]{2,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }
    /* method to validation of the name value
     * @param name return boolean value
     */
    public boolean emailValidation(String name){
        String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z][2,3]){0,1}$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }
    /* method to validation of mobile number data
     * @param name return boolean value
     */
    public boolean numberValidation(String number){
        String regex = "^[0-9]{2}\\s[0-9]{10}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(number);
        return matcher.matches();
    }
    /* methodlogin to validation of login value should have minimum eight value data
     * @param name return boolean value
     */
    public boolean loginRule1Validation(String name){
        String regex = "^[A-Za-z0-9]{8,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }
    //create method to validation of login have atleast one upper value data
    public boolean loginRule2Validation(String name){
        String regex = "^(?=.*[A-Z]){1}(?=.*[a-z]).{8,}$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }
    //create method to validation one or greater digit value data
    public boolean loginRule3Validation(String name){
        String regex = "(?=.*[A-Z]){1}(?=.*[0-9])(?=.*[a-z]).{8,}$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }
    }

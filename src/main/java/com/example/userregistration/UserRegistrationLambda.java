package com.example.userregistration;

import sun.nio.cs.ext.MacHebrew;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* purpose use the lambda expression to interface and single method to do the compute
 * interface allow to declare the method and with the use of lambda expression it implement in the program compute
 * method body have interface name follow with name and parameter -> represent the lamba and {}; contain  the functional body data
 * user the metbod take methodname and interface name then use the paramater for the method value
 */
@FunctionalInterface
interface compute{
    public boolean validation(String name);
}
public class UserRegistrationLambda {
    static Pattern pattern;
    static Matcher matcher;

    public static void main(String args[]) {

        /* method firstName to validate the first name of the user
         * @param name return boolean value
         */
        compute firstName = (name) -> {
            String regex = "^[A-Z]{1}[a-z]{2,}";
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(name);
            return matcher.matches();
        };
        /* methodlastName to validation of the name value
         * @param name return boolean value
         */
        compute lastName = (name) -> {
            String regex = "^[A-Z]{1}[a-z]{2,}";
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(name);
            return matcher.matches();
        };
        /* method to validation of the name value
         * @param name return boolean value
         */
        compute ValidatioName = (String name) -> {
            String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z][2,3]){0,1}$";
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(name);
            return matcher.matches();
        };
        /* method to validation of mobile number data
         * @param name return boolean value
         */
        compute ValidationNumber = (String number) -> {
            String regex = "^[0-9]{2}\\s[0-9]{10}";
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(number);
            return matcher.matches();
        };
        /* methodlogin to validation of login value should have minimum eight value data
         * @param name return boolean value
         */
        compute login = (String loginName) -> {
            String regex = "^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%!]).{8,}$";
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(loginName);
            return matcher.matches();
        };
        //method validation compute
        System.out.println("Enter firstname validation"+firstName.validation("Abca"));
        System.out.println("Enter last name validation"+lastName.validation("Aaabcaa"));
        System.out.println("Enter name validation"+ ValidatioName.validation("abc@aaca.com"));
        System.out.println("Enter number validation"+ ValidationNumber.validation("11 1111111111"));
        System.out.println("Enter login validation"+login.validation("Aabcaa@aab1"));
    }

}

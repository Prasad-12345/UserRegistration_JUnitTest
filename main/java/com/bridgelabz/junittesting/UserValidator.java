package com.bridgelabz.junittesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 *Author:Prasad
 */
public class UserValidator {
    //regex patterns
    private static final String regexFirstName = "^[A-Z]{1}[a-z]{2,}";
    private static final String regexLastName = "^[A-Z]{1}[a-z]{2,}$";
    private static final String regexEmail = "^[a-z0-9]{3,}[A-za-z0-9+.-]*@[a-z0-9]{1,}[.][a-z]{2,}[.][a-z]*$";
    private static final String regexPhoneNumber = "(91)?[\\s][0-9]{10}";
    private static final String regexPassword1 =  "^[0-9a-zA-Z!,@#$&*().]{8,}$";
    private static final String regexPassword2 = "(?=.*[A-Z])^[0-9a-zA-Z!,@#$&*().]{8,}$";
    private static final String regexPassword3 = "(?=.*[A-Z])(?=.*[0-9])^[0-9a-zA-Z!,@#$&*().]{8,}$";
    private static final String regexPassword4 = "(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$).{8,}";
    private static final String regexEmail2 = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:([0-9]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}";

    /*
     * To validate first name
     */
    public boolean firstName(String firstName){
        Pattern pattern = Pattern.compile(regexFirstName);
        return  pattern.matcher(firstName).matches();
    }

    /*
     * To validate last name
     */
    public boolean lastName(String lastName){
        Pattern pattern = Pattern.compile(regexLastName);
        return  pattern.matcher(lastName).matches();
    }

    /*
     * To validate email
     */
    public boolean checkEmail(String email){
        Pattern pattern = Pattern.compile(regexEmail);
        return  pattern.matcher(email).matches();
    }

    /*
     * To validate phone number
     */
    public boolean phoneNumber(String phoneNumber){
        Pattern pattern = Pattern.compile(regexPhoneNumber);
        return  pattern.matcher(phoneNumber).matches();
    }

    /*
     * To validate passwoed rule1
     */
    public boolean password(String password){
        Pattern pattern = Pattern.compile(regexPassword1);
        return  pattern.matcher(password).matches();
    }

    /*
     * To validate passwoed rule2
     */
    public boolean password2(String password2){
        Pattern pattern = Pattern.compile(regexPassword2);
        return  pattern.matcher(password2).matches();
    }

    /*
     * To validate passwoed rule3
     */
    public boolean password3(String password3){
        Pattern pattern = Pattern.compile(regexPassword3);
        return  pattern.matcher(password3).matches();
    }

    /*
     * To validate passwoed rule4
     */
    public boolean password4(String password4){
        Pattern pattern = Pattern.compile(regexPassword4);
        return  pattern.matcher(password4).matches();
    }

    /*
     * To validate all email samples
     */
    public boolean email2(String email2){
        Pattern pattern = Pattern.compile(regexEmail2);
        return  pattern.matcher(email2).matches();
    }
}

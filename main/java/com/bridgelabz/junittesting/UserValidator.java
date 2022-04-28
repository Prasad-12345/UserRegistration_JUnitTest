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
}

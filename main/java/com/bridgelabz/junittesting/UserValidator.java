package com.bridgelabz.junittesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 *Author:Prasad
 *
 */
public class UserValidator {
    //regex patterns
    private static final String regexFirstName = "^[A-Z]{1}[a-z]{2,}";

    /*
     * To validate first name
     */
    public boolean firstName(String firstName){
        Pattern pattern = Pattern.compile(regexFirstName);
        return  pattern.matcher(firstName).matches();
    }
}

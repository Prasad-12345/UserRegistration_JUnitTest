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
    public boolean firstName(String firstName) throws UserValidatorException{
        try {
            if(firstName.length() == 0){
                throw new UserValidatorException("Please enter valid first name", UserValidatorException.ExceptionType.ENTERED_EMPTY);
            }
            else {
                Pattern pattern = Pattern.compile(regexFirstName);
                return pattern.matcher(firstName).matches();
            }
        }
        catch(NullPointerException e){
            throw new UserValidatorException("Please enter valid first name", UserValidatorException.ExceptionType.ENTERED_NULL);
        }
    }

    /*
     * To validate last name
     */
    public boolean lastName(String lastName) throws UserValidatorException{
        try {
            if(lastName.length() == 0){
                throw new UserValidatorException("Please enter valid last name", UserValidatorException.ExceptionType.ENTERED_EMPTY);
            }
            else {
                Pattern pattern = Pattern.compile(regexLastName);
                return pattern.matcher(lastName).matches();
            }
        }
        catch(NullPointerException e){
            throw new UserValidatorException("Please enter valid last name", UserValidatorException.ExceptionType.ENTERED_NULL);
        }
    }

    /*
     * To validate email
     */
    public boolean checkEmail(String email) throws UserValidatorException{
        try {
            if (email.length() == 0) {
                throw new UserValidatorException("Please enter valid email", UserValidatorException.ExceptionType.ENTERED_EMPTY);
            }
            else {
                Pattern pattern = Pattern.compile(regexEmail);
                return pattern.matcher(email).matches();
            }
        }
        catch (NullPointerException e){
            throw new UserValidatorException("Please enter valid email", UserValidatorException.ExceptionType.ENTERED_NULL);
        }
    }

    /*
     * To validate phone number
     */
    public boolean phoneNumber(String phoneNumber) throws UserValidatorException{
        try {
            if (phoneNumber.length() == 0) {
                throw new UserValidatorException("Please enter valid phone number", UserValidatorException.ExceptionType.ENTERED_EMPTY);
            } else {
                Pattern pattern = Pattern.compile(regexPhoneNumber);
                return pattern.matcher(phoneNumber).matches();
            }
        }
        catch (NullPointerException e){
            throw new UserValidatorException("Please enter valid phone number", UserValidatorException.ExceptionType.ENTERED_NULL);
        }
    }

    /*
     * To validate password rule1
     */
    public boolean password(String password){
        Pattern pattern = Pattern.compile(regexPassword1);
        return  pattern.matcher(password).matches();
    }

    /*
     * To validate password rule2
     */
    public boolean password2(String password2){
        Pattern pattern = Pattern.compile(regexPassword2);
        return  pattern.matcher(password2).matches();
    }

    /*
     * To validate password rule3
     */
    public boolean password3(String password3){
        Pattern pattern = Pattern.compile(regexPassword3);
        return  pattern.matcher(password3).matches();
    }

    /*
     * To validate password rule4
     */
    public boolean password4(String password4) throws UserValidatorException{
        try {
            if (password4.length() == 0) {
                throw new UserValidatorException("Please enter valid password", UserValidatorException.ExceptionType.ENTERED_EMPTY);
            } else {
                Pattern pattern = Pattern.compile(regexPassword4);
                return pattern.matcher(password4).matches();
            }
        }
        catch(NullPointerException e){
            throw new UserValidatorException("Please enter valid password", UserValidatorException.ExceptionType.ENTERED_NULL);
        }
    }

    /*
     * To validate all email samples
     */
    public boolean email2(String email2){
        Pattern pattern = Pattern.compile(regexEmail2);
        return  pattern.matcher(email2).matches();
    }
}

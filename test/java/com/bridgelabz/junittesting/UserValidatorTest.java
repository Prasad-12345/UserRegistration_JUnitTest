package com.bridgelabz.junittesting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/*
 *Author: Prasad
 */
public class UserValidatorTest {
    UserValidator userValidator;
    //before method
    @Before
    public void before(){
        userValidator = new UserValidator();
    }

    /*
     * If first name is proper then this method sholud pass the asserttrue condition
     */
    @Test
    public void givenFirstName_WhenProper_ReturnTrue(){
        boolean result = userValidator.firstName("Prasad");
        Assert.assertTrue(result);
    }

    /*
     * If first name is not proper then this method should pass the assertfalse condition
     */
    @Test
    public void givenFirstName_WhenNotProper_ReturnFalse(){
        boolean result = userValidator.firstName("ma");
        Assert.assertFalse(result);
    }

    /*
     *Test case for exception
     */
    @Test
    public void givenFirstName_WhenNull_ShouldThrowException(){
        UserValidator userValidator1 = new UserValidator();
        try{
            userValidator1.firstName(null);
        }
        catch (UserValidatorException e){
            Assert.assertEquals(UserValidatorException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    /*
     *Test case for exception
     */
    @Test
    public void givenFirstName_WhenEmpty_ShouldThrowException(){
        try{
            userValidator.firstName("");
        }
        catch (UserValidatorException e){
            Assert.assertEquals(UserValidatorException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    /*
     * If last name is proper then this method should pass the asserttrue condition
     */
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        boolean result = userValidator.lastName("Somvanshi");
        Assert.assertTrue(result);
    }

    /*
     * If last name is not proper then this method should pass the assertfalse condition
     */
    @Test
    public void givenLastName_WhenNotProper_ReturnFalse(){
        boolean result = userValidator.lastName("somvanshi");
        Assert.assertFalse(result);
    }

    /*
     *Test case for exception
     */
    @Test
    public void givenLastName_WhenNull_ShouldThrowException(){
        try{
            userValidator.lastName(null);
        }
        catch (UserValidatorException e){
            Assert.assertEquals(UserValidatorException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    /*
     *Test case for exception
     */
    @Test
    public void givenLastName_WhenEmpty_ShouldThrowException(){
        try{
            userValidator.lastName("");
        }
        catch (UserValidatorException e){
            Assert.assertEquals(UserValidatorException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    /*
     * If email is proper then this method should pass the asserttrue condition
     */
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue(){
        boolean result = userValidator.checkEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    /*
     * If email is not proper then this method should pass the assertfalse condition
     */
    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse(){
        boolean result = userValidator.checkEmail("abc().xyz@bl.co.in");
        Assert.assertFalse(result);
    }

    /*
     *Test case for exception
     */
    @Test
    public void givenEmail_WhenNull_ShouldThrowException(){
        try{
            userValidator.checkEmail(null);
        }
        catch (UserValidatorException e){
            Assert.assertEquals(UserValidatorException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    /*
     *Test case for exception
     */
    @Test
    public void givenEmail_WhenEmpty_ShouldThrowException(){
        try{
            userValidator.checkEmail("");
        }
        catch (UserValidatorException e){
            Assert.assertEquals(UserValidatorException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    /*
     * If phone number is proper then this method should pass the asserttrue condition
     */
    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue(){
        boolean result = userValidator.phoneNumber("91 7798718310");
        Assert.assertTrue(result);
    }

    /*
     * If email is not proper then this method should pass the assertfalse condition
     */
    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse(){
        boolean result = userValidator.phoneNumber("917798718310");
        Assert.assertFalse(result);
    }

    /*
     *Test case for exception
     */
    @Test
    public void givenPhoneNumber_WhenNull_ShouldThrowException(){
        try{
            userValidator.phoneNumber(null);
        }
        catch (UserValidatorException e){
            Assert.assertEquals(UserValidatorException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    /*
     *Test case for exception
     */
    @Test
    public void givenPhoneNumber_WhenEmpty_ShouldThrowException(){
        try{
            userValidator.phoneNumber("");
        }
        catch (UserValidatorException e){
            Assert.assertEquals(UserValidatorException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    /*
     * If password is proper then this method should pass the asserttrue condition
     */
    @Test
    public void givenPassword1_WhenProper_ShouldReturnTrue(){
        boolean result = userValidator.password("Prasad@1234");
        Assert.assertTrue(result);
    }

    /*
     * If password is not proper then this method should pass the assertfalse condition
     */
    @Test
    public void givenPassword1_WhenNotProper_ShouldReturnFalse(){
        boolean result = userValidator.password("Pass12");
        Assert.assertFalse(result);
    }

    /*
     * If password is proper then this method should pass the asserttrue condition
     */
    @Test
    public void givenPassword2_WhenProper_ShouldReturnTrue(){
        boolean result = userValidator.password2("Prasad@123");
        Assert.assertTrue(result);
    }

    /*
     * If password is not proper then this method should pass the assertfalse condition
     */
    @Test
    public void givenPassword2_WhenNotProper_ShouldReturnFalse(){
        boolean result = userValidator.password2("prasad@123");
        Assert.assertFalse(result);
    }

    /*
     * If password is proper then this method should pass the asserttrue condition
     */
    @Test
    public void givenPassword3_WhenProper_ShouldReturnTrue(){
        boolean result = userValidator.password3("Prasad@123");
        Assert.assertTrue(result);
    }

    /*
     * If password is not proper then this method should pass the assertfalse condition
     */
    @Test
    public void givenPassword3_WhenNotProper_ShouldReturnFalse(){
        boolean result = userValidator.password3("Prasad@");
        Assert.assertFalse(result);
    }

    /*
     * If password is proper then this method should pass the asserttrue condition
     */
    @Test
    public void givenPassword4_WhenProper_ShouldReturnTrue(){
        boolean result = userValidator.password4("Prasad@123");
        Assert.assertTrue(result);
    }

    /*
     * If password is not proper then this method should pass the assertfalse condition
     */
    @Test
    public void givenPassword4_WhenNotProper_ShouldReturnFalse(){
        boolean result = userValidator.password4("Prasad@123@");
        Assert.assertFalse(result);
    }

    /*
     *Test case for exception
     */
    @Test
    public void givenPassword4_WhenNull_ShouldThrowException(){
        try{
            userValidator.password4(null);
        }
        catch (UserValidatorException e){
            Assert.assertEquals(UserValidatorException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    /*
     *Test case for exception
     */
    @Test
    public void givenPasswprd4_WhenEmpty_ShouldThrowException(){
        try{
            userValidator.password4("");
        }
        catch (UserValidatorException e){
            Assert.assertEquals(UserValidatorException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    /*
     * If email is proper then this method should pass the asserttrue condition
     */
    @Test
    public void givenEmail2_WhenProper_ShouldReturnTrue(){
        //created array list
        ArrayList<String> email = new ArrayList<>();
        System.out.println("-----Valid emails-----");
        email.add("abc@yahoo.com");
        email.add("abc-100@yahoo.com");
        email.add("abc.100@yahoo.com");
        email.add("abc111@abc.com");
        email.add("abc-100@abc.net");
        email.add("abc.100@abc.com.au");
        email.add("abc@1.com");
        email.add("abc@gmail.com.com");
        email.add("abc+100@gmail.com");
        for(String str : email) {
            boolean result = userValidator.email2(str);
            Assert.assertTrue(result);
        }
    }

    /*
     * If email is not proper then this method should pass the assertfalse condition
     */
    @Test
    public void givenEmail2_WhenNotProper_ShouldReturnTrue(){
        //created array list
        ArrayList<String> email = new ArrayList<>();
        System.out.println("-----Invalid emails-----");
        email.add("abc");
        email.add("abc..");
        email.add("abc..@gmail.com");
        email.add("abc@abc@gmail.com");
        email.add("abc@.com.my");
        email.add("abc123@gmail.a");
        email.add("abc123@.com");
        email.add("abc123@.com.com");
        email.add(".abc@abc.com");
        email.add("abc()*@gmail.com");
        email.add("abc..2002@gmail.com");
        email.add("abc.@gmail.com");
        email.add("abc@abc@gmail.com");
        email.add("abc@gmail.com.1a");
        email.add("abc..@gmail.com");
        email.add("abc@gmail.com.aa.au");
        for(String str : email) {
            boolean result = userValidator.email2(str);
            Assert.assertFalse(result);
        }
    }

    /*
     *Test case for happy mood
     */
    @Test
    public void givenMessage_WhenHappy_ShouldReturnEntrySuccessful(){
        String result = MoodAnalyser.analyseMood("happy");
        Assert.assertEquals("Entry successful", result);
    }

    /*
     *Test case for happy mood
     */
    @Test
    public void givenMessage_WhenSad_ShouldReturnEntryFailed(){
        String result = MoodAnalyser.analyseMood("sad");
        Assert.assertEquals("Entry failed", result);
    }
}

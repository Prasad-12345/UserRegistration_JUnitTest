package com.bridgelabz.junittesting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
}

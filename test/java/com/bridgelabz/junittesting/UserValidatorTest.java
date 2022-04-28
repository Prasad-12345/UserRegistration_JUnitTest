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
     * If first name is proper then this method shoud pass the asserttrue condition
     */
    @Test
    public void givenFirstName_WhenProper_ReturnTrue(){
        boolean result = userValidator.firstName("Prasad");
        Assert.assertTrue(result);
    }

    /*
     * If first name is not proper then this method shoud pass the assertfalse condition
     */
    @Test
    public void givenFirstName_WhenNotProper_ReturnFalse(){
        boolean result = userValidator.firstName("ma");
        Assert.assertFalse(result);
    }

    /*
     * If last name is proper then this method shoud pass the asserttrue condition
     */
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        boolean result = userValidator.lastName("Somvanshi");
        Assert.assertTrue(result);
    }

    /*
     * If last name is not proper then this method shoud pass the assertfalse condition
     */
    @Test
    public void givenLastName_WhenNotProper_ReturnFalse(){
        boolean result = userValidator.lastName("somvanshi");
        Assert.assertFalse(result);
    }
}

package com.bridgelabz.junittesting;

import org.junit.Assert;
import org.junit.Test;

/*
 *Author: Prasad
 */
public class UserValidatorTest {
    /*
     * If first name is proper then this method shoud pass the asserttrue condition
     */
    @Test
    public void givenFirstName_WhenProper_ReturnTrue(){
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.firstName("Prasad");
        Assert.assertTrue(result);
    }

    /*
     * If first name is not proper then this method shoud pass the assertfalse condition
     */
    @Test
    public void givenFirstName_WhenNotProper_ReturnFalse(){
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.firstName("ma");
        Assert.assertFalse(result);
    }
}
